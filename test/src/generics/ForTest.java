package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * 当遍历集合或数组时，如果需要访问集合或数组的下标，
 * 那么最好使用旧式的方式实现循环或遍历，而不要使用增强
 * 的for循环，因为它丢失了小标信息
 * 
 * @author JoePotter
 *
 */

public class ForTest
{
	public static void main(String[] args)
	{
		int[] arr = { 10, 22, 23, 54 };

		//旧式写法
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println("--------------------------");
		
		//新式写法 增强的FOR循环
		for(int element: arr)
		{
			System.out.println(element);
		}
		
		String[] arr1 = {"hello","world","apple"};
		System.out.println("--------------------------");
		
		for(String element: arr1){
			System.out.println(element);
		}
		
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] row: arr2)
		{
			for(int element: row)
			{
				System.out.println(element);
			}
			
		}
		System.out.println("--------------------------");
		
		Collection<String> col = new ArrayList<String>();
		
		col.add("one");
		col.add("two");
		col.add("there");
		
		for(String element: col)
		{
			System.out.println(element);
		}
		
		List<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i = 0; i < list.size(); i ++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------");
		
		for(Iterator<String> iter = list.iterator();iter.hasNext();)
		{
			System.out.println(iter.next());
		}
		
		System.out.println("--------------------------");
		
		for(String element: list)
		{
			System.out.println(element);
		}
		
		
	}

}
