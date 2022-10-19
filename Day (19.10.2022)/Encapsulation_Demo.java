import java.util.Scanner;

public class Encapsulation_Demo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String stuname;
		int stupass, sid;
		int sub1, sub2, sub3, sub4, sub5;
		// user input using scanner
		System.out.println("Enter your name");
		stuname = s.nextLine();
		System.out.println("Enter your User_Id");
		sid = s.nextInt();
		System.out.println("Enter your Password");
		stupass = s.nextInt();

		System.out.println("Enter the marks of 5 subject");
		System.out.println("Enter the marks of sub1: ");
		sub1 = s.nextInt();
		System.out.println("Enter the marks of sub2: ");
		sub2 = s.nextInt();
		System.out.println("Enter the marks of sub3: ");
		sub3 = s.nextInt();
		System.out.println("Enter the marks of sub4: ");
		sub4 = s.nextInt();
		System.out.println("Enter the marks of sub5: ");
		sub5 = s.nextInt();

		Encap_Demo obj = new Encap_Demo();
		obj.set_name(stuname);
		obj.set_pass(stupass);
		obj.set_stu_id(sid);

		System.out.println("Name: " + obj.get_name());
		System.out.println("User iD: " + obj.get_stu_id());
		System.out.println("Password: " + obj.get_pass());
		obj.calc(sub1, sub2, sub3, sub4, sub5);
		System.out.println("Persentage: " + obj.persentage);

	}

}

class Encap_Demo { // fully encapsulated class
	// private data members
	private String student_name;
	private int studentuser_id;
	private int password;
	int total, persentage;

	// using getter method
	public String get_name() {
		return student_name;
	}

	public int get_stu_id() {
		return studentuser_id;
	}

	public int get_pass() {
		return password;
	}

	// using setter method
	public void set_name(String stu) {
		student_name = stu;
	}

	public void set_stu_id(int stu) {
		studentuser_id = stu;
	}

	public void set_pass(int stu) {
		password = stu;
	}

	// calc is a method to calculate total amrks
	public void calc(int sub1, int sub2, int sub3, int sub4, int sub5) {
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		persentage = total / 5; // finding persentage
		if (persentage >= 35 && persentage <= 45) {
			System.out.println("D grade");
		} else if (persentage >= 45 && persentage <= 55) {
			System.out.println("C grade");
		} else if (persentage >= 60 && persentage <= 75) {
			System.out.println("B grade");
		} else if (persentage >= 75 && persentage <= 85) {
			System.out.println("A grade");
		} else if (persentage >= 85 && persentage <= 100) {
			System.out.println("O grade");
		} else {
			System.out.println("Fail/Absent");
		}
	}
}