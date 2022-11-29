package sync;

public class DeadLock {
	public static void main(String[] args) {
		final String source1 = "Shifa";
		final String source2 = "Nisha";
		Thread t1 = new Thread() {
			public void run() {
				synchronized (source1) {
					System.out.println("t1 lock source1: ");
					try {
						Thread.sleep(200);
					} catch (Exception e) {

					}
					synchronized (source2) {
						System.out.println("t2 lock source2: ");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (source2) {
					System.out.println("t2 lock source2: ");
					try {
						Thread.sleep(200);
					} catch (Exception e) {

					}
					synchronized (source2) {
						System.out.println("t1 lock source1: ");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
