package test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Text1 = "Green India Clean India";
		String toLowerText1 = Text1.toLowerCase();
		int vCount = 0;
		char var;
		for (int i = 0; i < toLowerText1.length(); i++) {
			var = toLowerText1.charAt(i);
//			if (var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u') {
//				vCount = vCount + 1;
//			}
			
			switch(var) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':				
				vCount = vCount +1;
				break;
//			default :
//				System.out.println("No Vowels");
				
			}
		}
		System.out.println("Total no of vowels in the given string is " + vCount);

	}

}
