package generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTestGeneric
{
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("10", "aaa");
		map.put("12", "dafg");
		map.put("14", "gaswde");
		map.put("15", "gasde");
		
		Set<String> set = map.keySet();
		
		for(Iterator<String> iter = set.iterator();iter.hasNext();){
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + "="+ value);
		}
		
		System.out.println("---------------------------------");
		
		Set<Map.Entry<String, String>> set2 = map.entrySet();
		
		for(Iterator<Map.Entry<String, String>> iter = set2.iterator();iter.hasNext();){
			
			Map.Entry<String, String> entry = iter.next();
			
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("key:" + key +"  value:" + value);
		}
		
	}
}
