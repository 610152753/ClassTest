package observerPattern;

/**
 * 
 *观察者模式
 *
 *1.抽象主题角色:把所有对观察者对象的引用保存在一个集合中，每个抽象主题角色都可以有
 *  任意数量的观察者。抽象主题提供一个接口，可以增加和删除观察者角色。一般用一个抽象类或者接口实现。
 *  
 */
public interface Watched
{
	public void addWatcher(Watcher watcher);
	
	public void removeed(Watcher watcher);
	
	public void notified(String str);
}
