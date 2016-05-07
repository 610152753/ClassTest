package ioTest;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 *字符流的操作文件
 * 
 * @author Joe
 *
 */

public class CharacterStreamTest {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("CharacterStreamTest.txt");
		
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		BufferedWriter bos = new BufferedWriter(osw);
		
		bos.write("www.baidu.com");
		bos.write("\n");
		bos.write("\n");
		bos.write("www.google.com");
		
		bos.close();
		
		FileInputStream fis = new FileInputStream("CharacterStreamTest.txt");
		
		InputStreamReader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		
		String str = br.readLine();
		
		while(null != str)
		{
			System.out.println(str);
			
			str = br.readLine();
		}
		
		br.close();
	}
}
