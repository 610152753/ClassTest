package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1
{
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet(new MyObjComparator());
		Person p1 = new Person(10);
		Person p2 = new Person(20);
		Person p3 = new Person(30);
		set.add(p1);
		set.add(p2); 
		set.add(p3);
		
		System.out.println(set);
		for (Iterator iter = set.iterator(); iter.hasNext();)
		{
			Person pt = (Person)iter.next();
			System.out.println(pt.score);
		}
	}
}

class Person
{
	int score;

	public Person(int score)
	{
		this.score = score;
	}
}

class MyObjComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Person pa1 = (Person) o1;
		Person pa2 = (Person) o2;

		return pa1.score - pa2.score;
	}
}