package servidor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(5555);
		System.out.println("...Esperando...");
		Socket socket =server.accept();
		System.out.println("...Conexion Aceptada!...");
		
		InputStream  is= socket.getInputStream();
		InputStreamReader  isr= new InputStreamReader(is);
		BufferedReader br= new BufferedReader(isr);
		
		String msg= br.readLine();
		System.out.println(msg);
		Socket socket2 = new Socket("192.168.130.154", 5555);
		String msg2= "Hola desde el servidor";
		OutputStream os= socket2.getOutputStream();
		OutputStreamWriter osw =new OutputStreamWriter(os);
		BufferedWriter bw= new BufferedWriter(osw);
		bw.write(msg+"\n");
		bw.flush();
		while(true) {}
		
		
	}

}
