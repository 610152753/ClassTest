package ioTest;

import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) throws Exception
	{
		String str = "hello world wolcome nihao hehe";
		
		char[] buffer = new char[str.length()];
		
		str.getChars(0, str.length(), buffer, 0);	
		
		FileWriter f = new FileWriter("FileWriteOutFile.txt");
		
		for(int i=0; i < buffer.length;i ++)
		{
			f.write(buffer[i]);
		}
		
		f.close();
	}
}
