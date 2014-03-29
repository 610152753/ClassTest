package collection;

import java.util.ArrayList;

public class ArrayList1
{
	public static void main(String[] args)
	{
		ArrayList arrayList1 = new ArrayList();
		
		arrayList1.add("Hello");
		
		arrayList1.add("world");
		
		arrayList1.add("world");
		
		arrayList1.add("welcome!");
		
		String s1 = (String)arrayList1.get(0);
		
		String s2 = (String)arrayList1.get(1);
		
		String s3 = (String)arrayList1.get(2);
		
		String s4 = (String)arrayList1.get(3);
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println(s3);
		
		System.out.println(s4);
		
		System.out.println("--------------");
		
		for(int i = 0;i < arrayList1.size(); i++) 
		{
			System.out.println(arrayList1.get(i));
		}
		
		//arrayList1.clear();
		
		System.out.println(arrayList1.size());
		
		System.out.println(arrayList1.isEmpty());
		
		arrayList1.remove(0);  //remove(object o)
		arrayList1.remove("welcome!");  //remove(object o)
		
		System.out.println("-----------");
		
		for(int i = 0; i < arrayList1.size(); i++)
		{
			System.out.println(arrayList1.get(i));
		}
		
		arrayList1.add("aaa");
		
		arrayList1.add("bbb");
		
		System.out.println(arrayList1.indexOf("worlddd"));
		
		System.out.println(arrayList1.indexOf("bbb"));
		
	}
}
