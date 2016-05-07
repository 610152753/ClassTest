package decorator_Wrapper;

/**
 * 装饰角色（Decorator）：持有一个构件（Component）对象的引用，并定义一个与抽象构件接口一致的接口
 * 
 * @author Joe
 *
 */
public class Decorator implements Component 
{
	protected Component component;
	
	public Decorator(Component component)
	{
		this.component = component;
	}
	
	public void dosomething() {

		component.dosomething();
	}

}
