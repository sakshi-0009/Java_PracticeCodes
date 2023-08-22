package Map;
import java.util.*;

class Platform implements Comparable<Platform>{
	String str = null;
	int foundYr = 0;
	
	Platform(String str, int foundYr){
		this.str = str;
		this.foundYr = foundYr;
	}
	public String toString() {
		return str+" : "+foundYr;
	}
	public int compareTo(Platform obj) {
        int yearComparison = Integer.compare(this.foundYr, obj.foundYr);
        if (yearComparison == 0) {
            return this.str.compareTo(obj.str);
        }
        return yearComparison;
    }
}
class TreeMapDemo1 {

	public static void main(String[] args) {
        TreeMap<Platform, String> tm = new TreeMap<>();
		 tm.put(new Platform("Youtube",2005), "Google");
		 tm.put(new Platform("Insta",2005), "Meta");
		 tm.put(new Platform("ChatGPT",2005), "OpenAI");
		 tm.put(new Platform("Facebook",2005), "Meta");
		 
		 System.out.println(tm);
	}
}
