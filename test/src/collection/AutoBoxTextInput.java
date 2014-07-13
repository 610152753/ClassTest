package collection;

import java.util.HashMap;
import java.util.Map;

public class AutoBoxTextInput
{
	public static void main(String[] args)
	{

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String element : args)
		{
			map.put(element, (null == map.get(element) ? 1
					: map.get(element) + 1));
		}
		System.out.println(map);
	}
}
