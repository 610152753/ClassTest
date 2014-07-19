package enumeration.Test;

/**
 * 导入Common类中的静态成员变量和方法
 */
import static common.Common.AGE;
import static common.Common.output;

public class StaticImportTest
{
	public static void main(String[] args)
	{
		int a = AGE;
		
		System.out.println(a);
		
		output();
	}
}
