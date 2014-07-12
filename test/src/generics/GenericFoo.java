package generics;

/**
 * ��û��ָ�����ͼ̳е����ͻ�ӿ�ʱ��
 * Ĭ��ʹ�� T entends Object,����Ĭ��������κ����Ͷ�������Ϊ��������
 * @author JoePotter
 *
 * @param <T>
 */
public class GenericFoo<T>
{
	private T foo;

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
		GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
		GenericFoo<Integer> foo2 = new GenericFoo<Integer>();
		
		foo1.setFoo(new Boolean(true));
		foo2.setFoo(new Integer(3));
		
		Boolean b = foo1.getFoo();
		Integer i = foo2.getFoo();
		
		System.out.println(b);
		System.out.println(i);
		
//		foo2 = foo1;
		
		GenericFoo a = new GenericFoo();
		
		a.setFoo("String");
		
		String str = (String)a.getFoo();
		
		System.out.println(str);
		
		
	}
}
