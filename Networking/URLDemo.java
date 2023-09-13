package Networking;
import java.io.*;
import java.net.*;

public class URLDemo {

	public static void main(String[] args) throws IOException{
		URL obj = new URL("https://www.youtube.com");
		System.out.println(obj.getProtocol()); 		//https
		System.out.println(obj.getFile()); 			//
		System.out.println(obj.getPath()); 			//
		System.out.println(obj.getAuthority()); 	//www.youtube.com
		System.out.println(obj.getContent()); 		//sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@71a9b4c7
		System.out.println(obj.getPort()); 			//-1
		System.out.println(obj.getQuery()); 		//null
	}
}
