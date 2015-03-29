package threadTest;


/**
 * �ص�����
 * 
 * java�е�ÿ��������һ����(lock)���߽���������(monitor),������ĳ�������synchronized����ʱ
 * ����ʾ�����ö���������,��ʱ�����κ��̶߳��޷���ȥ���ʸ�synchronized�����ˣ�ֱ��֮ǰ���Ǹ��߳�ִ����Ϻ�
 * (�������쳣�׳���)����ô���ö�������ͷŵ��������̲߳��п�����ȥ���ʸ�synchronized������
 * 
 * ���һ�������ж��synchronized������ĳһʱ��ĳ���߳��Ѿ����뵽��ĳ��synchronized��������ô����
 * ��û��ִ�����ǰ�������߳����޷����ʸö�����κ�synchronized�����ġ�
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
		
		ex1 = new Example();  //����һ���µĶ���
		
		ThreadSynchronized2 ts1 = new ThreadSynchronized2(ex1);
		
		ts.start();
		ts1.start();
		
	}

}

/**
 * 
 * synchronized�Ƕ���ĵ�ǰʵ�����м�������ֹ�����߳�ͬʱ���ʸ���ĸ�ʵ��������synchronized�飬
 * ע�������ǡ���ĵ�ǰʵ������ ���������ͬʵ����û������Լ���ˡ���ôstatic synchronized
 * ǡ�þ���Ҫ�����������ʵ���ķ����ˣ�static synchronized�������߳�ͬʱ����jvm�и��������ʵ��ͬʱ���ʶ�Ӧ�Ĵ���졣
 * ʵ���ϣ�������ĳ������ĳ��������� synchronized����ô������һ������ʵ����
 * ����Ҳ����һ�����ӿ죬�����̲߳������ʸ�ʵ��synchronized�����죬
 * ��static synchronized�������и����ʵ������һ�����ӿ��ˣ�
 * Ҳ����������������,Ҳ����synchronized�൱�� this.synchronized����
 * static synchronized�൱��Something.synchronized.
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