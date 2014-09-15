package innerClass;

import java.util.Date;

/*
 * 
 * 匿名内部类(Anonymous Inner Class):
 * 匿名内部类会隐士的继承一个父类或实现一个接口。
 * 
 */
public class AnonymousInnerClassTest {

	@SuppressWarnings("deprecation")
	public String get(Date a)
	{
		String str = a.toLocaleString();
		return str;
	}
	
	public static void main(String[] args) {
		
		AnonymousInnerClassTest test = new AnonymousInnerClassTest();
		
//		String str = test.get(new Date());
//		
//		System.out.println(str);
		
		String str = test.get(new Date(){
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public String toLocaleString()
			{
				return "hello world !";
			}
		});
		
		System.out.println(str);
	}
	
}
