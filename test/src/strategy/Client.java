package strategy;

public class Client
{
	public static void main(String[] args)
	{
		AddStrategy addStrategy = new AddStrategy();

		Environment environment = new Environment(addStrategy);

		System.out.println(environment.calculate(3, 4));

		SubStrategy subtractStrategy = new SubStrategy();

		environment.setStrategy(subtractStrategy);

		System.out.println(environment.calculate(3, 4));

		MultiplyStrtegy multiplyStrategy = new MultiplyStrtegy();

		environment.setStrategy(multiplyStrategy);

		System.out.println(environment.calculate(3, 4));

		DivideStrategy divideStrategy = new DivideStrategy();

		environment.setStrategy(divideStrategy);

		System.out.println(environment.calculate(3, 4));
	}
}
