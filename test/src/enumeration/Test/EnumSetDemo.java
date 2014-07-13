package enumeration.Test;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

enum FontConstant
{
	Plain, Bold,Italilc
}

public class EnumSetDemo
{
	public static void main(String[] args)
	{
		EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Bold,FontConstant.Plain);
		
		ShowEnumSet(enumSet);
		
		System.out.println("---------------");
		
		ShowEnumSet(EnumSet.complementOf(enumSet));
		
		System.out.println("----------------------");
		
		EnumSet<FontConstant> enumSet1 = EnumSet.noneOf(FontConstant.class);
		
		enumSet1.add(FontConstant.Bold);
		enumSet1.add(FontConstant.Plain);
		
		ShowEnumSet(enumSet1);
		
		System.out.println("--------------------------aaaa");
		
		List<FontConstant> list = new ArrayList<FontConstant>();
		
		list.add(FontConstant.Bold);
		list.add(FontConstant.Italilc);
		list.add(FontConstant.Plain);
		
		ShowEnumSet(EnumSet.copyOf(list));
	}
	
	public static void ShowEnumSet(EnumSet<FontConstant> enumset)
	{
		for(Iterator<FontConstant> iter = enumset.iterator();iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}
}
