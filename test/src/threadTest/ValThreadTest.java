package threadTest;

public class ValThreadTest {
	public static void main(String[] args) {
		
	HelloThread ht = new HelloThread();

	Thread t = new Thread(ht);
	Thread t1 = new Thread(ht);
	
	t.start();
	t1.start();
	
	System.out.println("==========================");
	
	t = new Thread(ht);
	
	t.start();
	
	ht = new HelloThread();
	
	t = new Thread(ht);
	
	t.start();
	
	
	}
}
/**
 * 
 * 注意：需要理解成员变量和局部变量的区别
 * 
 * @author Joe
 *
 */
class HelloThread implements Runnable
{
	int i = 0;
	
	public void run() 
	{
		int i = 0;
		while(true)
		{
//			System.out.println("number ： "  + i++);
			System.out.println("number ： "  + this.i++);
			try{
				Thread.sleep((long)Math.random() * 6000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
//			if(50 == this.i)
		    if(50 == this.i)
			{
				break;
			}
			
		}
	}
}