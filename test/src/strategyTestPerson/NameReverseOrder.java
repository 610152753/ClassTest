package strategyTestPerson;

import java.util.Comparator;

/**
 * 
 * @author JoePotter
 *
 */
public class NameReverseOrder implements Comparator<Person>
{
	public int compare(Person p1, Person p2){
		int result = p2.getName().compareTo(p1.getName());
		if(0==result){
			return p2.getId() - p1.getId();   //��������ͬ��id����
		}
		return result;
	}
	public String getMethodName(){
		return "����������";
	}
}
