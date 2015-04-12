package singleTest;

/**
 * 对于单例模式（Singleton）来说，如果在getInstance()方法中生成Singleton实例则可能会产生同步问题，即可能会生成两个不同的对象。
 * 
 * 多线程的时候,在if判断的地方可能出现多次创建对象
 * 
 * @author Joe
 *
 */
public class SingleTon {
	
	public static void main(String[] args) {
		
		
		new MyThrad().start();
		new MyThrad().start();
	}
	
	private static SingleTon singleTon = null;
	
	private SingleTon(){};
	
	public static SingleTon getInstance()
	{
		if(null == singleTon)
		{
			try {
				Thread.sleep((long)Math.random()* 5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			singleTon = new SingleTon();
		}		
		return singleTon;
	}
}

class MyThrad extends Thread
{
	@Override
	public void run() {
		System.out.println(SingleTon.getInstance());
	}
}
