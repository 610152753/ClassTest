package tmpTest;

public class BooleanTest
{
	public static void main(String[] args)
	{
		boolean bool = false;
		
		if(bool == true)
		{
			System.out.println("a");
		}
		else if(bool)
		{
			System.out.println("b");
		}
		else if(!bool)
		{
			System.out.println("c");
		}
		else
		{
			System.out.println("d");
		}
	}
}
