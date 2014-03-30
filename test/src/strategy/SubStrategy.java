package strategy;

/**
 * 
 * 2.编写策略类，该类实现了上面的公共接口
 * 
 * @author JoePotter
 *
 */
public class SubStrategy implements Strategy
{

	public int calculate(int a, int b)
	{
		return a - b;
	}

}
