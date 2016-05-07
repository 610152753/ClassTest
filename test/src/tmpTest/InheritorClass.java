package tmpTest;

public class InheritorClass
{
	
//	public InheritorClass(String str)
//	{
//		System.out.println(str);
//	}
	
	public InheritorClass()
	{
		System.out.println("hello !");
	}
	public void InheritorClass1()
	{
		System.out.println("hello !");
	}
	

}


class Inherited extends InheritorClass
{
    
	//默认继承不带参数的构造方法，如果父类的构造方法带有参数，此处必须重新定义构造方法
	
	
	
	public void invoke(){
     super.InheritorClass1();
	}
	
	
}