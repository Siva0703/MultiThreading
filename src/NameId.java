
public class NameId extends Thread{
	public void run()
	{
		System.out.println("thread is running..");
	}
	public static void main(String[] args) {
		NameId t1 = new NameId();
		NameId t2 = new NameId();
		System.out.println("Name of t1: "+t1.getName());
		System.out.println("Name of t2: "+t2.getName());
		System.out.println("id of t1: "+t1.getId());
		t1.start();
		t2.start();
		t1.setName("Sivakumar");
		System.out.println("After changing name of t1: "+t1.getName());
		
	}

}
