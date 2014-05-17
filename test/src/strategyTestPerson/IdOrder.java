package strategyTestPerson;

import java.util.Comparator;

/**
 * ��id����
 * @author JoePotter
 *
 */
public class IdOrder implements Comparator<Person>
{
	public int compare(Person o1, Person o2)
	{
		return o1.getId() - o2.getId();
	}
    public String getMethodName()
    {
        return "��id����";
    }
}
