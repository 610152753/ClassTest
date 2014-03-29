package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet trset = new TreeSet(new MyComparator());
		
		trset.add("G");
		trset.add("B");
		trset.add("C");
		trset.add("D");
		trset.add("A");
		trset.add("F");
		
		for(Iterator iter = trset.iterator();iter.hasNext(); )
		{
			System.out.println(iter.next());
		}
	}
}

class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = (String)o1;
		String s2 = (String)o2;
		
		return s2.compareTo(s1);
	}
}


















