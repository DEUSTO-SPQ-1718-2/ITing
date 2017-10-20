package com.example.usuario.integrationmaps;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nightonke.boommenu.Eases.Linear;

/**
 * Created by Martín Beitia on 17/10/2017.
 */

public class MailsPagadores extends AppCompatActivity {

    private LinearLayout parentLinearLayout;
    Button ok_bn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mails_ecamareros);
        ok_bn = (Button)findViewById(R.id.button2);
        Bundle bundle = getIntent().getExtras();
        final int variable = bundle.getInt("numero");

        parentLinearLayout = (LinearLayout) findViewById(R.id.showCajas);
        aniadir_conbucle(variable);

        ok_bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i =0; i<variable;i++){
                    EditText mail = (EditText)findViewById(R.id.cajaCorreo);
                    String cogerMail = mail.getText().toString();
                    //TODO: linkear con lo de Axi
                }
            }
        });

    }

    public void aniadir_conbucle(int variable){

        for(int i=0;i<variable;i++){

            System.out.println(i+"*********************************");
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final View rowView = inflater.inflate(R.layout.caja_mail, null);
            EditText a = (EditText)rowView.findViewById(R.id.cajaCorreo);
            a.setText("");
            // Add the new row before the add field button.
            parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount());
        }

    }
}
