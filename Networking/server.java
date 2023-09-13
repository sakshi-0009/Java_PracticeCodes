package Networking;

import java.net.*;
import java.io.*;

public class server {

	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(1200);
		Socket s = ss.accept();
		System.out.println("Connection Established!");
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);
		ps.print("Hello Client");
		ps.print("Welcome to networking!");
		
		ps.close();
		os.close();
		ss.close();
	}
}
