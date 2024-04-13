package com.ahilesh.apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {

    public Map<String,String> defaultHeaders(){

        Map<String,String> defaultHeaders= new HashMap<String,String>();
        defaultHeaders.put("Content-Type","application/json");

        return defaultHeaders;

    }

    public Map<String,String> headers_withToken(){

        Map<String,String> headers_withToken= new HashMap<String,String>();
        headers_withToken.put("Content-Type","application/json");
        headers_withToken.put("Access_Token","rljihuj");
        headers_withToken.put("jwt_token","kljlkjl");
        headers_withToken.put("Tenet_user","Test");
        return headers_withToken;

    }



}
