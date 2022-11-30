package filehandling;

import java.io.FileOutputStream;

//string to byte value
public class FileOutputStreamExample {
	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("D:\\test.txt"); // destination
			f.write(67);
			f.close();
			System.out.println("Done");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
