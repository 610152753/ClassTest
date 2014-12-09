package decorator_Wrapper;

/**
 * װ�ν�ɫ��Decorator��������һ��������Component����������ã�������һ������󹹼��ӿ�һ�µĽӿ�
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
