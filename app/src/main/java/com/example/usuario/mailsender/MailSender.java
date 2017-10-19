package com.example.usuario.mailsender;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by axi_e on 15/10/2017.
 */

public class MailSender {


    public MailSender(){}

    public boolean funciona(){

        try{
            GMailSender sender = new GMailSender("noreply.iting@gmail.com");
            sender.sendMail("Asunto", "<b>Cuerpoo</b>", "noreply.iting@gmail.com", "asier.elorza@opendeusto.es,axi.elorza15@gmail.com");
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
