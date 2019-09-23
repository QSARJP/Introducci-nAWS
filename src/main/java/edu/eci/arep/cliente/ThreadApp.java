package edu.eci.arep.cliente;

import java.io.*;
import java.net.URL;

 

public class ThreadApp extends Thread {

    private URL url;

    public ThreadApp(URL url){
        this.url = url;
    }

    @Override
    public void run(){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) { 
            String inputLine = null; 
            while ((inputLine = reader.readLine()) != null) { 
                System.out.println(inputLine); 
            } 
        } catch (IOException x) { 
                System.err.println(x); 
        }
    }





}