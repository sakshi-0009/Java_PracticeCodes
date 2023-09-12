package FileHandling;
import java.io.*;

class Player implements Serializable{
	int jerNo = 0;
	String pName = null;
	Player(int jerNo, String pName){
		this.jerNo = jerNo;
		this.pName = pName;
	}
}

public class SerilizationDemo {

	public static void main(String[] args) throws IOException {
		Player obj1 = new Player(18,"Virat");
		Player obj2 = new Player(7,"MSD");
		FileOutputStream fos = new FileOutputStream("PlayerData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(obj1);
		oos.writeObject(obj2);
		
		oos.close();
		fos.close();
	}
}
