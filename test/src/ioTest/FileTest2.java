package ioTest;

import java.io.File;

public class FileTest2 {
	
	public static void main(String[] args) {
		File file = new File("D:/eclipse");
		
		String[] names = file.list();
		
		for(String name : names)
		{
			System.out.println(name);
			System.out.println(file.getParent());
		}
		
		File[] files = file.listFiles();
		
		for(File f : files)
		{
			System.out.println(f);
			System.out.println(f.getParent());
		}
	}

}
