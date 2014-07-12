package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * �ڶ��巺������ʱ��Ԥ�����ʹ���κε�����ʵ���������е����ͣ�
 * ���������Ҫ����ʹ�÷����б�ʱ��ֻ����ĳ���ض�����
 * �������������Ͳ���ʵ����������ʱ�������ڶ�������ʱ��
 * ʹ��extends�ؼ���ָ������ӿڱ��뼯��ĳ���࣬����ʵ��ĳ���ӿ�
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
