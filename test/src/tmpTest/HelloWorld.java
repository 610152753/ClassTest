package tmpTest;

public class HelloWorld
{
	public static void main(String[] args)
	{
		char c = 'жа';
		char g = 'Йњ';
		
		String f = null;
		
		
		System.out.println("Hello " + c + g + f);
		
		testA(-3);
	}
	
	public static void testA(int x){
		
		if(x>0){
			System.out.println("first!");
			
		}
		else if(x>-3){
			System.out.println("second !");
		}
		else{
			System.out.println("third !");
		}
	}
}
