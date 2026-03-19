package com.ejemplo.app;

import com.ejemplo.framework.WebApp;

public class App {

    public static void main(String[] args) throws Exception {

        WebApp.staticfiles("webroot");

        WebApp.get("/hello", (req, res) ->
                "Hello " + req.getValues("name")
        );

        WebApp.get("/pi", (req, res) ->
                String.valueOf(Math.PI)
        );

        WebApp.start(8080);
    }
}