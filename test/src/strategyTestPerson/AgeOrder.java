package strategyTestPerson;

import java.util.Comparator;

public class AgeOrder implements Comparator<Person>
{
	public int compare(Person p1,Person p2)
	{
		int result = p1.getAge() - (p2.getAge());
		if( 0 == result)
		{
		  return p1.getId() - p2.getId();      //若年龄相同则按id排序
		}
		return result;
	}
	
	public String getMethodName(){
		return "按年龄正序";
	}

}
