package observerPattern;

/**
 * 
 *�۲���ģʽ
 *
 *1.���������ɫ:�����жԹ۲��߶�������ñ�����һ�������У�ÿ�����������ɫ��������
 *  ���������Ĺ۲��ߡ����������ṩһ���ӿڣ��������Ӻ�ɾ���۲��߽�ɫ��һ����һ����������߽ӿ�ʵ�֡�
 *  
 */
public interface Watched
{
	public void addWatcher(Watcher watcher);
	
	public void removeed(Watcher watcher);
	
	public void notified(String str);
}
