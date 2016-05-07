package enumeration.Test;


/**
 * 
 * 枚举类型实质上就是在定义一个类别，只不过很多细节由编译器帮您完成了。
 * 所以在某种程度上，enum关键字的作用就像class或interface。
 * 
 * 枚举(Enum):我们所定义的每个枚举类型都继承自java.lang.Enum类，枚举
 * 中的每个成员默认都是public static final的。
 * 
 * 每个枚举的成员就是您定义的枚举类型的一个实例(Instance)
 * 
 * @author JoePotter
 *
 */
public enum Color
{
	RED,WHITE,BULE, BLACK;

	public static void main(String[] args)
	{
		Color myColor = Color.BULE;
		
		System.out.println(myColor);
		
		System.out.println("------------------");
		
		for(Color c : Color.values())
		{
			System.out.println(c);
		}
		
	}
}
