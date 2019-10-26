package com.training.restapi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.net.URL;


public class Application {
    public static void main(String args[]) throws IOException {

        //https://www.journaldev.com/2324/jackson-json-java-parser-api-example-tutorial
        //https://jsonplaceholder.typicode.com/


        URL url = new URL("https://jsonplaceholder.typicode.com/todos");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int status = con.getResponseCode();
        ObjectMapper mapper = new ObjectMapper();

        String response =  con.getResponseMessage();
//Feed feed = mapper.readValue(response.getEntity().getContent(), Feed.class);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);

        con.disconnect();
    }
}
