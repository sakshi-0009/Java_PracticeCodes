package BasicForWhile;

public class Factorial {

	public static void main(String[] args) {
		 int n = 6;
		 int mult = 1;
		 while(n!=0) {
			 mult = mult*n;
			 n--;
		 }
		 System.out.println(mult);
		 
		 System.out.println("-------");
		 
		 int N = 5;
		 int multi = 1;
		 for(int i=1; i<=N; i++) {
			 multi = multi*i;
		 }
		 System.out.println(multi);

	}
}
