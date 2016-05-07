package innerClass;

/**
 *
 * 局部内部类(Local Inner Class)：定义在方法中，
 * 只能访问方法中的声明的final类型的变量
 * 
 *
 */
class Inner1{
	public void dosomething()
	{

		final int a = 4;
		
		//局部类:类似局部变量
		class LocalInner{
			
			public void test()
			{
				System.out.println("hello world !");
				System.out.println(a);
			}
		}
		new LocalInner().test();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		
		Inner1 inner = new Inner1();
		
		inner.dosomething();
	}
	
}
