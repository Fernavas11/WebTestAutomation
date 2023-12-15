package com.luegopago.utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;

public class Jsonfile {

    public static String getValue(String key){
        String result="";

        try {
            JsonParser parser = new JsonParser();
            Object obj = parser.parse(new FileReader("src/test/resources/variables.json"));
            JsonObject jsonObject = (JsonObject) obj;
            result=jsonObject.get(key).getAsString();
        }catch (Exception e){

        }
        return result;
    }
}
