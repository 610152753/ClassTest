package strategyTestPerson;

import java.util.Comparator;

public class AgeReverseOrder implements Comparator<Person>
{
	public int compare(Person p1,Person p2)
	{
		int result = p2.getAge() - (p1.getAge());
		if( 0 == result)
		{
		  return p2.getId() - p1.getId();      //��������ͬ��id����
		}
		return result;
	}
	
	public String getMethodName(){
		return "����������";
	}

}
