package ioTest;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilenameFilterTest {
	public static void main(String[] args) {
		
		File file = new File("D:/aaa");
		
//		String name[] = file.list();
//		
//		for(String na :name)
//		{
//			if(na.endsWith(".java"))
//			{
//				System.out.println(na);
//			}
//		}
		
		String[] names = file.list(new FilenameFilter() {
			
			public boolean accept(File dir, String name) {
				
				if(name.endsWith(".java"))
				{
					return true;
				}
				return false;
			}
		});
		
		for(String name : names)
		{
			System.out.println(name);
		}

	}
}
