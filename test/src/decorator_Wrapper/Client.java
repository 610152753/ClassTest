package decorator_Wrapper;

public class Client {
	
	public static void main(String[] args) {
		
		//节点流
		Component component = new ConcreteConponent();
		//过滤流
		Component component1 = new ConcreteDecorator(component);
		//过滤流
		Component component2 = new ConcreteDecorator1(component1);
		
		component2.dosomething();
		
	}

}
