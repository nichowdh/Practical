import java.io.FileReader;

//File Reader example
public class ReaderEx { // class

	public static void main(String[] args) { // main method
		try {
			FileReader f = new FileReader("D:\\test.txt"); // FileReader class
			int i;
			while ((i = f.read()) != -1) { // check while condition to read
				System.out.print((char) i);
			}
			f.close();
			System.out.println("Done"); // read function is done
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
