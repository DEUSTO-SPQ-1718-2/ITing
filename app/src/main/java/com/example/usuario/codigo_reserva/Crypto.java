package com.example.usuario.codigo_reserva;

import android.util.Log;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.spec.KeySpec;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class Crypto {

    private static final String TAG = Crypto.class.getSimpleName();

    public static final String PBKDF2_DERIVATION_ALGORITHM = "PBKDF2WithHmacSHA1";

    private static int KEY_LENGTH = 256;
    // minimum values recommended by PKCS#5, increase as necessary
    private static int ITERATION_COUNT = 1000;
    private static final int PKCS5_SALT_LENGTH = 8;

    private static SecureRandom random = new SecureRandom();

    private Crypto() {
    }


    public static SecretKey deriveKeyPbkdf2(byte[] salt, String password) {
        try {
            long start = System.currentTimeMillis();
            KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt,
                    ITERATION_COUNT, KEY_LENGTH);
            SecretKeyFactory keyFactory = SecretKeyFactory
                    .getInstance(PBKDF2_DERIVATION_ALGORITHM);
            byte[] keyBytes = keyFactory.generateSecret(keySpec).getEncoded();
            Log.d(TAG, "key bytes: " + toHex(keyBytes));

            SecretKey result = new SecretKeySpec(keyBytes, "AES");
            long elapsed = System.currentTimeMillis() - start;
            Log.d(TAG, String.format("PBKDF2 key derivation took %d [ms].",
                    elapsed));

            return result;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }


    public static byte[] generateSalt() {
        byte[] b = new byte[PKCS5_SALT_LENGTH];
        random.nextBytes(b);

        return b;
    }


    public static String toHex(byte[] bytes) {
        StringBuffer buff = new StringBuffer();
        for (byte b : bytes) {
            buff.append(String.format("%02X", b));
        }

        return buff.toString();
    }



}
