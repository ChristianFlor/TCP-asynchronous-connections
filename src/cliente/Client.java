package cliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	//ipCesar: 192.168.130.157 
	//Camilo : 192.168.130.154
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.130.154", 5555);
		System.out.println("Cliente conectado!");
		
		String msg= "Hola compa 452";
		OutputStream os= socket.getOutputStream();
		OutputStreamWriter osw =new OutputStreamWriter(os);
		BufferedWriter bw= new BufferedWriter(osw);
		bw.write(msg+"\n");
		bw.flush();
		

		InputStream  is= socket.getInputStream();
		InputStreamReader  isr= new InputStreamReader(is);
		BufferedReader br= new BufferedReader(isr);
		
		String msg2= br.readLine();
		System.out.println(msg2);
		while(true) {}
		
		
	}

}
