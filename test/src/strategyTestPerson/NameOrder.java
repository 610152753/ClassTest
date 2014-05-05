package strategyTestPerson;

import java.util.Comparator;

public class NameOrder implements Comparator<Person>
{
	public int compare(Person p1,Person p2)
	{
		int result = p1.getName().compareTo(p2.getName());
		if( 0 == result)
		{
		  return p1.getId() - p2.getId();      //若姓名相同则按id排序
		}
		return result;
	}
	public String getMethodName(){
		return "按姓名正序";
	}
}
