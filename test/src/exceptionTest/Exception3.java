package exceptionTest;


/**
 * 
 *���ǿ���ʹ�ö��catch���������쳣����ʱ��Ҫ�������͵�catch��ŵ������͵�catch��֮��
 *�������ܱ�֤������catch����ܱ�ִ�У����������͵�catch����Զ�޷����java�������ᱨ
 *�������
 *
 *������catch����쳣�����Ƕ�����(MyException,MyException1),��ô˭ǰ˭�󶼿��Ե�
 * 
 */
public class Exception3
{
	public void method(String str) throws MyException,MyException1
	{
		if(null == str)
		{
			throw new MyException("������ַ�����������Ϊnull");
		}
		else if("hello".equals(str))
		{
			throw new MyException1("�����������:hello !");
		}else
		{
			System.out.println(str);
		}
	}
	
	
	public static void main(String[] args)
	{
		Exception3 e1 = new Exception3();
		try
		{
			e1.method("hello");
		}
		catch(MyException e)
		{
			System.out.println("����������null���쳣��before");
			e.printStackTrace();
			System.out.println("����������null���쳣��after ");
		}
//		catch(MyException1 e)
//		{
//			System.out.println("�����������hello���쳣��before");
//			e.printStackTrace();
//			System.out.println("�����������hello���쳣��after");
//		}
		catch(Exception e)
		{
			System.out.println("������Exception ��before");
			e.printStackTrace();
			System.out.println("������Exception ��before");
		}
		finally
		{
			System.out.println("���򼴽��������......");
		}
		
		System.out.println("��������ϣ�");
		
	
	}
}
