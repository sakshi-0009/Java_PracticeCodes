package Map;
import java.util.*;

class Platform implements Comparable{
	String str = null;
	int foundYr = 0;
	
	Platform(String str, int foundYr){
		this.str = str;
		this.foundYr = foundYr;
	}
	public String toString() {
		return str+" : "+foundYr;
	}
	public int compareTo(Object obj) {
		return this.foundYr - ((Platform)obj).foundYr;
	}
}

class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		 tm.put(new Platform("Youtube",2005), "Google");
		 tm.put(new Platform("Insta",2005), "Meta");
		 tm.put(new Platform("ChatGPT",2005), "OpenAI");
		 tm.put(new Platform("Facebook",2005), "Meta");
		 
		 System.out.println(tm);
	}
}
