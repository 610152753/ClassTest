package collection;

import java.util.ArrayList;
import java.util.Collection;

public class BoxText
{
	public static void main(String[] args)
	{
		int a = 3;
		
		Collection<Integer> c = new ArrayList<Integer>();
	
		c.add(a + 2); 
		c.add(4); //将int类型的4转换为Integer类型并放到集合当中
		
		for(int element: c)
		{
			System.out.println(element);
		}
	}
	
}
