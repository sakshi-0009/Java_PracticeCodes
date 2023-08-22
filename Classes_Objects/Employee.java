package Classes_Objects;

public class Employee {
	String Emp_Name = "ABC";
	static int Emp_ID = 101;
	
	Employee(){
		System.out.println("Employee Details : ");
	}
	public void Salary() {
		System.out.println("180000");
	}
	public void Department() {
		System.out.println("Computer");	
	}	
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.print("Employee Name: ");
		System.out.println(emp.Emp_Name);
		
		System.out.print("Employee ID: ");
		System.out.println(emp.Emp_ID);
		
		System.out.print("Employee Salary: ");
		emp.Salary();
		
		System.out.print("Employee Department: ");
		emp.Department();
	}
}
