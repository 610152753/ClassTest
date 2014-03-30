package strategy;

/**
 * 
 *
 * �C 3����ʹ�ò��Զ�������б���һ���Բ��Զ�������á�
 * �C 4����ʹ�ò��Զ�������У�ʵ�ֶԲ��Զ����set��get������ע�룩����ʹ�ù��췽����ɸ�ֵ
 * 
 * @author JoePotter
 *
 */
public class Environment
{
	private Strategy strategy;

	/**
	 * 
	 * ��ʹ�ò��Զ�������б���һ���Բ��Զ��������
	 * 
	 * @param strategy
	 */
	public Environment(Strategy strategy){
		this.strategy = strategy;
	}
	
	
	/**
	 * 
	 * ��ʹ�ò��Զ�������У�ʵ�ֶԲ��Զ����set��get������ע�룩
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
