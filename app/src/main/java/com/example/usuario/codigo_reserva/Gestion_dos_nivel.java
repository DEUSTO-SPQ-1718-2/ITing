package com.example.usuario.codigo_reserva;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.usuario.mailsender.MailSender;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

public class Gestion_dos_nivel extends Activity{

    private static final String TAG = Gestion_dos_nivel.class.getSimpleName();
    private static String MESSAGE="vamos";
    private String password = "012345";//Por eso he hecho un numero super aleatorio. Ya que con dos mismos passwords se puede llegar a entrar.
    //Por eso la aleatoriedad, ya que podría estar esperando al final del dia y el 0001 siempre siempre siempre caerá!
    ArrayList<Reserva> reservas;
    Reserva reserva;
    int contador=0;

    abstract class Encryptor {
        SecretKey key;

        abstract SecretKey deriveKey(String passpword, byte[] salt);

        abstract String encrypt(String plaintext, String password);

        abstract String decrypt(String ciphertext, String password);

        String getRawKey() {
            if (key == null) {
                return null;
            }

            return Crypto_dos_nivel.toHex(key.getEncoded());
        }
    }


    private final Encryptor PBKDF2_ENCRYPTOR = new Encryptor() {

        @Override
        public SecretKey deriveKey(String password, byte[] salt) {
            return Crypto_dos_nivel.deriveKeyPbkdf2(salt, password);
        }

        @Override
        public String encrypt(String plaintext, String password) {
            byte[] salt = Crypto_dos_nivel.generateSalt();
            key = deriveKey(password, salt);
            Log.d(TAG, "Generated key: " + getRawKey());

            return Crypto_dos_nivel.encrypt(plaintext, key, salt);
        }

        @Override
        public String decrypt(String ciphertext, String password) {
            return Crypto_dos_nivel.decryptPbkdf2(ciphertext, password);
        }
    };


    private String ciphertext1;
    String para_envio;
    ArrayList<String>mails;

    private Encryptor encryptor;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        System.out.println("tria!!!!!");
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        int intermedio;
        intermedio = bundle.getInt("pass");
        para_envio = bundle.getString("mails_formateado");
        mails=bundle.getStringArrayList("mails");
        int booleano= bundle.getInt("encriptar");

        MESSAGE = String.valueOf(intermedio);
        this.password = String.valueOf(intermedio);
        encryptor = PBKDF2_ENCRYPTOR;
        reservas = new ArrayList<>();
        System.out.println(booleano+"*^^^^^^^^^^^^^^^^^^^^^^^^^^");
        if(booleano==0){
            recuperar_reservas();
        }else{
            encriptar();
        }



    }


    abstract class CryptoTask extends AsyncTask<Void, Void, String> {

        Exception error;

        @Override
        protected void onPreExecute() {
        }

        @Override
        protected String doInBackground(Void... params) {
            try {
                return doCrypto();
            } catch (Exception e) {
                error = e;
                Log.e(TAG, "Error: " + e.getMessage(), e);

                return null;
            }
        }

        protected abstract String doCrypto();

        @Override
        protected void onPostExecute(String result) {
        String fallo="no";
            if (error != null) {
                Toast.makeText(Gestion_dos_nivel.this,
                        "Error: " + error.getMessage(), Toast.LENGTH_LONG)
                        .show();
                fallo ="si";
                return;
            }

            if(fallo.equals("no")){
                fallo= result;
            }
            updateUi(fallo);
        }

        protected abstract void updateUi(String result);
    }

    public void encriptar(){

        final String plaintext = MESSAGE;

        new CryptoTask() {

            @Override
            protected String doCrypto() {
                return encryptor.encrypt(plaintext, password);
            }

            @Override
            protected void updateUi(String ciphertext) {
                ciphertext1= ciphertext.toString().trim();
                update_DB();
                //recuperar_reservas();
            }
        }.execute();

        System.out.println(ciphertext1);
    }

    public void update_DB(){

        final String mesa_id="1";
        String URL_DATA = "http://192.168.1.106/phpss/insertar_reserva_newDB.php";

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_DATA,
                new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            //Si la response tiene el code negativo hacer bla bla bla...
                            System.out.println("VA A ENVIAR!!"+mails.size());
                            for(int i =0;i<mails.size();i++){
                                new MailSender("****", mails.get(i), "Lasarte", password).execute();
                                System.out.println(password);
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Algo ha ido mal", Toast.LENGTH_LONG).show();
                error.printStackTrace();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("cifrado_texto", ciphertext1 );
                params.put("mesa_id", mesa_id );
                return params;
            }
        };

        Mysingleton.getnInstance(this).addToRequestQue(stringRequest);

    }

    public void desencriptar(){
    System.out.println("llega" + reservas.size());
    for(int i =0; i< reservas.size();i++) {
        System.out.println("quiero que funciones");
        System.out.println(reservas.get(i).getCodigo());
        System.out.println(password);
        System.out.println("quiero que funciones");


        if (reservas.get(i).getCodigo().length() == 0) {

            return;
        }

        ciphertext1 = reservas.get(i).getCodigo();

        new CryptoTask() {

            @Override
            protected String doCrypto() {
                return encryptor.decrypt(ciphertext1, password);
            }



            protected void updateUi(String plaintext1) {
                if(plaintext1.equals("si")){
                    contador=contador+1;
                }
                else {
                    System.out.println("resultado"+plaintext1);
                    return;
                }
            }
        }.execute();
        System.out.println(contador);

        }
    }

    public void  recuperar_reservas(){
        System.out.println("no pasaaaaaaaa");
        String URL_DATA = "http://192.168.1.106/phpss/recuperar_reservas_newDB.php";
        System.out.println("no pasaaaaaaaa");
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_DATA,
                new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response) {

                        try {
                            System.out.println("que conio");
                            JSONArray jsonArray = new JSONArray(response);
                            for(int i =0;i<jsonArray.length();i++) {

                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                reserva =  new Reserva(
                                        jsonObject.getString("id"),
                                        jsonObject.getString("codigo"),
                                        jsonObject.getString("id_mesa")
                                );
                                reservas.add(reserva);
                            }

                            desencriptar();
                            System.out.println("que cojones");

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Algo ha ido mal", Toast.LENGTH_LONG).show();
                error.printStackTrace();
            }
        });
        Mysingleton.getnInstance(this).addToRequestQue(stringRequest);
    }
}
