//create object without new keyword
class AnotherClass { // Another cass
	// data members of another calss
	String name;
	int id;

	public class WithoutNew { // class
		public static void main(String[] args) { // main method
			try {
				// creating object using newInstance method
				AnotherClass o1 = AnotherClass.class.newInstance();
				AnotherClass o2 = AnotherClass.class.newInstance();
				AnotherClass o3 = AnotherClass.class.newInstance();
				AnotherClass o4 = AnotherClass.class.newInstance();
				AnotherClass o5 = AnotherClass.class.newInstance();
				o1.name = "A";
				o1.id = 10;
				o2.name = "B";
				o2.id = 20;
				o3.name = "C";
				o3.id = 30;
				o4.name = "D";
				o4.id = 40;
				o5.name = "E";
				o5.id = 50;
				// printing statement
				System.out.println("Name: " + o1.name + " Id: " + o1.id);
				System.out.println("Name: " + o2.name + " Id: " + o2.id);
				System.out.println("Name: " + o3.name + " Id: " + o3.id);
				System.out.println("Name: " + o4.name + " Id: " + o4.id);
				System.out.println("Name: " + o5.name + " Id: " + o5.id);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}
