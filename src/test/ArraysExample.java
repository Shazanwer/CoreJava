package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] List = new int[100];
		
		int num1[] = {10,20,30,50};
		System.out.println("Total no in the the array is " + num1.length);
		System.out.println(("Value at 3rd position is " + num1[2]));
		System.out.println(("Value at last position is " + num1[num1.length - 1]));
		
		String[] Texts = {"Text1", "Text2", "Text3", "Text4"};
		System.out.println("Total text in the the array is " + Texts.length);
		System.out.println(("Text at 3rd position is " + Texts[2]));
		System.out.println(("Text at last position is " + Texts[Texts.length - 1]));
		
		String Name = "Clean India Green India Love India";
		String[] arrName = Name.split(" ");  //to find total no of words
		System.out.println("Total No of Words in Name is " + arrName.length);
		System.out.println("Name at 3rd position is " + arrName[2]);
		
		}

	

}
