package decorator_Wrapper;

public class Client {
	
	public static void main(String[] args) {
		
		//�ڵ���
		Component component = new ConcreteConponent();
		//������
		Component component1 = new ConcreteDecorator(component);
		//������
		Component component2 = new ConcreteDecorator1(component1);
		
		component2.dosomething();
		
	}

}
