package map;

import java.util.HashMap;

public class MapTest2
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		map.put("a","zhangsan");
		map.put("b","zhangsan");
		
		System.out.println(map);

		System.out.println("-------------");
		
		String str = new String("lisi");
		
		map.put("a",str);
		map.put("b",str);
		
		System.out.println(map);
	}
}
