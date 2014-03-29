package collection;

import java.util.LinkedList;

public class QueueList
{
	LinkedList queueList = new LinkedList();

	public void put(Object o)
	{
		queueList.addLast(o);
	}

	public Object get()
	{
		return queueList.removeFirst();
	}

	public boolean isEmpth()
	{
		return queueList.isEmpty();
	}

	public static void main(String[] args)
	{
		QueueList queu = new QueueList();
		
		queu.put("one");
		queu.put("two");
		
		queu.get();
//		System.out.println(queu.get());
		
		queu.put("three");
		
		System.out.println(queu.get());
		System.out.println(queu.get());
		
		System.out.println(queu.isEmpth());
	}

}
