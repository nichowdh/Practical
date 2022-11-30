package filehandling;

import java.io.FileOutputStream;

//byte from string 
public class FileOutputStreamEg {
	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("D:\\test.txt"); // destination
			String s = "welcome to Anudip foundation";
			byte b[] = s.getBytes();// converting string into byte array
			f.write(b);
			f.close();
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
