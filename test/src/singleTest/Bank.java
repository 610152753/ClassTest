package singleTest;

/*
 * 1.私有化构造方法
 * 2.提供共有的静态方法获取类的实例
 */
public class Bank
{
	//懒汉式
	private Bank()
	{
	}

	private static Bank bank = null;
	
	public static Bank getInstance()
	{
		if(bank == null)
		{
			bank = new Bank();
			
			System.out.println("Create one Instance !");
		}
		
		return bank;
	}
}
