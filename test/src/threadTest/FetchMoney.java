package threadTest;

public class FetchMoney {

	public static void main(String[] args) {
		
		Bank bank = new Bank();  //一个新账户
		
		Thread t1 = new MoneyThread(bank); //柜台
		
//		bank = new Bank();
		
		Thread t2 = new MoneyThread(bank); //自动取款机
		
		t1.start();
		t2.start();

	}
}

//synchronized关键字：当synchronized关键字修饰一个方法的时候
//该方法叫做同步方法。

class Bank
{
	
	//加上static的修饰符可以实现多个用户公用同一个额度
//	private static int money = 1000;
	private int money = 1000;

	//在线程使用一个资源的时为其加上锁即可。访问资源的第一个线程为其加上锁以后
	//其他线程便不能在使用那个资源，除非被解锁。
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