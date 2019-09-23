package edu.eci.arep.cliente;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int clientes = 10;
    public static URL url;

     
    public static void main(String[] args) throws Exception { 
        //https://salty-river-29279.herokuapp.com/
        url = new URL("https://salty-river-29279.herokuapp.com/"); 
        List<Thread> threads = new ArrayList<>();
        for (int i=0;i<clientes;i++){
            threads.add(new ThreadApp(url));
        }
        for (Thread i: threads){
            i.start();
        }
        
        for (Thread i: threads){
            i.join();
        }
        
        
      }
     
}
