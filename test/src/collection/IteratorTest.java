package collection;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest
{
	public static void main(String[] args)
	{
		HashSet set1 = new HashSet();
		
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("d");
		
//		Iterator iter = set1.iterator();
//		while(iter.hasNext()){
//			
//			String value = (String)iter.next();
//			
//			System.out.println(value);
//		}
		
		for(Iterator iter = set1.iterator();iter.hasNext();)
		{
			String value = (String)iter.next();
			
			System.out.println(value);
		}
	}
}
