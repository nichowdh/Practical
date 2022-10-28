//we can read only (only getter method)
//we can Write only (only setter method)
public class Read_WriteOnlyEncap {
	// private String name = "Niladri"; //private data member
	private String name;

	public void setName(String name) {
		this.name = name;
	}
//	public String getName() {
	// return name;
//	}

	public static void main(String[] args) {
		Read_WriteOnlyEncap obj = new Read_WriteOnlyEncap();
		// obj.set_name("Pallabi");
		// System.out.println("Name: " + obj.getName());
		System.out.println(obj.name);
	}
}
