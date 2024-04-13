package com.ahilesh;

import com.ahilesh.pojo.CredentialsPojo;
import com.ahilesh.utilities.JavaUtils;
import org.testng.annotations.Test;

@Test
public class EncodingTest {

    public void encodingTest() {
        CredentialsPojo loginCred= JavaUtils.base64Encode("admin","admin123");
        System.out.println("loginCred = " + loginCred);
    }
}
