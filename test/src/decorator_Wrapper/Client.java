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
		
		//下面的方法和上面的方法实现的功能是一样的。
		System.out.println("||-------------------------------||");
		
		Component conponentAll = new ConcreteDecorator1(new ConcreteDecorator(new ConcreteConponent()));
		
		conponentAll.dosomething();
		
		
	}

}
