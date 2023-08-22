package Map;
import java.util.*;

class Platform1{
	
	String str = null;
	int foundYr = 0;
	
	Platform1(String str, int foundYr){
		this.str = str;
		this.foundYr = foundYr;
	}
	public String toString() {
		return "{"+str+" : "+foundYr+"}";
	}
}

class SortByName implements Comparator{
	public int compare(Object obj1, Object obj2) {
		return ((Platform1)obj1).str.compareTo(((Platform1)obj2).str);
	}
}

class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new SortByName());
		 tm.put(new Platform1("Youtube",2005), "Google");
		 tm.put(new Platform1("Insta",2005), "Meta");
		 tm.put(new Platform1("ChatGPT",2005), "OpenAI");
		 tm.put(new Platform1("Facebook",2005), "Meta");
		 
		 System.out.println(tm);
	}
}
