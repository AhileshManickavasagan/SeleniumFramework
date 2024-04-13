package com.ahilesh.apibuilders;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class POSTAPIBuilders {

    public static Map<String, String> postrequestBody(int id,String title,String author) {
        Map<String, String> body = new HashMap<String, String>();

        body.put("id", Integer.toString(id));
        body.put("name", title);
        body.put("grade", author);



        return body;
    }
}
