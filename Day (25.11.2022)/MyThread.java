package a;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("name is " + Thread.currentThread().getName());
			try {
				Thread.sleep(2700);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		System.out.println("the job is over for " + Thread.currentThread().getName());
	}

}
