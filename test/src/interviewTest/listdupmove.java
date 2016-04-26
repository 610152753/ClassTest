package interviewTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class listdupmove {
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] argx)
	{
		 List<String> listWithDup = new ArrayList<String>();
	        listWithDup.add("1");
	        listWithDup.add("2");
	        listWithDup.add("3");
	        listWithDup.add("1");
	 
	        List<String> listWithoutDup = new ArrayList<String>(new HashSet<String>(listWithDup));
	        System.out.println("list with dup:"+ listWithDup);
	        System.out.println("list without dup:"+ listWithoutDup);
	        
	        System.out.println("=========================");
			 List list = new ArrayList();
			 list.add("1");
			 list.add("2");
			 list.add("3");
			 list.add("1");
		 
		        List list2 = new ArrayList(new HashSet(list));
		        System.out.println("list with dup:"+ list);
		        System.out.println("list without dup:"+ list2);
	}

}
