package com.example.usuario.mailsender;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by axi_e on 15/10/2017.
 */

public class MailSenderTest {

    @Test
    public void correctMailSender() throws Exception{

        MailSender sender = new MailSender();

        Assert.assertTrue("Correct", sender.funciona());

    }
}
