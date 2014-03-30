package strategy;

/**
 * 
 *
 * – 3．在使用策略对象的类中保存一个对策略对象的引用。
 * – 4．在使用策略对象的类中，实现对策略对象的set和get方法（注入）或者使用构造方法完成赋值
 * 
 * @author JoePotter
 *
 */
public class Environment
{
	private Strategy strategy;

	/**
	 * 
	 * 在使用策略对象的类中保存一个对策略对象的引用
	 * 
	 * @param strategy
	 */
	public Environment(Strategy strategy){
		this.strategy = strategy;
	}
	
	
	/**
	 * 
	 * 在使用策略对象的类中，实现对策略对象的set和get方法（注入）
	 * 
	 * @return
	 */
	
	public Strategy getStrategy()
	{
		return strategy;
	}

	public void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int calculate(int a, int b){
		return strategy.calculate(a, b);
	}
}
