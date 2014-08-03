package annocationTest;

public class AnnocationUse
{
	
	@AnnocationTest(value="aaa",value1="a")
	public void method()
	{
		System.out.println("used of annocation !");
	}
	
	@AnnocationTest(value = "bb",value1 = "dd")
	public static void main(String[] args)
	{
		AnnocationUse usage = new AnnocationUse();
		
		usage.method();
	}

}
