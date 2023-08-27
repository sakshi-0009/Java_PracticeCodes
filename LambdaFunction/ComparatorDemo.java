package LambdaFunction;
import java.util.*;
class Employee{
	String name = null;
	int empId = 0;
	Employee(String name, int empId){
		this.name = name;
		this.empId = empId;
	}
	public String toString() {
		return name +":"+ empId;
	}
}
public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Employee("Ashish",101));
		al.add(new Employee("kanha",104));
		al.add(new Employee("Rahul",102));
		al.add(new Employee("Badhe",105));
		al.add(new Employee("Shashi",103));
		
		Collections.sort(al,(obj1,obj2)->{
			return ((Employee)obj1).name.compareTo(((Employee)obj2).name);
		});
		System.out.println(al);
	}
}
