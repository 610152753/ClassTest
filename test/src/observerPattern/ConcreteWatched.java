package observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 观察者模式
 *3.具体主题角色:在具体主题内部状态改变时，给所有登记过的观察者发出通知。具体主题角色常用
 *  一个子类实现。
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
