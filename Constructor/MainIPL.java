package Constructor;

public class MainIPL {

	public static void main(String[] args) {
		IPL obj = new IPL();
		obj.Display1();
		
		System.out.println("---------------------------");
		obj.Display2();
		
		System.out.println("---------------------------");
		System.out.println("Total Teams : "+obj.Teams);
		System.out.println("Qualified Teams: "+obj.QualifiedTeams);
	}
}
