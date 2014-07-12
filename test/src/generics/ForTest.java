package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * ���������ϻ�����ʱ�������Ҫ���ʼ��ϻ�������±꣬
 * ��ô���ʹ�þ�ʽ�ķ�ʽʵ��ѭ�������������Ҫʹ����ǿ
 * ��forѭ������Ϊ����ʧ��С����Ϣ
 * 
 * @author JoePotter
 *
 */

public class ForTest
{
	public static void main(String[] args)
	{
		int[] arr = { 10, 22, 23, 54 };

		//��ʽд��
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println("--------------------------");
		
		//��ʽд�� ��ǿ��FORѭ��
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
