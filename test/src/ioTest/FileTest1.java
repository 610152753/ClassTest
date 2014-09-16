package ioTest;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:" + File.separator + "abc.txt" );
		
		boolean ret =  file.createNewFile();
		
		System.out.println(ret);
		
		
		File file1 = new File("D:" + File.separator + "aa","bb" + File.separator +  "test.tst");
		
	    ret = file1.createNewFile();
		
		System.out.println(ret);
		
	}
}
