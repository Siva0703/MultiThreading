class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

public class Multithread{
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.start();
		try{Thread.sleep(10);}
		catch(Exception e) {}
		b.start();
	}

}
