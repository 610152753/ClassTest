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

		Map map = new TreeMap(); // ����(������Ȼ˳��)��ӳ��(Map)��key��ŵ���:�������value��ŵ���:��������ֵĴ���

		List list = new ArrayList(); // ��ų��ִ���������Щ����

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

		// ����Map����һ
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

		// ����Map������
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

		System.out.println("���ֵ����Ĵ���Ϊ��" + maxOccurs.intValue());

		System.out.print("��Щ���ֱַ���:");

		for (Iterator iter = list.iterator(); iter.hasNext();)
		{
			System.out.print(iter.next() + "  ");
		}

		System.out.println();

		System.out.println("---------------");

		System.out.println("���ֵ����������ǣ�" + getKeyCol);
	}

}
