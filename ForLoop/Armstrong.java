//Print whether Armstrong number or not :

package ForLoop;

public class Armstrong {

	public static void main(String[] args) {
		int n = 153;
		int temp1 = n;
		int temp2 = n;
		int count = 0;
		int sum = 0;
		
		while(n!=0) {
			count++;
			temp1 = temp1/10;
		}
		while(n != 0) {
			int rem = n%10;
			int mult = 1;
			for(int i=1;i<=count;i++) {
				mult = mult*rem;
			}
			sum = sum+mult;
			n = n/10;
		}
		if(sum == temp2) {
			System.out.println("Aremstring Number!");
		} else {
			System.out.println("Not Armstrong number!");
		}
	}
	
}
