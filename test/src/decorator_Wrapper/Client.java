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
		
		//����ķ���������ķ���ʵ�ֵĹ�����һ���ġ�
		System.out.println("||-------------------------------||");
		
		Component conponentAll = new ConcreteDecorator1(new ConcreteDecorator(new ConcreteConponent()));
		
		conponentAll.dosomething();
		
		
	}

}
