package com.example.usuario.mailsender;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.io.IOException;
/**
 * Created by axi_e on 17/10/2017.
 */

public class onTokenAcquired extends Activity implements AccountManagerCallback<Bundle> {

    @Override
    public void run(AccountManagerFuture<Bundle> result) {
        // Get the result of the operation from the AccountManagerFuture.
        Bundle bundle = null;
        try {
            bundle = result.getResult();
        } catch (OperationCanceledException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AuthenticatorException e) {
            e.printStackTrace();
        }

        // The token is a named value in the bundle. The name of the value
        // is stored in the constant AccountManager.KEY_AUTHTOKEN.
       String token = bundle.getString(AccountManager.KEY_AUTHTOKEN);

        Intent launch = null;
        try {
            launch = (Intent) result.getResult().get(AccountManager.KEY_INTENT);
        } catch (OperationCanceledException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AuthenticatorException e) {
            e.printStackTrace();
        }
        if (launch != null) {
            startActivityForResult(launch, 0);
            return;
        }


    }

}
