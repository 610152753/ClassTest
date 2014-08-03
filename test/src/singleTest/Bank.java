package singleTest;

/*
 * 1.˽�л����췽��
 * 2.�ṩ���еľ�̬������ȡ���ʵ��
 */
public class Bank
{
	//����ʽ
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
