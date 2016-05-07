package ioTest;

import java.io.IOException;
import java.io.InputStream;

public class MyOwnStream1 extends InputStream
{	
	
	protected byte[] data;
	
	protected int ptr = 0;
	
	protected int mark = 0;
	
	public MyOwnStream1(byte[] b) {
	
		this.data = b;
	}
	
	@Override
	public int read()
	{
		return (ptr < data.length)?(data[ptr++]):-1;
	}

	@Override
	public synchronized void mark(int readlimit) {

		this.mark = readlimit;
	}
	
	/**
	 * 返回还没有读取的字符串的长度
	 */
	@Override
	public int available() throws IOException {
		return data.length - ptr;
	}
	
	/**
	 * 模拟读到数据的结尾处
	 */
	@Override
	public void close() throws IOException {
		ptr = data.length;
	}
	
	@Override
	public synchronized void reset() throws IOException {

		if(mark<0 || mark > data.length)
		{
			throw new IOException("The position is not valid ！");
		}
		
		ptr = mark;
	}
	
	/**
	 * 使mark有效
	 */
	@Override
	public boolean markSupported() {
		return true;
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {

		if(this.ptr >= data.length || len < 0 )
		{
			return -1;
		}
		
		if(this.ptr + len > data.length)
		{
			len = data.length - this.ptr;
		}
		
		if (len == 0)
		{
			return 0;
		}
		
		System.arraycopy(data, ptr, b, off, len);
		ptr += len;
		
		return len;
		
	}
	
	public static void main(String[] args) throws IOException {
	
		byte[] b = new byte[16];
		
		for(int i = 0 ; i < b.length;i ++)
		{
			b[i] = (byte)i;
		}
		
		MyOwnStream1 mosrm = new MyOwnStream1(b);
		
		//指定下次读取的位置
		mosrm.mark(3);
		//需要用reset方法来重置下次读取的位置为mark指定的位置
		mosrm.reset();
		
		while(true)
		{
			int c = mosrm.read();
			
			if(c < 0 )
			{
				break;
			}
			
			System.out.print( c + " ");
		}
		System.out.println();
		
		mosrm.close();
		
	}
	
	
}
