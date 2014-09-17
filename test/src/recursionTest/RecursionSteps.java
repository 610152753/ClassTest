package recursionTest;

public class RecursionSteps {
	
	
	public int Steps(int val)
	{
		if(val == 1)
		{
			return 1;
		}
		else 
		{
			return (Steps(val -1) * val);
		}
			
	}
	
	public static void main(String[] args) {
		
		RecursionSteps r = new RecursionSteps();
		
		System.out.println(r.Steps(4));
		
		
	}

}
