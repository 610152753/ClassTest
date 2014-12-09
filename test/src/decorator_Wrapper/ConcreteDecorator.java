package decorator_Wrapper;

/**
 * ����װ�ν�ɫ��Concrete Decorator��������������������ϡ����ӵ����Ρ�
 * 
 * @author Joe
 *
 */
public class ConcreteDecorator extends Decorator 
{
	public ConcreteDecorator (Component component)
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
		System.out.println("����B");
	}

}
