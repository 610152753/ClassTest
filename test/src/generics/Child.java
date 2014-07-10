package generics;

public class Child<T1,T2,T3> extends Parent<T1,T2>
{
	private T3 foo3;

	public T3 getFoo3()
	{
		return foo3;
	}

	public void setFoo3(T3 foo3)
	{
		this.foo3 = foo3;
	}
	
	public static void main(String[] args)
	{
	    Child<String,Integer,String> child = new Child<String,Integer,String>();
	    
	    child.setFoo1("hello world");
	    child.setFoo2(new Integer(19));
	    child.setFoo3("wellcome!");
	    
	    System.out.println(" Foo1:" + child.getFoo1() + "\n Foo2:" + child.getFoo2() + "\n Foo3:" + child.getFoo3());
	}

}
