package com.ahilesh.utilities;

import com.ahilesh.pojo.CredentialsPojo;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Base64;
import java.util.Random;

public class JavaUtils {

    public static int randomnumber (){
        Random random= new Random();
        int randomNumber=random.nextInt(1000);

        return randomNumber;
    }

    public static String randomName(){
      String randomtitle=  RandomStringUtils.randomAlphabetic(5);
      return randomtitle;
    }

    public static CredentialsPojo base64Encode(final String username, final String password) {
        String cred = username + ":" + password;
        try {
            cred = Base64.getEncoder().encodeToString(cred.getBytes());

        } catch (Exception e) {

        }
         CredentialsPojo logincred=new CredentialsPojo();
        logincred.setCredential(cred);
        return logincred;

    }
}
