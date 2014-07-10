package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 在定义泛型类型时，预设可以使用任何的类型实例化泛型中的类型，
 * 但是如果想要限制使用泛型列别时，只能用某个特定类型
 * 或者是其子类型才能实例化该类型时，可以在定义类型时，
 * 使用extends关键字指定这个接口必须集成某个类，或者实现某个接口
 * @author JoePotter
 *
 * @param <T>
 */
public class ListGenericFoo<T extends List>
{
	private T[] fooArray;

	public T[] getFooArray()
	{
		return fooArray;
	}

	public void setFooArray(T[] fooArray)
	{
		this.fooArray = fooArray;
	}
	
	public static void main(String[] args)
	{
		ListGenericFoo<LinkedList> foo1 = new ListGenericFoo<LinkedList>();
		ListGenericFoo<ArrayList> foo2 = new ListGenericFoo<ArrayList>();
		
		LinkedList[] linkedList = new LinkedList[10];
		
		foo1.setFooArray(linkedList);
		
		ArrayList[] arrayList = new ArrayList[10];
		
		foo2.setFooArray(arrayList);
		
//		ListGenericFoo<HashMap> foo3 = new ListGenericFoo<HashMap>();
	}
	

}
