package com.training.restapi.connection;

public class BlogConnector extends AbstractHttpConnector {
    private static final String BLOG_URL =   "https://jsonplaceholder.typicode.com/todos";
    private static final String REQUEST_METHOD =   "GET";

    public BlogConnector() {
        super(BLOG_URL, REQUEST_METHOD);
    }

}
