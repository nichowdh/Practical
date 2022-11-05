public class Student { // main class
	// declaring instance variable
	int student_no;
	String student_name, student_Mail_id, student_add;
	double fees;
	// static method for increase Fee method
	static double increaseFees;

//creating constructor for asserting the details to student
	// passing values through overloaded constructor
	public Student(int student_no, String student_name, String student_Mail_id, String student_add) {
		this.student_name = student_name;
		this.student_no = student_no;
		this.student_Mail_id = student_Mail_id;
		this.student_add = student_add;
	}

//method for initializing fees to student
	public void fees(double f) {
		fees = f; // assigning passing value
	}

//method passing output
	public void display() {
		this.fees = this.fees + increaseFees;
		System.out.println(" No: " + student_no + " Name: " + student_name + " Mail: " + student_Mail_id + " Address: "
				+ student_add + " Fees: " + fees);
	}

	// increasing fees method
	static void increaseFees(int n, double f) {
		if (f < 2000) { // if condition
			f = 10 * f / 100;// logic for incrementing
			increaseFees = f;// assigning the value to static instance method
		}
	}

	public static void main(String[] args) { // main method
		// initializing Student type of array and declearing size
		Student[] s = new Student[5];
		// initializing objects of Student class & initializing it
		s[0] = new Student(101, "Niladri", "niladri@gmail.com", "WB");
		s[1] = new Student(102, "Avishek", "avishek@gmail.com", "Bihar");
		s[2] = new Student(103, "Soumya", "soumya@gmail.com", "Haryana");
		s[3] = new Student(104, "Misba", "misba@gmail.com", "Panjub");
		s[4] = new Student(105, "Nisha", "nisha@gmail.com", "Delhi");
		// adding fees value
		s[0].fees(1064);
		s[1].fees(2054);
		s[2].fees(957);
		s[3].fees(1999);
		s[4].fees(2001);
		// increasing fees whose is less than 2000
		increaseFees(101, 1064);
		increaseFees(103, 957);
		increaseFees(104, 1999);

		// traversing the array of student objects
		System.out.println("__________Details of Students__________");
		for (Student i : s) {
			i.display(); // traversing with invocation of display
		}

	}

}
