package observerPattern;

/**
 *
 * �۲���ģʽ
 * 
 * 4.����۲��߽�ɫ:�ý�ɫʵ�ֳ���۲��߽�ɫ����Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬������״̬��Э����
 *   �����Ҫ������۲��߽�ɫ���Ա���һ��ָ����������ɫ�����á�ͨ����һ������ʵ�֡�
 *
 */

public class ConcreteWatcher implements Watcher
{
	public void update(String str)
	{
		System.out.println(str);
	}
}
