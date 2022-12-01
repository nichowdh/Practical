package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyExample {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("E:\\test1.txt"); // Read
			FileOutputStream fout = new FileOutputStream("D:\\test.txt"); // write
			byte[] arr = new byte[1024];
			int l;
			while ((l = fin.read(arr)) > 0) {
				fout.write(arr);
			}
			fin.close();
			fout.close();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
