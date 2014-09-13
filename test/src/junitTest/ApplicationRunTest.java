package junitTest;

public class ApplicationRunTest {
	
	public void method1()
	{
		System.out.println("method1");
	}
	
	@AnnotationTestTool
	public void method2()
	{
		System.out.println("method1");
	}
	
	@AnnotationTestTool
	public int add(int a,int b)
	{
		return a + b;
	}
	
	
	@AnnotationTestTool
	public int add(int b)
	{
		return b + 10;
	}
	
	@AnnotationTestTool
	public void doSomething(String str)
	{
		System.out.println(str);
	}
	
	@AnnotationTestTool
	private void doSomething1()
	{
		System.out.println("doSomething1");
	}
	
	
}
