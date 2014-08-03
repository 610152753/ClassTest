package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * 
 * ����ͨ����Ĳ��������Ĺ��췽�������ɶ������������ַ�ʽ
 * 1.�Ȼ�ȡClass����Ȼ��ͨ����Class�����newInstance()����ֱ����������
 * 
 * 2.�Ȼ�ȡClass����Ȼ��ͨ���ö����ȡ��Ӧ��Constructor������ͨ����Constructor����
 * ��newInstance()��������
 * 
 * ����ͨ����Ĵ������Ĺ��췽�������ɶ��󣬼�����
 * 
 * �Ȼ�ȡClass����Ȼ��ͨ���ö����ȡ��Ӧ��Constructor(new Class[]{Long.class,String.class})������ͨ����Constructor����
 * ��newInstance(new Object[]{ 2,"hel"})��������
 * 
 * @author JoePotter
 *
 */
public class ReflecterTest
{
	//�÷���ʵ�ֶ�Customer����Ŀ�������
	
	public Object copy(Object object) throws Exception
	{
		
		Class<?> classType = object.getClass();
		
		System.out.println(classType);
		
		System.out.println("--------------------");
		
		System.out.println(classType.getName());
		
		Constructor cons = classType.getConstructor(new Class[]{});
		
		Object obj = cons.newInstance(new Object[]{});
		
		//�������д���ȼ�������һ��
		
		Object obj2 = classType.newInstance();
		
		System.out.println(obj);
		
		System.out.println("------------------------");
		
		System.out.println(obj2);
		
		
		System.out.println("---------------������");
		
		//��������
		
		Constructor cons1 = classType.getConstructor(new Class[]{Long.class,String.class});
		
		Object objreturn = cons1.newInstance(new Object[]{Long.parseLong("22"),"AAAA"});
		
		System.out.println(objreturn);
		
		Field[] fields = classType.getFields();
		
		for(Field field : fields)
		{
			
			String name = field.getName();
			
			String firstLetter = name.substring(0,1).toUpperCase();
			
			String GetMethodName = "get" + firstLetter + name.substring(1);
			String SetMethodName = "set" + firstLetter + name.substring(1);
			
			Method getMethod = classType.getMethod(GetMethodName, new Class[]{});
			Method setMethod = classType.getMethod(SetMethodName, new Class[]{field.getType()});
			
			Object value = getMethod.invoke(object,new Object[]{});
			setMethod.invoke(objreturn, new Object[] {value});
			
		}
		
		return objreturn;
	}
	
	public static void main(String[] args) throws Exception
	{
		
	    ReflecterTest reflecterTest = new ReflecterTest();
		System.out.println("==========��һ�ε���===============");
		Object ob1 =  reflecterTest.copy(new Customer());
	
		
		
		System.out.println(((Customer)ob1).getAge());
		System.out.println(((Customer)ob1).getName());
	
	
		System.out.println("=============�ڶ��ε���==============");
		
		
		Customer cus = new Customer(Long.parseLong("10"),"dddd");
		
		cus.setId(2L);
		cus.setAge(90);
		
		
		Object ob2 =  reflecterTest.copy(cus);
		
		System.out.println(((Customer)ob2).getAge());
		System.out.println(((Customer)ob2).getName());
		System.out.println(((Customer)ob2).getId());
	
	}

}

class Customer
{
	public Long Id;
	
	public String Name;
	
	public int Age;
	
	public Customer()
	{
		
	}

	public Customer(Long id,String Name)
	{
		this.Id = id;
		this.Name = Name;
	}

	public Long getId()
	{
		return Id;
	}

	public void setId(Long id)
	{
		Id = id;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

	public int getAge()
	{
		return Age;
	}

	public void setAge(int age)
	{
		Age = age;
	}

}

