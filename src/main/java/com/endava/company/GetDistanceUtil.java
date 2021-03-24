package com.endava.company;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetDistanceUtil {

    public double getDistance(String startPoint, String endPoint){
        double distance = 0;
        try {
            String sURL = "https://www.distance24.org/route.json?stops=%s|%s";
            sURL = String.format(sURL,startPoint, endPoint);
            URL url = new URL(sURL);
            URLConnection request = url.openConnection();
            request.connect();
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject rootobj = root.getAsJsonObject();
            distance = rootobj.get("distance").getAsDouble();

        }catch (java.io.IOException exception){
            System.err.println("File not found or unable to connect");

        }
        return distance;

    }


}
