package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Save the string1 to a result. ";
		String str2 = "\r\n";
		String str3 = "Save the string3 to a result. ";
		
		FileOutputStream file1;
		
		try {
			file1 = new FileOutputStream("result.txt", true);
			file1.write(str1.getBytes());
			file1.write(str2.getBytes());
			file1.write(str3.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
