package reflection;

import java.lang.reflect.Method;

/**
 * 
 * 获取某个类或者某个对象所对应的Class对象的常用的三种方式
 * 1.使用Class类的静态方法：forName:Class.forName("java.lang.String");
 * 2.使用类的.class语法：String.class;
 * 3.使用对象的getClass()方法:String s = "aa"; 
 *   Class<?> class = s.getClass();
 * 
 * @author JoePotter
 *
 */
public class DumpMethods
{
	// 从命令行接受一个字符串(该字符串是某个类的全名)
	// 打印出该类中的所有方法申明
	public static void main(String[] args) throws ClassNotFoundException
	{
		//Class 类是java反射的入口点
		//获取类的class对象
		
//		Class<?> classType = Class.forName("java.lang.String"); 
		Class<?> classType = Class.forName(args[0]); 
			Method[] methods = classType.getDeclaredMethods();
			
			for(Method method : methods){
				
				System.out.println(method);
			}
	}
}
