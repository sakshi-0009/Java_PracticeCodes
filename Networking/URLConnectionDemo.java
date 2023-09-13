package Networking;

import java.net.*;
import java.util.Date;
import java.io.*;

public class URLConnectionDemo {

	public static void main(String[] args) throws IOException{
		URL obj1 = new URL("https://youtube.com");
		URL obj2 = new URL("https://core2web.in");

		URLConnection conn1 = obj1.openConnection();
		System.out.println("Last Modified : "+new Date(conn1.getLastModified()));

		URLConnection conn2 = obj2.openConnection();
		System.out.println("Last Modified : "+new Date(conn2.getLastModified()));
	}
}
