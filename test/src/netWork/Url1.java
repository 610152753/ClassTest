package netWork;

import java.io.IOException;
import java.net.URL;


/**
 * URL:ͳһ��Դ��λ��
 * 
 * @author Joe
 *
 */
public class Url1 {
	
	public static void main(String args[]) throws IOException
	{
		URL url = new URL("http://java.sun.com:80/docs/books/tutorial/index.html#DOWN");
		
		System.out.println("Protocol :" + url.getProtocol());
		
		System.out.println("Host :" + url.getHost());
		
		System.out.println("File :" + url.getFile());
		
		System.out.println("Port :"  + url.getPort());
		
		System.out.println("ref :" + url.getRef());
		
	}

}
