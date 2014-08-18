package observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * �۲���ģʽ
 *3.���������ɫ:�ھ��������ڲ�״̬�ı�ʱ�������еǼǹ��Ĺ۲��߷���֪ͨ�����������ɫ����
 *  һ������ʵ�֡�
 *
 */

public class ConcreteWatched implements Watched
{
	private List<Watcher> list = new ArrayList<Watcher>();

	public void addWatcher(Watcher watcher)
	{
		list.add(watcher);
		
		System.out.println("Add One Watcher !");

	}

	public void removeed(Watcher watcher)
	{
		list.remove(watcher);

	}

	public void notified(String str)
	{
		for(Watcher watcher : list)
		{
			watcher.update(str);
		}

	}

}
