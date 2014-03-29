package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class RandomNumberMap
{

	public static void main(String[] args)
	{

		Map map = new TreeMap(); // 有序(升序，自然顺序)的映像(Map)，key存放的是:随机数，value存放的是:随机数出现的次数

		List list = new ArrayList(); // 存放出现次数最多的那些数字

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

		Collection cols = map.values();

		Collection keyCol = map.keySet();

		Integer maxOccurs = (Integer) Collections.max(cols);

		Integer getKeyCol = (Integer) Collections.max(keyCol);

		// 遍历Map方法一
		// Set set = map.keySet();
		//
		// for (Iterator iterator = set.iterator(); iterator.hasNext();)
		// {
		//
		// Integer key = (Integer)iterator.next();
		//
		// Integer value = (Integer)map.get(key);
		//
		// System.out.println(key + ":" + value);
		//
		// }

		// 遍历Map方法二
		Set set = map.entrySet();

		for (Iterator iterator = set.iterator(); iterator.hasNext();)
		{

			Map.Entry entry = (Map.Entry) iterator.next();

			Integer key = (Integer) entry.getKey();

			Integer value = (Integer) entry.getValue();

			if (value.intValue() == maxOccurs.intValue())
			{
				list.add(key);
			}

			System.out.println(key + ":" + value);

		}

		System.out.println();

		System.out.println("---------------");

		System.out.println("出现的最多的次数为：" + maxOccurs.intValue());

		System.out.print("这些数字分别是:");

		for (Iterator iter = list.iterator(); iter.hasNext();)
		{
			System.out.print(iter.next() + "  ");
		}

		System.out.println();

		System.out.println("---------------");

		System.out.println("出现的最大的数字是：" + getKeyCol);
	}

}
