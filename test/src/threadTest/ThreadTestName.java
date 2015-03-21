package threadTest;

/**
 * 
 * Thread��Ҳʵ����Runnable�ӿڣ����ʵ����Runnable�ӿ��е�run������
 * 
 * ������һ���̶߳���ʱ�����û��Ϊ���趨���֣���ô�̵߳�����������ʽ:
 * 
 * Thread-number,��number�����Զ����ӵģ�
 * �������е�Thread����������(��Ϊ����static�ĳ�Ա����)��
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