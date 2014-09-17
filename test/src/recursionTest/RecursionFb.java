package recursionTest;

public class RecursionFb {
	
	
	
	public int fbMethod(int n)
	{
		
		if(n ==2 || n == 1)
		{
			return 1;
		}
		else
		{
			return fbMethod(n -2) + fbMethod(n -1);
		}
		
	}
	
	public static void main(String[] args) {
		
		RecursionFb fb = new RecursionFb();
		
		System.out.println(fb.fbMethod(4));
	}

}
