package innerClass;

/**
 *
 * �ڲ��� ����1
 * 
 *
 */

class Inner{
	
	private static int a = 4;
	
	public static class InnerClass{
	
		public void run()
		{
			System.out.println(a);
		}
	}
}

/**
 *
 *��̬�ڲ���(static inner calss): ֻ�ܷ����ⲿ��ľ�̬��Ա�����뾲̬���������ɾ�̬�ڲ���
 *����ķ�ʽΪ:
 *
 *OuterClass.InnerClass inner = new OuterClass.InnerClass();
 * 
 *
 */
public class StaticInnerClass {

	public static void main(String[] args) {
		
		Inner.InnerClass innera = new Inner.InnerClass();
		
		innera.run();
		
	}
	
}
