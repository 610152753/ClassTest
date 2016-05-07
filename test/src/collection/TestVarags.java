package collection;

public class TestVarags
{
	
	/**
	 * 
	 * 可变参数本质上就是一个数组，对于某个声明了可变参数的方法
	 * 来说，我们既可以传递离散的值，也可以传递数组对象，但如果将
	 * 方法中的参数定义为数组，那么只能传递数组而不能传递离散的值
	 * 
	 *可变参数必须要作为方法参数的最后一个参数，
	 *即一个方法不可能具有两个或者两个以上的可变参数
	 * @param nums
	 * @return
	 */
	private static int sum(int... nums)
	{
		int sum = 0;
		
		for(int element: nums)
		{
			sum = sum + element;
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		int result = sum(new int[] {1,3,3});
		
		System.out.println(result);
		 
		int result1 = sum(1,2,3,4);
		
		System.out.println(result1);
	}
}
