package innerClass;

import java.util.Date;

/*
 * 
 * �����ڲ���(Anonymous Inner Class):
 * �����ڲ������ʿ�ļ̳�һ�������ʵ��һ���ӿڡ�
 * 
 */
public class AnonymousInnerClassTest {

	@SuppressWarnings("deprecation")
	public String get(Date a)
	{
		String str = a.toLocaleString();
		return str;
	}
	
	public static void main(String[] args) {
		
		AnonymousInnerClassTest test = new AnonymousInnerClassTest();
		
//		String str = test.get(new Date());
//		
//		System.out.println(str);
		
		String str = test.get(new Date(){
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public String toLocaleString()
			{
				return "hello world !";
			}
		});
		
		System.out.println(str);
	}
	
}
