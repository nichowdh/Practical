
//Write a Java program to read contents from a file into byte array.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileToByte {
	public static void main(String a[]) {
		String s = "Niladri";
		InputStream f = null;
		try {
			f = new FileInputStream("E:\\test1.txt");
			byte b[] = new byte[1024];
			int read = 0;
			while ((read = f.read(b)) > 0) {
				System.out.println(new String(b, 0, read - 1));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (f != null)
					f.close();
			} catch (Exception ex) {

			}
		}
	}

}
