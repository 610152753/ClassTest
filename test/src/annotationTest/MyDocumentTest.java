package annotationTest;

public class MyDocumentTest
{
	@MyDocumented("javadoc use")
	public void document()
	{
		System.out.println("My Document !!");
	}
	
	public static void main(String[] args)
	{
		MyDocumentTest t = new MyDocumentTest();
		
		t.document();
	}
}
