package innerClass;

/**
 *
 * �ֲ��ڲ���(Local Inner Class)�������ڷ����У�
 * ֻ�ܷ��ʷ����е�������final���͵ı���
 * 
 *
 */
class Inner1{
	public void dosomething()
	{

		final int a = 4;
		
		//�ֲ���:���ƾֲ�����
		class LocalInner{
			
			public void test()
			{
				System.out.println("hello world !");
				System.out.println(a);
			}
		}
		new LocalInner().test();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		
		Inner1 inner = new Inner1();
		
		inner.dosomething();
	}
	
}
