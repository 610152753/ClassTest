package tmpTest;

public class SwitchTest
{
	public static void main(String[] args)
	{
		int i = 1, j = 1;
		
		switch(i)
		{
//		case 0,1 : j = 1;
		
		case 1 :j = -1; break;
		
		case 2 : j = 2; 
		
		default : j = 0;
		
		}
		
		System.out.println("j=" + j);
		
		System.out.println("------------------------");
		
		System.out.println("value = " + switchlt(2));
		
	}
	
	public static int switchlt(int x)
	{
		int j = 1;
		
		switch(x) 
		{
		case 1: j++;break;
		case 2: j++;
		case 3: j++;
		case 4: j++; 
		case 5: j++;
		default: j++;
		}
		System.out.println("j = "  + j);
		
		return j + x;
	}

}
