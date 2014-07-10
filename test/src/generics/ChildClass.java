package generics;

public class ChildClass<T1,T2> implements ParentInterface<T1,T2> 
{
	private T1 foo1;
	
	private T2 foo2;
	
	public ChildClass(T2 a){
		
		this.foo2 = a;
	}

	public void setFoo1(T1 foo1)
	{
		this.foo1 = foo1;
	}
	public void setFoo2(T2 foo2)
	{
		this.foo2 = foo2;
	}

	public T1 getFoo1()
	{
		return foo1;
	}

	public T2 getFoo2()
	{
		return foo2;
	}
	
	public static void main(String[] args)
	{
		ParentInterface<String,String> P = null;
		P = new ChildClass<String,String>("aaa");
		P.setFoo2("ljgla");
		
		System.out.println(P.getFoo2());
		
	}
	
	

}
