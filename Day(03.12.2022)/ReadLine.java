import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

//Write a Java program to read first 3 lines from a file.
public class ReadLine { // class

	public static void main(String[] args) { // main method
		BufferedReader b = null; // bufferreader class
		String s = " "; // blank string
		try {
			LineNumberReader l = new LineNumberReader(new InputStreamReader(new FileInputStream("D:\\test.txt")));// destination
			while (((s = l.readLine()) != null) && l.getLineNumber() <= 3) { // check the conditions
				System.out.println(s);
			}
			l.close();
		} catch (FileNotFoundException e) { // file not found exception
			System.err.println("File not found");
		} catch (IOException ae) { // input output exception
			System.err.println("Unable to Read file");
		}

	}

}
