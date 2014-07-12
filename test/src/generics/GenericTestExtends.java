package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GenericTestExtends<T>
{
	private  T foo;

	public T getFoo()
	{
		return foo;
	}

	public void setFoo(T foo)
	{
		this.foo = foo;
	}
	
	public static void main(String[] args)
	{
//		ֻ����List���������
		GenericTestExtends<? extends List> ge = null;
		
		//����ָ��ͬ��
		ge = new GenericTestExtends<ArrayList>();
		ge = new GenericTestExtends<LinkedList>();
		
//		ge = new GenericTestExtends<HashMap>();
		
//		ֻ����List���������
		GenericTestExtends<? super List> ge2 = null;
		
//		ge2 = new GenericTestExtends<ArrayList>();
		ge2 = new GenericTestExtends<Object>();
		
		GenericTestExtends<String> ge3 = new GenericTestExtends<String>();
		
		ge3.setFoo("hello world !");
		
//		GenericTestExtends<? extends Object> ge4 = ge3;  //��һ������һ��
		GenericTestExtends<?> ge4 = ge3;
		
		System.out.println(ge4.getFoo());
		
		ge4.setFoo(null);
		
		System.out.println(ge4.getFoo());
		
		/**
		 * ʹ��<��>����<? extends SomeClass>��������ʽ����ζ����ֻ��
		 * ͨ����������ȡ�����ο�ʵ������Ϣ���������Ƴ�ĳЩ��Ϣ����������������
		 * ��Ϣ����Ϊֻ֪�����з��õ���SomeClass�����࣬����һ����ʲô���ʵ��
		 * ��������������������Ϣ�������ǣ�������Լ�����Ϣ�Ļ�����ô���ɵļǵ�ȡ�ص�
		 * ʵ����ʲô���ͣ��ú�ת��Ϊԭ�������ͷ��ɽ��в��������ʧȥ��ʹ�÷��͵����塣
		 */
//		ge4.setFoo("welcome!");
		
		
	}

}
