package threadTest;


/**
 * 重点理解★
 * 
 * java中的每个对象都有一个锁(lock)或者叫做监视器(monitor),当访问某个对象的synchronized方法时
 * ，表示将“该对象上锁”,此时其他任何线程都无法再去访问该synchronized方法了，直到之前的那个线程执行完毕后
 * (或者是异常抛出了)，那么将该对象的锁释放掉，其他线程才有可能再去访问该synchronized方法。
 * 
 * 如果一个对象有多个synchronized方法，某一时刻某个线程已经进入到了某个synchronized方法，那么现在
 * 在没有执行完毕前，其他线程是无法访问该对象的任何synchronized方法的。
 * 
 * @author Joe
 *
 */
public class ThreadSynchronizedTest 
{

	public static void main(String[] args) 
	{
		Example ex1 = new Example();
		
		ThreadSynchronized1 ts = new ThreadSynchronized1(ex1);
		
		ex1 = new Example();  //创建一个新的对象
		
		ThreadSynchronized2 ts1 = new ThreadSynchronized2(ex1);
		
		ts.start();
		ts1.start();
		
	}

}

/**
 * 
 * synchronized是对类的当前实例进行加锁，防止其他线程同时访问该类的该实例的所有synchronized块，
 * 注意这里是“类的当前实例”， 类的两个不同实例就没有这种约束了。那么static synchronized
 * 恰好就是要控制类的所有实例的访问了，static synchronized是限制线程同时访问jvm中该类的所有实例同时访问对应的代码快。
 * 实际上，在类中某方法或某代码块中有 synchronized，那么在生成一个该类实例后，
 * 改类也就有一个监视快，放置线程并发访问改实例synchronized保护快，
 * 而static synchronized则是所有该类的实例公用一个监视块了，
 * 也就是两个的区别了,也就是synchronized相当于 this.synchronized，而
 * static synchronized相当于Something.synchronized.
 * 
 * @author Joe
 *
 */
class Example 
{
	public static synchronized  void execute() throws InterruptedException 
	{
		for(int i = 0; i < 20; i ++)
		{
				Thread.sleep((long)1000);
				
				System.out.println("Example Execute : " + i );
		}
		
	}
	
	public synchronized void execute2() throws InterruptedException 
	{
		for(int i = 0; i < 20; i ++)
		{
//				Thread.sleep((long)Math.random()*1000);
				Thread.sleep((long)100);
				
				System.out.println("Example Execute1 : " + i );
		}
		
	}
	
}
class ThreadSynchronized2 extends Thread
{
	private Example example;
	
	public ThreadSynchronized2(Example e1) {
		this.example = e1;
	}
	
	@Override
	public void run() {
		try {
			example.execute2();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadSynchronized1 extends Thread
{
	private Example example;
	
	public ThreadSynchronized1(Example e1) {
		this.example = e1;
	}
	
	@Override
	public void run() {
		try {
			example.execute();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}