package generics;

public class WrapperFoo<T>
{
	private GenericFoo3<T> foo1;

	public GenericFoo3<T> getFoo1()
	{
		return foo1;
	}

	public void setFoo1(GenericFoo3<T> foo1)
	{
		this.foo1 = foo1;
	}
	
	public static void main(String[] args)
	{
		WrapperFoo<Integer> mainFoo = new WrapperFoo<Integer>();
		
		GenericFoo3<Integer> genericFoo = new GenericFoo3<Integer>();
		
		genericFoo.setFoo(new Integer(10));
		
		mainFoo.setFoo1(genericFoo);
		
		System.out.println(mainFoo.getFoo1().getFoo());
	}
	
}

class GenericFoo3<T>
{
	private T foo;

	public T getFoo()
	{
		return foo;
	}

	public void setFoo(T foo)
	{
		this.foo = foo;
	}
}
