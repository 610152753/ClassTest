package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest_args
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		for (int i = 0; i < args.length; i++)
		{
			if ( map.get(args[i]) == null)
			{
				map.put(args[i],new Integer(1));
			}
			else{
				
				int int1 = ((Integer)map.get(args[i])).intValue();
				
				int1 = int1 + 1;
				
				map.put(args[i], new Integer(int1));
			}
		}
		
		Set set = map.keySet();
		
		for(Iterator iter = set.iterator();iter.hasNext();){
			
			String key = (String)iter.next();
			Integer value = (Integer)map.get(key);
			
			System.out.println(key + " = " + value);
		}
	}
}
