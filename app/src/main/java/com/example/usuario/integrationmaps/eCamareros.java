package com.example.usuario.integrationmaps;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Martín Beitia on 17/10/2017.
 */

public class eCamareros extends AppCompatActivity {


    Button ok_bn;
    Integer numero;
    AlertDialog.Builder builder;
    EditText valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num_ecamareros);

        builder = new AlertDialog.Builder(eCamareros.this);

        ok_bn = (Button)findViewById(R.id.botonOK);
         valor = (EditText)findViewById(R.id.cajaNum);

        ok_bn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                numero = Integer.parseInt(valor.getText().toString());

                if(numero<=0 || !(numero instanceof Integer)){
                    builder.setTitle("Algo fue mal...");
                    builder.setMessage("Rellene el campo con un valor correcto");
                    displayAlert("input_error");
                }else{
                    Intent intent = new Intent(eCamareros.this, MailsPagadores.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("numero", numero);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
            }
        });



    }

    public void displayAlert(final String code){
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                if(code.equals("input_error")){
                    valor.setText("");
                } else {
                    finish();
                }

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
