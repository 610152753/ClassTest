package collection;

import java.util.LinkedList;

public class StackList
{
	LinkedList stackList = new LinkedList();
	
	public void put(Object o)
	{
		stackList.add(o);
	}
	
	public Object get(){
		return stackList.removeLast();
	}
	
	public boolean isEmpty(){
		return stackList.isEmpty();
	}
	
	public static void main(String[] args)
	{
		StackList stackList = new StackList();
		
		stackList.put("one!");
		stackList.put("two!");
		stackList.put("three");
		
		System.out.println(stackList.get());
		System.out.println(stackList.get());
		System.out.println(stackList.get());
	}
	
}
