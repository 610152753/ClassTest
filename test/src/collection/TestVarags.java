package collection;

public class TestVarags
{
	
	/**
	 * 
	 * �ɱ���������Ͼ���һ�����飬����ĳ�������˿ɱ�����ķ���
	 * ��˵�����Ǽȿ��Դ�����ɢ��ֵ��Ҳ���Դ���������󣬵������
	 * �����еĲ�������Ϊ���飬��ôֻ�ܴ�����������ܴ�����ɢ��ֵ
	 * 
	 *�ɱ��������Ҫ��Ϊ�������������һ��������
	 *��һ�����������ܾ������������������ϵĿɱ����
	 * @param nums
	 * @return
	 */
	private static int sum(int... nums)
	{
		int sum = 0;
		
		for(int element: nums)
		{
			sum = sum + element;
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		int result = sum(new int[] {1,3,3});
		
		System.out.println(result);
		 
		int result1 = sum(1,2,3,4);
		
		System.out.println(result1);
	}
}
