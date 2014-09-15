package innerClass;


/**
 *
 * 内部类  分类2
 *
 * 若想在局部类中访问外部类的成员变量，语法:
 * 
 * OuterClass.this.a;
 * 
 *
 */
class MemberInner{
	
	private  int a = 4;
	
	public class MemInner{
		
		private int a = 3;
		
		public void dosomething()
		{
			System.out.println("MemInner :" + a);
			System.out.println("MemberInner :" + MemberInner.this.a);
		}
	}
	
	public void run(){
		
		MemInner inner = this.new MemInner();
		
		inner.dosomething();
		
	}
	
}

/**
 *
 * 成员内部类(member inner class): 可以访问外部类的静态与静态的方法与成员变量。
 * 
 * 生成成员内部类对象的方式为:
 * 
 * OuterClass.InnerClass inner = new OuterClass().new InnerClass();
 * 
 * 
 *
 */

public class MemberInnerClass {

	public static void main(String[] args) {
		
		MemberInner.MemInner memberInner = (new MemberInner()).new MemInner();
		
		MemberInner memberInner2 = new MemberInner();
		
		memberInner.dosomething();

		System.out.println("---------------------------");
		
		memberInner2.run();
		
	}
}
