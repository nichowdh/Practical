package a;

public class Main {

	public static void main(String[] args) {

		MyThread m = new MyThread();
		m.setName("nisha");
		m.start();// A thread becomes RUNNABLE

		for (int i = 0; i < 10; i++) {
			System.out.println(" main name is " + Thread.currentThread().getName());
			try {
				Thread.sleep(587);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		System.out.println("main the job is over for " + Thread.currentThread().getName());

	}

}
