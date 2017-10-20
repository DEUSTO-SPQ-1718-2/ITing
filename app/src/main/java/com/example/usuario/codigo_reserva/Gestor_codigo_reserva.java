package com.example.usuario.codigo_reserva;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.example.usuario.integrationmaps.R;

import java.math.BigInteger;
import java.util.ArrayList;

import javax.crypto.SecretKey;

public class Gestor_codigo_reserva extends Activity {

    private static final String TAG = Gestor_codigo_reserva.class.getSimpleName();
    Button button;

    abstract class Encryptor {
        SecretKey key;

        abstract SecretKey deriveKey(String passpword, byte[] salt);

        abstract String encrypt(String plaintext, String password);

        abstract String decrypt(String ciphertext, String password);

        String getRawKey() {
            if (key == null) {
                return null;
            }

            return Crypto.toHex(key.getEncoded());
        }
    }


    private final Encryptor PBKDF2_ENCRYPTOR = new Encryptor() {

        @Override
        public SecretKey deriveKey(String password, byte[] salt) {
            return Crypto.deriveKeyPbkdf2(salt, password);
        }

        @Override
        public String encrypt(String plaintext, String password) {
            byte[] salt = Crypto.generateSalt();
            key = deriveKey(password, salt);
            Log.d(TAG, "Generated key: " + getRawKey());

            return "";
        }

        @Override
        public String decrypt(String ciphertext, String password) {
            return "";
        }
    };


    private Encryptor encryptor;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestor_codigo_reserva);

        encryptor = PBKDF2_ENCRYPTOR;
        button  = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                obtener_contenido();

            }
        });





    }

    public void comenzar_random(String texto){

        final String password = texto;
           /* if (password.length() == 0) {
                Toast.makeText(this, "Please enter a password.",
                        Toast.LENGTH_SHORT).show();
                return;
            }
*/
        final String plaintext = "";

        new CryptoTask() {

            @Override
            protected String doCrypto() {
                return encryptor.encrypt(plaintext, password);
            }

            @Override
            protected void updateUi(String ciphertext) {
                ArrayList<String> partes = new ArrayList<String>();
                ArrayList<Long> partes_numericas = new ArrayList<Long>();

                if(encryptor.getRawKey().length() % 8 == 0){
                    String tmp = encryptor.getRawKey();
                    for(int i = 0;i<8;i++){
                        partes.add(tmp.substring(0,8));
                        long value = new BigInteger(tmp.substring(0,8), 16).longValue();
                        partes_numericas.add(value);
                        tmp = tmp.substring(8,tmp.length());
                    }
                }

                ArrayList<Integer> numeros_final = new ArrayList<Integer>();
                for(int i = 0; i<partes_numericas.size();i++){
                    numeros_final.add(Integer.parseInt(Long.toString(partes_numericas.get(i)).substring(0,1)));
                }

                int tempo = numeros_final.get(6)+numeros_final.get(7);
                int tempo_1 = tempo % 10;
                numeros_final.set(5, tempo_1);
                numeros_final.remove(6);
                numeros_final.remove(6);
                int pasar=0;
                for (Integer i : numeros_final) { // assuming list is of type List<Integer>
                    pasar = 10*pasar + i;
                }
                System.out.println("NUMEOR ALEATORIO "+pasar);

                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Gestion_dos_nivel.class);
                Bundle b = new Bundle();
                b.putInt("pass", pasar);
                intent.putExtras(b);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplication().startActivity(intent);
            }
        }.execute();



    }

    public void obtener_contenido(){
        RelativeLayout rel = (RelativeLayout)findViewById(R.id.layout);
        String texto="";
        for( int i = 0; i < rel.getChildCount(); i++ )
            if( rel.getChildAt( i ) instanceof EditText )
                texto += ((EditText) rel.getChildAt( i )).getText();
        comenzar_random(texto);

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

            if (error != null) {
                Toast.makeText(Gestor_codigo_reserva.this,
                        "Error: " + error.getMessage(), Toast.LENGTH_LONG)
                        .show();

                return;
            }
            updateUi(result);
        }
        protected abstract void updateUi(String result);
    }


}
