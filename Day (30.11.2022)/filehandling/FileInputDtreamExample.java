package filehandling;

import java.io.FileInputStream;

//read single character
public class FileInputDtreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("E:\\test1.txt"); // destination
			int i = f.read();
			System.out.println((char) i); // convert it to character
			f.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
