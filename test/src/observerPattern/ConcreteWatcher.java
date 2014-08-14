package observerPattern;

/**
 *
 * 观察者模式
 * 
 * 4.具体观察者角色:该角色实现抽象观察者角色所有要求的更新接口，以便使本身的状态与主题状态相协调。
 *   如果需要，具体观察者角色可以保存一个指向具体主题角色的引用。通常用一个子类实现。
 *
 */

public class ConcreteWatcher implements Watcher
{
	public void update(String str)
	{
		System.out.println(str);
	}
}
