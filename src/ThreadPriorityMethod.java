
public class ThreadPriorityMethod extends Thread{
	public void run()
	{
		System.out.println("Running thread name "+Thread.currentThread().getName());
		System.out.println("Running thread priority "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadPriorityMethod t1 = new ThreadPriorityMethod();
		ThreadPriorityMethod t2 = new ThreadPriorityMethod();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();

	}

}
