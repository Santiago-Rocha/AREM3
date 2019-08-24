package edu.escuelaing.arem.Datagramas;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.*;

public class DatagramTimeClient extends Thread {

	public static void main(String[] args) {
		byte[] sendBuf = new byte[256];
		String received= null;
		while (true) {
			try {
				DatagramSocket socket = new DatagramSocket();
				socket.setSoTimeout(5000);
				byte[] buf = new byte[256];
				InetAddress address = InetAddress.getByName("127.0.0.1");
				DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
				socket.send(packet);
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				received = new String(packet.getData(), 0, packet.getLength());
				System.out.println("Date: " + received);
				TimeUnit.SECONDS.sleep(5);
			} catch (SocketTimeoutException e) {
				System.out.println("Date: " + received);
				continue;
			} catch (SocketException ex) {
				Logger.getLogger(DatagramTimeClient.class.getName()).log(Level.SEVERE, null, ex);
			} catch (UnknownHostException ex) {
				Logger.getLogger(DatagramTimeClient.class.getName()).log(Level.SEVERE, null, ex);
			} catch (IOException ex) {
				Logger.getLogger(DatagramTimeClient.class.getName()).log(Level.SEVERE, null, ex);
			} catch (InterruptedException ex) {
				Logger.getLogger(DatagramTimeClient.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}