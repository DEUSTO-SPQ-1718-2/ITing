package com.example.usuario.integrationmaps;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nightonke.boommenu.Eases.Linear;

/**
 * Created by ALUMNO on 17/10/2017.
 */

public class MailsPagadores extends AppCompatActivity {

    private LinearLayout parentLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mails_ecamareros);
        Bundle bundle = getIntent().getExtras();
        int variable = bundle.getInt("numero");

        parentLinearLayout = (LinearLayout) findViewById(R.id.contenedor_mails);
        aniadir_conbucle(variable);

    }

    public void aniadir_conbucle(int variable){

        for(int i=0;i<variable;i++){

            System.out.println(i+"*********************************");
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final View rowView = inflater.inflate(R.layout.caja_mail, null);
            EditText a = (EditText)rowView.findViewById(R.id.cajaCorreo);
            a.setText(i);
            // Add the new row before the add field button.
            parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount());
        }

    }
}
