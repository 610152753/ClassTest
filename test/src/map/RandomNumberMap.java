package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class RandomNumberMap
{

	public static void main(String[] args)
	{

		Map map = new TreeMap();

		Random random = new Random();

		for (int i = 0; i < 50; i++)
		{

			int number = random.nextInt(41) + 10;

			if (map.get(new Integer(number)) == null)
			{
				map.put(new Integer(number), new Integer(1));
			} else
			{
				Object object = map.get(new Integer(number));

				int count = ((Integer) object).intValue();

				count = count + 1;

				map.put(new Integer(number), new Integer(count));
			}

		}

		Set set = map.keySet();

		for (Iterator iterator = set.iterator(); iterator.hasNext();)
		{
			
			Integer key = (Integer)iterator.next();

			Integer value = (Integer)map.get(key);
			
			System.out.println(key + ":" + value);

		}

	}

}
