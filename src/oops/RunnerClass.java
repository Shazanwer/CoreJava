package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Employee Emp1 = new Employee();
//
//		Emp1.Name = "Shah";
//		Emp1.EmplID = 123;
//		Emp1.Salary = 12345;
//		
////		System.out.println(Emp1.Name);
//		Emp1.PrintName();
//
//		Employee Emp2 = new Employee();
//
//		Emp2.Name = "Anwer";
//		Emp2.EmplID = 123;
//		Emp2.Salary = 12345;
//		
////		System.out.println(Emp2.Name);		
//		Emp2.PrintName();
		
		Employee Emp1 = new Employee("Anwer", 001, 1000);
		Employee Emp2 = new Employee("Shah", 002, 1000);
		Emp1.PrintAll();
		Emp2.PrintAll();
		Employee Emp3 = new Employee("Shaz", 003);
		Emp3.PrintAll();
		
	}

}
