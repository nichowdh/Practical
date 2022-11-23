package thread;

//ecample of daemon thread exception
public class DaemonThreadEg extends Thread {
	public void run() {
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Daemon: " + Thread.currentThread().isDaemon());
		if (Thread.currentThread().isDaemon()) { // checking for Daemon thread
			System.out.println("I am Daemon");
		} else {
			System.out.println("i am user Thread");
		}

	}

	public static void main(String[] args) {
		DaemonThreadEg t1 = new DaemonThreadEg();
		DaemonThreadEg t2 = new DaemonThreadEg();
		t1.start();
		t1.setDaemon(true); // will throw exception
		t2.start();

	}

}
