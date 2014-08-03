package singleTest;

public class Bank1
{
	//¶öººÊ½
	private Bank1(){}
	
	private static Bank1  bank = new Bank1();
	
	public static Bank1 getInstance()
	{
		return bank;
	}

}
