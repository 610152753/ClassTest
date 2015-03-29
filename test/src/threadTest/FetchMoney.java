package threadTest;

public class FetchMoney {

	public static void main(String[] args) {
		
		Bank bank = new Bank();  //һ�����˻�
		
		Thread t1 = new MoneyThread(bank); //��̨
		
//		bank = new Bank();
		
		Thread t2 = new MoneyThread(bank); //�Զ�ȡ���
		
		t1.start();
		t2.start();

	}
}

//synchronized�ؼ��֣���synchronized�ؼ�������һ��������ʱ��
//�÷�������ͬ��������

class Bank
{
	
	//����static�����η�����ʵ�ֶ���û�����ͬһ�����
//	private static int money = 1000;
	private int money = 1000;

	//���߳�ʹ��һ����Դ��ʱΪ����������ɡ�������Դ�ĵ�һ���߳�Ϊ��������Ժ�
	//�����̱߳㲻����ʹ���Ǹ���Դ�����Ǳ�������
	public synchronized  int getMoney(int number)
	{
		if(number < 0)
		{
			return -1;
		}
		else if(number > money)
		{
			return -2;
		}else if(money <= 0)
		{
			return -3;
		}
		else
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			money = money - number;
			
			System.out.println("left money :" + money);
			
			return number;
		}
	}
}

class MoneyThread extends Thread
{
	
	private Bank bank;
	
	public MoneyThread(Bank bank)
	{
		this.bank = bank;
	}
	
	@Override
	public void run() {
	
		System.out.println(bank.getMoney(800));
	}
	
}