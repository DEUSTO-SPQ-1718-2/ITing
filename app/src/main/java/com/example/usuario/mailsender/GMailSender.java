package com.example.usuario.mailsender;

import android.accounts.AccountManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import java.security.Security;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Provider;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.util.ByteArrayDataSource;

/**
 * Created by axi_e on 15/10/2017.
 */

public class GMailSender extends javax.mail.Authenticator {

    private Session session;

    public GMailSender(String user){

//        this.user = user;
//        this.password = password;
//
//        Properties props = new Properties();
//        props.setProperty("mail.transport.protocol", "smtp");
//        props.setProperty("mail.host", mailhost);
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.port", "465");
//        props.put("mail.smtp.socketFactory.port", "465");
//        props.put("mail.smtp.socketFactory.class",
//                "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.socketFactory.fallback", "false");
//        props.setProperty("mail.smtp.quitwait", "false");
//
//        session = Session.getDefaultInstance(props, this);

        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "imap");
        props.setProperty("mail.host", "imap.gmail.com");
        props.put("mail.imap.port", "993");
        props.put("mail.imap.ssl.enable", "true"); // required for Gmail
        props.put("mail.imap.auth.mechanisms", "XOAUTH2");

        session = Session.getInstance(props);
        Store store = null;
        try {
            store = session.getStore("imap");
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }

        if(store != null){

            try {
                store.connect("imap.gmail.com", user, "ya29.GlvnBPRDHOehywT7kH3Y4LzoriMVb2jajuP-XdqHwwE3ZvOFblkIEhYUKHSHFRduXdptxsAtYHsJh-xUrGb27-1jWQpm-uazU5g_nEFycTjvSLR3MhpxiskjBcFN");
                // Token expired, need to refresh it
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void sendMail(String subject, String body, String sender, String recipients) throws Exception {
        try{
            MimeMessage message = new MimeMessage(session);
            DataHandler handler = new DataHandler(new ByteArrayDataSource(body.getBytes(), "text/html"));
            message.setSender(new InternetAddress(sender));
            message.setSubject(subject);
            message.setDataHandler(handler);
            if(recipients.indexOf(',') > 0){
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipients));
            } else {
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipients));
            }
            Transport.send(message);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
