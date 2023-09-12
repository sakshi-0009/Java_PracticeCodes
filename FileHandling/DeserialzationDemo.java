package FileHandling;
import java.io.*;

public class DeserialzationDemo {

	public static void main(String[] args) throws IOException,ClassNotFoundException {

		FileInputStream fis = new FileInputStream("PlayerData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Player obj1 = (Player)ois.readObject();
		Player obj2 = (Player)ois.readObject();
		ois.close();
		fis.close();
		
		System.out.println("Jersey No : "+obj1.jerNo);
		System.out.println("Player name : "+obj1.pName);
		
		System.out.println("Jersey No : "+obj2.jerNo);
		System.out.println("Player name : "+obj2.pName);
	}
}
