
public class TestCallRun1 extends Thread{
	public void run()
	{
			System.out.println("thread running..");
	}

	public static void main(String[] args) {
		TestCallRun1 t = new TestCallRun1(); 
		t.run();						// it doesnot start a separate call stack
	}


}
