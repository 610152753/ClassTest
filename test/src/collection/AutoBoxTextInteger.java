package collection;


/**
 * 
 * Integer����һ�����棬���Ỻ�����-128~127֮���������
 * ���������Χ��ʱ����½�һ�����󣬷�����ʹ�û����еĶ���
 * ����˵100���ӡ��ȣ�128���ӡ����
 * 
 * @author JoePotter
 *
 */

public class AutoBoxTextInteger
{
	public static void main(String[] args)
	{
		Integer i1 = 128;
		Integer i2 = 128;
		
		if(i1 == i2)
		{
			System.out.println("i1 == i2");
		}
		else
		{
			System.out.println("i1 != i2");
		}
	}

}
