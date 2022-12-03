import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

//Read content from byte stream to object (De=serialization)
class Student implements Serializable { // serializable interface
	int id;
	String name;
	int fees;

	public Student(int id, String name, int fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

}

public class SerializationEg {// main class

	public static void main(String[] args) { // main method
		try {
			ObjectInputStream op = new ObjectInputStream(new FileInputStream("D:\\test.txt"));// destination
			Student s = (Student) op.readObject();
			System.out.println("id: " + s.id + " Name: " + s.name + " Fees: " + s.fees);
			op.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
