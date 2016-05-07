package innerClass;

/**
 *
 * 内部类 分类1
 * 
 *
 */

class Inner{
	
	private static int a = 4;
	
	public static class InnerClass{
	
		public void run()
		{
			System.out.println(a);
		}
	}
}

/**
 *
 *静态内部类(static inner calss): 只能访问外部类的静态成员变量与静态方法，生成静态内部类
 *对象的方式为:
 *
 *OuterClass.InnerClass inner = new OuterClass.InnerClass();
 * 
 *
 */
public class StaticInnerClass {

	public static void main(String[] args) {
		
		Inner.InnerClass innera = new Inner.InnerClass();
		
		innera.run();
		
	}
	
}
