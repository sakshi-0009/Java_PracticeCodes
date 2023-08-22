package Classes_Objects;

public class JEE {

	String Exam = "JEE Mains";
	public int Candidates = 2000;
	
	void Appeared_Exam() {
		String NextExam = "JEE Advance";
		System.out.println(Exam);
		System.out.println(Candidates);
		System.out.println(NextExam);
	}	
}
class JEE_Adv{
	public static void main(String[] args) {
		JEE obj = new JEE();
		obj.Appeared_Exam();
	}
}