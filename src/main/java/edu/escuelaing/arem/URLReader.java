package edu.escuelaing.arem;

import java.io.*;
import java.net.*;

public class URLReader {
    public static void main( String[] args ) throws Exception{
        URlMethods();
        browserReader();
    }

    public static void URlMethods() throws Exception{
        URL google = new URL("https://about.gitlab.com:8080/pricing/?prueba=p#ref");
        System.out.println(google.getProtocol());
        System.out.println(google.getAuthority());
        System.out.println(google.getHost());
        System.out.println(google.getPort());
        System.out.println(google.getPath());
        System.out.println(google.getQuery());
        System.out.println(google.getFile());
        System.out.println(google.getRef());
    }

    public static void browserReader() throws Exception{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese una direccion");
        System.out.println("Ejemplo: https://github.com/santiago-Rocha");
        URL url = new URL(br.readLine());
        String line =  null;
        br =  new BufferedReader(new InputStreamReader(url.openStream()));
        PrintWriter writer = new PrintWriter("prueba.html", "UTF-8");
        while((line = br.readLine()) != null){
            writer.print(line);
        }
        writer.close();
        System.out.println("El resultado fue guardado en prueba.html");
    }
}
