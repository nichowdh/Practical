package thread;

//with & without set name we can name the thread
//directly we can use thread class without extend
public class ThreadEg2 {
	public void run() {
		System.out.println("Nil");
	}

	public static void main(String[] args) {
		Thread t = new Thread("Niladri");
		Thread t1 = new Thread();
		t.start();
		t1.start();
		t1.setName("Anudip");
		System.out.println("thread 0: " + t.getName());
		System.out.println("thread 1: " + t1.getName());
	}
}
