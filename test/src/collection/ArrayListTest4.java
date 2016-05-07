package collection;

import java.util.ArrayList;

public class ArrayListTest4
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		
		Object[] in = list.toArray();
//		Integer[] in = (Integer[])list.toArray();
		/*
		 * 不能将Object[]转换为Integer[];
		 */
		
//		java.lang.Object; cannot be cast to [Ljava.lang.Integer;]
		for(int i = 0; i < in.length; i++){
			System.out.println(((Integer)in[i]).intValue());
		}
	}
}
