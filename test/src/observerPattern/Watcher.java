package observerPattern;

/**
 *
 * 观察者模式
 * 
 * 2.抽象观察者角色:为所有的观察者定义一个接口，在得到主题的通知时更新自己。
 * 
 *
 */
public interface Watcher
{
	public void update(String str);
}
