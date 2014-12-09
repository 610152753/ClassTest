package ioTest;

import java.io.IOException;
import java.io.InputStream;

public class MyOwnStream {
	
	public static void main(String[] args) throws IOException {
		
		byte[] b = new byte[16];
		
		for(int i = 0 ; i < b.length;i ++)
		{
			b[i] = (byte)i;
		}
		
		MyByteArrayInputStream mbai = new MyByteArrayInputStream(b);
		
		while(true)
		{
			int c = mbai.read();
			if(c < 0)
			{
				break;
			}
			System.out.print(c + "  ");

		}
		
		System.out.println();
		
		mbai.close();
	}
}
class MyByteArrayInputStream extends InputStream
{
	protected byte[] data;
	
	protected int prt = 0;
	
     /**
     *带参数的构造方法 
     * @param b
     */
	public MyByteArrayInputStream(byte[] b) {

		this.data = b;
	}
	
	@Override
	public int read() throws IOException {
		
		return (prt < data.length) ? (data[prt++]):-1;
	}
}
