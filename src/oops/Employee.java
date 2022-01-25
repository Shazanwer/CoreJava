package oops;

public class Employee {
	
	String Name;
	int EmplID;
	int Salary;
	public static String CompanyName = "SimpliLearn"; //it will remain same throughout the execution of the program
	
	public Employee (String Name, int EmpID, int Salary) { //constructor should have same name as class and does not have any return type
		this.Name = Name;
		this.EmplID = EmpID;
		this.Salary = Salary;
	}
	
	public Employee (String Name, int EmpID) {
		this.Name = Name;
		this.EmplID = EmpID;
		
	}
	
	public void PrintAll()
	{
		System.out.println(Name);
		System.out.println(EmplID);
		System.out.println(Salary);
	}
	
	public static void ChangeCompanyName() {  //static variable cannot be changed from the other class so this method is created
		String CompanyName = "ABC Company";
	}

}
