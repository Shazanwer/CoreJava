package oops;

public class Child extends Person {
	
	public String Profession;
	public Child() {
		
		System.out.println("Inside Child class default constructor");
	}

	public Child(String Name, int Age, String Profession) {
		
		super(Name, Age);
		this.Profession = Profession;		
	}
	
	
	public void print() {
		
		System.out.println("inside child class");
		
	}
	
public void display() {
		
	    super.display();
		System.out.println("Inside Parent class");
		
	}
}
