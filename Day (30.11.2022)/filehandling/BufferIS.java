package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferIS {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("E:\\test1.txt"); // destination
			BufferedInputStream b = new BufferedInputStream(f);
			int i = 0;
			while ((i = b.read()) != -1) {
				System.out.print((char) i); // convert it to character
			}
			f.close();
			b.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
