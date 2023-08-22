package AccessSpecifiers;
public class Exam {

	String ExamName = "JEE Mains";
	int Candidates = 10000;
	
	static int CandidateID = 1001;
	
	void Display() {

		System.out.println("Exam Name: "+ExamName);
		System.out.println("Number of Candidates: "+Candidates);
		System.out.println("Candidate ID: "+CandidateID);
	}	
}
class MainExam{
	
	public static void main(String[] args) {
		Exam obj1 = new Exam();
		Exam obj2 = new Exam();
		
		obj1.Display();
		obj2.Display();
		
		System.out.println("---------------------");
		
		obj2.ExamName = "JEE Advance";
		obj2.Candidates = 2000;
		obj2.CandidateID = 75;
		
		obj1.Display();
		obj2.Display();
	}
}