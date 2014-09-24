package ioTest;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {
	
	public static void main(String[] args) throws Exception {
		
		
		InputStream isInput = new FileInputStream("D:/aaa/221.txt");
		
		byte[] buffer = new byte[200];
		
		int length = 0;
		
		while(-1 != (length = isInput.read(buffer,0,200)))
		{
			String str = new String(buffer,0,length);
			
			System.out.println(str);
		}
		isInput.close();
	}

}
