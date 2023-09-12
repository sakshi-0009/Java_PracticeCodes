package FileHandling;
import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		File f = new File("Code.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("Java\n");
		fw.write("Flutter\n");
		fw.write("DSA\n");
		fw.write("Dart\n");
		fw.write("Python\n");
		fw.close();
	}
}
