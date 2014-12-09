package decorator_Wrapper;

/**
 * ����װ�ν�ɫ��Concrete Decorator��������������������ϡ����ӵ����Ρ�
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
		System.out.println("����C");
	}

}
