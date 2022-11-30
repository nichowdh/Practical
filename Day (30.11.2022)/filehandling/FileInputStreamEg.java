package filehandling;

import java.io.FileInputStream;

//read all characters from file
public class FileInputStreamEg {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("E:\\test1.txt"); // destination
			int i = 0;
			while ((i = f.read()) != -1) {
				System.out.print((char) i); // convert it to character
			}
			f.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
