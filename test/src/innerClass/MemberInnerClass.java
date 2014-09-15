package innerClass;


/**
 *
 * �ڲ���  ����2
 *
 * �����ھֲ����з����ⲿ��ĳ�Ա�������﷨:
 * 
 * OuterClass.this.a;
 * 
 *
 */
class MemberInner{
	
	private  int a = 4;
	
	public class MemInner{
		
		private int a = 3;
		
		public void dosomething()
		{
			System.out.println("MemInner :" + a);
			System.out.println("MemberInner :" + MemberInner.this.a);
		}
	}
	
	public void run(){
		
		MemInner inner = this.new MemInner();
		
		inner.dosomething();
		
	}
	
}

/**
 *
 * ��Ա�ڲ���(member inner class): ���Է����ⲿ��ľ�̬�뾲̬�ķ������Ա������
 * 
 * ���ɳ�Ա�ڲ������ķ�ʽΪ:
 * 
 * OuterClass.InnerClass inner = new OuterClass().new InnerClass();
 * 
 * 
 *
 */

public class MemberInnerClass {

	public static void main(String[] args) {
		
		MemberInner.MemInner memberInner = (new MemberInner()).new MemInner();
		
		MemberInner memberInner2 = new MemberInner();
		
		memberInner.dosomething();

		System.out.println("---------------------------");
		
		memberInner2.run();
		
	}
}
