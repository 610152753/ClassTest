package reflection;

import java.lang.reflect.Method;

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
