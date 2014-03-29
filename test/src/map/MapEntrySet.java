package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntrySet
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		for (int i = 0 ;i <10000; i++){
			
			map.put(new Integer(i),new Integer(i + 100));
		}
		
		long startTime=System.currentTimeMillis(); //��ȡ��ʼʱ��
		
		Set set = map.entrySet();
		
		for(Iterator iter = set.iterator();iter.hasNext();){
			
			Map.Entry entry = (Map.Entry)iter.next();
			
			Integer key = (Integer)entry.getKey();

			Integer value = (Integer)entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		
		long endTime=System.currentTimeMillis(); //��ȡ����ʱ��
		
		System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ms");
		
	}
}
