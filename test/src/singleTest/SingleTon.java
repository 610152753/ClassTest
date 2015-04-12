package singleTest;

/**
 * ���ڵ���ģʽ��Singleton����˵�������getInstance()����������Singletonʵ������ܻ����ͬ�����⣬�����ܻ�����������ͬ�Ķ���
 * 
 * ���̵߳�ʱ��,��if�жϵĵط����ܳ��ֶ�δ�������
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
