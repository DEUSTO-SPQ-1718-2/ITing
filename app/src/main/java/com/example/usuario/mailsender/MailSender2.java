package com.example.usuario.mailsender;

import android.accounts.AccountManager;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by axi_e on 17/10/2017.
 */

public class MailSender2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        AccountManager am = AccountManager.get(this);
        Bundle options = new Bundle();

//        am.getAuthToken(
//                am.getAccountsByType(null),  // Account retrieved using getAccountsByType()
//                "Manage your tasks",            // Auth scope
//                options,                        // Authenticator-specific options
//                this,                           // Your activity
//                new onTokenAcquired(),          // Callback called when a token is successfully acquired
//                new Handler(new OnError()));    // Callback called if an error occurs
    }

}
