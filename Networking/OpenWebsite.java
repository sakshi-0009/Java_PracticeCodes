package Networking;
import java.io.*;
import java.net.*;
import java.awt.*;

public class OpenWebsite {

	public static void main(String[] args) throws IOException, URISyntaxException{
		
		URI obj = new URI("https://www.youtube.com");
		Desktop desk = Desktop.getDesktop();
		desk.browse(obj);
	}
}
