package com.training.restapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.training.restapi.connection.BlogConnector;

import java.io.IOException;

public class Application {
    public static void main(String args[]) throws IOException {

        //https://www.journaldev.com/2324/jackson-json-java-parser-api-example-tutorial
        //https://jsonplaceholder.typicode.com/
        BlogConnector blogConnector = new BlogConnector();
        blogConnector.connect();
    }
}
