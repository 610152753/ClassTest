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
			return p2.getId() - p1.getId();   //若姓名相同则按id排序
		}
		return result;
	}
	public String getMethodName(){
		return "按姓名逆序";
	}
}
