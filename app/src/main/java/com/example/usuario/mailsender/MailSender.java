package com.example.usuario.mailsender;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by axi_e on 15/10/2017.
 */

public class MailSender {


    public MailSender(){}

    public boolean funciona(){

        try{
            GMailSender sender = new GMailSender("noreply.iting@gmail.com", "ItingPrueba14");

            String body = "<div><img src=\"cid:image\"></div>" +
                    "<div><h1><strong>&iexcl;Hola, nombre eCamarero!</strong></h1>\n" +
                    "<p><span style=\"font-size:16px;\">nombre emisor te ha asignado como eCamarero en el restaurante x.</span></p>\n" +
                    "<p><span style=\"font-size:16px;\">El <strong>c&oacute;digo de reserva</strong> es el siguiente: <strong>c&oacute;digo de reserva</strong></span></p>\n" +
                    "<p><span style=\"font-size:16px;\">&iexcl;Corre a confirmar tu asistencia a la app de Iting!</span></p>\n" +
                    "<p><span style=\"font-size:16px;\">Atentamente,</span></p>\n" +
                    "<p><span style=\"font-size:16px;\">---------</span></p>\n" +
                    "<p><em><span style=\"font-size:16px;\">Equipo de Iting</span></em></p></div>";

            sender.sendMail("[Iting] nombre del emisor te ha invitado a comer", body, "noreply.iting@gmail.com", "asier.elorza@opendeusto.es");
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
