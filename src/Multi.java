
public class Multi extends Thread		// java thread by extending Thread class
{ 
	public void run()
	{
		System.out.println("thread is running..");
	}
	public static void main(String[] args) {
		Multi m = new Multi();
		m.start();
		
	}

}
