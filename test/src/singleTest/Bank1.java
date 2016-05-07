package singleTest;

public class Bank1
{
	//饿汉式
	private Bank1(){}
	
	private static Bank1  bank = new Bank1();
	
	public static Bank1 getInstance()
	{
		return bank;
	}

}
