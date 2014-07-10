package generics;

public class Generic1<T>
{
	private T[] fooArray;

	public T[] getFooArray()
	{
		return fooArray;
	}

	public void setFooArray(T[] fooArray)
	{
		this.fooArray = fooArray;
	}
	
	public static void main(String[] args)
	{
		Generic1<Integer> a = new Generic1<Integer>();
		
		Integer[] integerA = {10,1,20};
		Integer[] integerB = null;
		
		a.setFooArray(integerA);
		integerB = a.getFooArray();
		for(int i = 0; i < a.getFooArray().length; i++)
		{
			System.out.println(integerB[i]);
		}
		
	}
	
	
	
}
