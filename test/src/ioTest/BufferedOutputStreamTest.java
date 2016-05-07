package ioTest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferedOutputStreamTest {
	
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("1.txt");
		
		
		//缓冲输出流
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		bos.write("http://www.google.com".getBytes());
		
		bos.close();
//		
//		os.close();
		
	}

}
