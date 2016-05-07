package threadTest;

/**
 * 
 * Thread类也实现了Runnable接口，因此实现了Runnable接口中的run方法；
 * 
 * 当生成一个线程对象时，如果没有为其设定名字，那么线程的名字如下形式:
 * 
 * Thread-number,该number将是自动增加的，
 * 并被所有的Thread对象所共享(因为它是static的成员变量)。
 * 
 * 
 * @author Joe
 *
 */
public class ThreadTestName {
	
	public static void main(String[] args) {
		
		ThreadT1 tt = new ThreadT1("Frirst Thread ");
		ThreadT2 t1 = new ThreadT2();
		System.out.println(t1.getName());
		System.out.println(tt.getName());
		tt.start();
		t1.start();
		
	}

}
class ThreadT2 extends Thread
{
	@Override
	public void run()
	{
		for(int j = 1 ; j < 100 ; j ++)
		{
			System.out.println("Thread T1 " + j);
		}
		
	}
}

class ThreadT1 extends Thread
{
	public ThreadT1(String name) {
		super(name);
	}
	@Override
	public void run() {
	
		for(int i = 0 ; i < 100; i ++)
		{
			System.out.println("Thread Test !"  + i);
		}
	}
}