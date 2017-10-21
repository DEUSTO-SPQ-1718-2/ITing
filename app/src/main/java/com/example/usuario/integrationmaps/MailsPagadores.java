package com.example.usuario.integrationmaps;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nightonke.boommenu.Eases.Linear;

import java.util.ArrayList;

/**
 * Created by ALUMNO on 17/10/2017.
 */

public class MailsPagadores extends AppCompatActivity {

    private LinearLayout parentLinearLayout;

    //¿? Añadir evento botón enviar para link dorron

    Button boton_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mails_ecamareros);
        Bundle bundle = getIntent().getExtras();
        int variable = bundle.getInt("numero");
        System.out.println(variable+"****¡¡¡¡¡");

        //¿?

        boton_enviar = (Button)findViewById(R.id.button2);
        boton_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                obtener_contenido();

            }
        });

        parentLinearLayout = (LinearLayout) findViewById(R.id.showCajas);
        aniadir_conbucle(variable);

    }
    //¿?

    public void obtener_contenido() {

        String para_envio="";
        ArrayList<String> mails = new ArrayList<>();

        LinearLayout rel = (LinearLayout) findViewById(R.id.showCajas);
        String texto = "";
        System.out.println(rel.getChildCount() + "¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¡¡");
        for (int i = 0; i < rel.getChildCount(); i++){
            if (rel.getChildAt(i) instanceof LinearLayout) {
                System.out.println("pppppppppppppppp");
                LinearLayout a = (LinearLayout) rel.getChildAt(i);
                System.out.println("33333333333"+a.getChildCount());
                for(int b = 0;b<a.getChildCount();b++){
                    if (a.getChildAt(b) instanceof EditText) {
                        texto="";
                        texto += ((EditText) a.getChildAt(b)).getText();
                        //para_envio+=((EditText) a.getChildAt(i)).getText()+",";
                        mails.add(texto);

                    }
                }

            }
        }
        System.out.println(mails.size()+"9999");
        for(int z=0;z<mails.size();z++){
            texto+=mails.get(z);
        }
        //para_envio = para_envio.substring(0, para_envio.length() - 1);
        //¿?
        System.out.println("&&&&&&&&&&&&&&&&&&"+texto);
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), com.example.usuario.codigo_reserva.Gestor_codigo_reserva.class);
        Bundle b = new Bundle();
        b.putString("correos", texto);
        b.putString("mails_formateado", para_envio);
        b.putInt("encriptar",1);
        b.putStringArrayList("mails", mails);

        intent.putExtras(b);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplicationContext().startActivity(intent);


        //comenzar_random(texto);

    }

    public void aniadir_conbucle(int variable){

        for(int i=0;i<variable;i++){

            System.out.println(i+"*********************************");
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            System.out.println(i+"*********************************");
            final View rowView = inflater.inflate(R.layout.caja_mail, null);
            EditText a = (EditText)rowView.findViewById(R.id.cajaCorreo);
            //a.setText(i);
            // Add the new row before the add field button.
            parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount());
        }

    }
}
