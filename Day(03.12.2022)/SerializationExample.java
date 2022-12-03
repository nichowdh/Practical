import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serialization Example (Object output)
//Writing state of an onject into byte-stream

class Student implements Serializable {// implementing serializable interface
	int id;
	String name;
	int fees;

	public Student(int id, String name, int fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

}

public class SerializationExample {

	public static void main(String[] args) {
		try {
			Student s = new Student(101, "Niladri", 2000);
			FileOutputStream fout = new FileOutputStream("D:\\test.txt");
			ObjectOutputStream op = new ObjectOutputStream(fout);
			op.writeObject(s);
			op.close();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
