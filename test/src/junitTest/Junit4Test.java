package junitTest;

import org.junit.Test;
/**
 * Keep the bar green to keep the code clean
 * 
 * JUnit4��ִ��һ������
 * 
 *1.���Ȼ�ô��������Class����
 *2.ͨ��Class�����õ�ǰ���е�����public��������Ӧ��Mehtod���顣
 *3.������Method���飬ȡ��ÿһ��Method����
 *4.����ÿ��Method�����isAnnotationPresent(Test.class)�����жϵ��÷����Ƿ�Testע��������
 *�������Ϊtrue����ôʹ��method.invoke����ȥִ�и÷���������ִ�С�
 * 
 * ��Ԫ���Բ���Ϊ��֤�����ǶԵģ�����֤����û�д���
 * 
 * Writing Secure Code(��д��ȫ�Ĵ���) :Input is evil.
 *
 */
public class Junit4Test
{
	@Test
	public void j4Test()
	{
		System.out.println("This is From JUnit4 Test !");
	}

}
