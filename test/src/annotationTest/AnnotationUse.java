package annotationTest;

public class AnnotationUse
{
	
	@AnnotationTest(value="aaa",value1="a",value2=EnumTest.WELCOME)
	public void method()
	{
		System.out.println("used of annocation !");
	}
	
	@AnnotationTest(value1 = "dd")
	public static void main(String[] args)
	{
		AnnotationUse usage = new AnnotationUse();
		
		usage.method();
	}

}
