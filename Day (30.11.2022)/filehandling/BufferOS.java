package filehandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOS {
	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("D:\\test.txt"); // destination
			BufferedOutputStream b = new BufferedOutputStream(f);
			String s = "welcome to Coading world";
			byte b1[] = s.getBytes(); // converting string into byte array
			f.write(b1);
			f.close();
			b.close();
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
