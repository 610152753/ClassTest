package annotationTest;

@MyAnnotation(address= "beijing",world = "shanghai")
public class MyTest
{
	
	@MyAnnotation(address = "tianjing" , world = "hubei")
	@Deprecated
	@SuppressWarnings("unchecked")
	public void output()
	{
		System.out.println("This is OUTPUT!");
		
	}
	
	public static void main(String[] args)
	{
		MyTest test = new MyTest();
		
		test.output();
	}

}
