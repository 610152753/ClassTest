package collection;


/**
 * 
 * Integer类有一个缓存，它会缓存介于-128~127之间的整数。
 * 超过这个范围的时候会新建一个对象，否则是使用缓存中的对象，
 * 比如说100会打印相等，128会打印不等
 * 
 * @author JoePotter
 *
 */

public class AutoBoxTextInteger
{
	public static void main(String[] args)
	{
		Integer i1 = 128;
		Integer i2 = 128;
		
		if(i1 == i2)
		{
			System.out.println("i1 == i2");
		}
		else
		{
			System.out.println("i1 != i2");
		}
	}

}
