package strategyTestPerson;

import java.util.Comparator;

/**
 * °´idÄæĞò
 * @author JoePotter
 *
 */
public class IdReverseOrder implements Comparator<Person>
{
	public int compare(Person p1,Person p2)
	{
		return p2.getId() - p1.getId();
	}
	
    public String getMethodName()
    {
        return "°´idÄæĞò";
    }
}
