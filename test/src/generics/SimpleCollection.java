package generics;

public class SimpleCollection<T>
{
	private T[] objArr;
	
	private int index = 0;
	
	
	public static void main(String[] args)
	{
		SimpleCollection<Integer> objArr1 = new SimpleCollection<Integer>(20);
		
		for(int i = 0;i<=10 ;i ++)
		{
			objArr1.add(new Integer(i));
		}
		
		for(int i = 0; i<=10; i++)
		{
			System.out.println(objArr1.get(i));
		}
		
		System.out.println("Length :"+ objArr1.getLength());
	}
	
	
	
	public SimpleCollection()
	{
		objArr = (T[])new Object[10];
	}
	
	public SimpleCollection(int capacity)
	{
		objArr = (T[])new Object[capacity];
	}
	
	public void add(T t)
	{
		objArr[index++] = t;
	}
	
	public int getLength()
	{
		return this.index;
	}
	
	public T get(int i)
	{
		return objArr[i];
	}
	

	
}
