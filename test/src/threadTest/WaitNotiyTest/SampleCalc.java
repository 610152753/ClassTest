package threadTest.WaitNotiyTest;

public class SampleCalc {
	
	private int number;
	
	public synchronized void increase()
	{
//		if(0 != number)  //ֻ���������̵߳�ʱ��ʹ��if��Ϊ�жϣ�������̣߳�2�����ϵ�ʱ�򣩻�����쳣������:
		// ͬʱ����������ȴ�������һ��֪ͨ�����ѵ��̲߳�֪���ڵȴ��Ĺ����з�����ʲô��ȴ�����˺����Ĳ��������Ѻ�Ӧ����������ж�������
		while(0 != number) //
		{
			
			//���number����0��ʱ��ͻ����ȴ���״̬���ȴ�notify
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		number++;
		
		System.out.println(number);
		
		notify();
	}
	
	public synchronized void decrease()
	{
//		if(0 == number)
		while(0 == number)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		number--;
		
		System.out.println(number);
		
		notify();
	}
}
