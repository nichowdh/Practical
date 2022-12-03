import java.io.FileWriter;

//File Writer Example
public class WriterEg { // class

	public static void main(String[] args) { // main method
		try {
			FileWriter fw = new FileWriter("D:\\test.txt"); // FileWriter class
			fw.write("My Name is Niladri"); // write method
			fw.close();
			System.out.println("Done"); // read function is done
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
