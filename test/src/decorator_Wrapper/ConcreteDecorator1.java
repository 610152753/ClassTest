package decorator_Wrapper;

/**
 * 具体装饰角色（Concrete Decorator）：负责给构件对象“贴上”附加的责任。
 * 
 * @author Joe
 *
 */
public class ConcreteDecorator1 extends Decorator 
{
	public  ConcreteDecorator1 (Component component)
	{
		super(component);
	}
	
	@Override
	public void dosomething() {
		
		super.dosomething();
		this.anothing();
		
	}
	
	private void anothing()
	{
		System.out.println("功能C");
	}

}
