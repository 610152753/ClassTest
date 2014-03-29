package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest_keySet_Iterator
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		for (int i = 0 ;i <10000; i++){
			
			map.put(new Integer(i),new Integer(i + 100));
		}
		
		long startTime=System.currentTimeMillis(); //获取开始时间
		
		Set set = map.keySet();
		
		for(Iterator iter = set.iterator(); iter.hasNext();){
			
			Integer key = (Integer)iter.next();
			
			Integer value = (Integer)map.get(key);
			
			System.out.println(key + "=" + value);
		}
		
		long endTime=System.currentTimeMillis(); //获取结束时间
		
		System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
	}
}
