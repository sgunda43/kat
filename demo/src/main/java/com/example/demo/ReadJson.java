package com.example.demo;

import com.example.demo.models.Response;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadJson {

    //Here in this method we will read the json into Java objects
    public static Response getCMSConfig() throws IOException {
        Response response = null;

        URL url = null;
        try {
            url = new URL("https://www.att.com/msapi/idp-content-orchestration/v1/idpcms/sales/uf/homepage");
        InputStreamReader reader = new InputStreamReader(url.openStream());
            response = new Gson().fromJson(reader, Response.class);

        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return response;
    }
}