package edu.escuelaing.arem.Trigonometricas;
import java.net.*;
 import java.io.*;
 public class EchoServer {
  public static void main(String[] args) throws IOException {
   ServerSocket serverSocket = null;
   try {
    serverSocket = new ServerSocket(35000);
   } catch (IOException e) {
    System.err.println("Could not listen on port: 35000.");
    System.exit(1);
   }
   Socket clientSocket = null;
   try {
    clientSocket = serverSocket.accept();
   } catch (IOException e) {
    System.err.println("Accept failed.");
    System.exit(1);
   }
   PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
   BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
   String inputLine, outputLine="";
   String funMath = "cos";
   while ((inputLine = in .readLine()) != null) {
    System.out.println("Mensaje: "+inputLine);
    double numero = 0;
    try {
    	double mul = 1;
    	if(inputLine.contains("/")) {
    		String[] arr = inputLine.split("/");
    		inputLine = arr[1];
    		if(arr[0].equals("π")) mul = 180;
    	}
    	numero =  mul!= 1  ? mul/Double.parseDouble(inputLine) : Double.parseDouble(inputLine) ;
        double rad = Math.toRadians(numero);
    	switch(funMath) {
    	case "cos":
    		outputLine = Double.toString(Math.cos(rad));
    		break;
    	case "sin":
    		outputLine = Double.toString(Math.sin(rad));
    		break;
    	case "tan":
    		outputLine = Double.toString(Math.tan(rad));
    		break;
	    }
	    out.println("El "+funMath+" de "+numero+" es: "+ outputLine);
    }
    catch(NumberFormatException e) {
    	if(inputLine.substring(0, 4).equals("fun:")) {
        	funMath = inputLine.substring(4,7);
        	outputLine = "Cambio su funcion a "+ funMath;
        	out.println(outputLine);
    	}
    	else {
    		out.println("la funcion solicitada no existe");
    	}
    }
   }
   out.close(); in .close();
   clientSocket.close();
   serverSocket.close();
  }
 }