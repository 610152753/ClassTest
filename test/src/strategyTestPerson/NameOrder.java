package strategyTestPerson;

import java.util.Comparator;

public class NameOrder implements Comparator<Person>
{
	public int compare(Person p1,Person p2)
	{
		int result = p1.getName().compareTo(p2.getName());
		if( 0 == result)
		{
		  return p1.getId() - p2.getId();      //��������ͬ��id����
		}
		return result;
	}
	public String getMethodName(){
		return "����������";
	}
}
