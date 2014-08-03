package singleTest;

public class SingleTest
{
	public static void main(String[] args)
	{
		Bank bank = Bank.getInstance();
		
		System.out.println(bank);
		
		System.out.println("-------------------");
		
		Bank bank1 = Bank.getInstance();
		
		System.out.println(bank1);
		
		System.out.println("---------====----------");
		
		Bank1 bak1 = Bank1.getInstance();
		
		System.out.println(bak1);
		
		Bank1 bak2 = Bank1.getInstance();
		
		System.out.println(bak2);
		
	}
}
