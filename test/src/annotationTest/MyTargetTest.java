package annotationTest;


//@MyTarget("targetTest") --//The annotation @MyTarget is disallowed for this location
public class MyTargetTest
{
	@MyTarget("targetTest")
	public void target()
	{
		System.out.println("This  is Target Test!");
	}
	public static void main(String[] args)
	{
		MyTargetTest myTarget = new MyTargetTest();
		
		myTarget.target();
	}

}
