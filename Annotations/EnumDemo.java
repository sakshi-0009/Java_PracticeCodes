package Annotations;

enum Player{
	Rohit,
	MSDhoni,
	Virat,
	Shubhman;
}
public class EnumDemo {

	public static void main(String[] args) {
		Player p = Player.Virat;
		
		switch(p) {
			case Rohit:
				System.out.println("Sharma");
				break;
			case MSDhoni:
				System.out.println("India");
				break;
			case Virat:
				System.out.println("Anushka");
				break;
			case Shubhman:
				System.out.println("Sara");
				break;
			default:
				System.out.println("No Player Found");
		}
	}
}
