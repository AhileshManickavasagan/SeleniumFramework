package com.ahilesh.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;

public class ParseDynamicJson {

    public static void parseObject(JSONObject json,String key){
        System.out.println("json.has(key) = " + json.has(key));
        System.out.println("json.has(key) = " + json.get(key));
    }
    public static void getKey(JSONObject json,String key){
        boolean exist= json.has(key);
        Iterator<?> keys;
        String nextKeys;
        if(!exist){
            keys= json.keys();
            while(keys.hasNext()){
                nextKeys=(String) keys.next();
                try{
                    if(json.get(nextKeys) instanceof JSONObject){
                        if (exist==false){
                            getKey(json.getJSONObject(nextKeys),key);
                        }
                    }else if(json.get(nextKeys) instanceof JSONArray){
                        JSONArray jsonarray= json.getJSONArray(nextKeys);
                        for(int i=0;i<jsonarray.length();i++){
                            String jsonarrayString=jsonarray.get(i).toString();
                            JSONObject innerJsonObject=new JSONObject(jsonarrayString);
                            if (exist==false){
                                getKey(innerJsonObject,key);
                            }
                        }
                    }
                }catch (Exception e){

                }
            }
        }else{
            parseObject(json,key);
        }

    }

    public static void main(String[] args) {
        String inputJson ="{\n" +
                "\"claim_loss_type_cd\":\"TEL\",\n" +
                "\"claim_type\": \"002\",\n" +
                "\"claim_reason\":\"001\",\n" +
                "\"policynumber\":\"123456789\",\n" +
                "\"info\":{\n" +
                "  \"ApplicationContext\":{\n" +
                "    \"country\":\"US\"\n" +
                "    }\n" +
                "  }\n" +
                "}";

        JSONObject inputJsonObject=new JSONObject(inputJson);
        getKey(inputJsonObject,"country");
    }

}

