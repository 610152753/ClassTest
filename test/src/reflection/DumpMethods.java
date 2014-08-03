package reflection;

import java.lang.reflect.Method;

/**
 * 
 * ��ȡĳ�������ĳ����������Ӧ��Class����ĳ��õ����ַ�ʽ
 * 1.ʹ��Class��ľ�̬������forName:Class.forName("java.lang.String");
 * 2.ʹ�����.class�﷨��String.class;
 * 3.ʹ�ö����getClass()����:String s = "aa"; 
 *   Class<?> class = s.getClass();
 * 
 * @author JoePotter
 *
 */
public class DumpMethods
{
	// �������н���һ���ַ���(���ַ�����ĳ�����ȫ��)
	// ��ӡ�������е����з�������
	public static void main(String[] args) throws ClassNotFoundException
	{
		//Class ����java�������ڵ�
		//��ȡ���class����
		
//		Class<?> classType = Class.forName("java.lang.String"); 
		Class<?> classType = Class.forName(args[0]); 
			Method[] methods = classType.getDeclaredMethods();
			
			for(Method method : methods){
				
				System.out.println(method);
			}
	}
}
