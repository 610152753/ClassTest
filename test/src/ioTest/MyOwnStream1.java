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
	 * ���ػ�û�ж�ȡ���ַ����ĳ���
	 */
	@Override
	public int available() throws IOException {
		return data.length - ptr;
	}
	
	/**
	 * ģ��������ݵĽ�β��
	 */
	@Override
	public void close() throws IOException {
		ptr = data.length;
	}
	
	@Override
	public synchronized void reset() throws IOException {

		if(mark<0 || mark > data.length)
		{
			throw new IOException("The position is not valid ��");
		}
		
		ptr = mark;
	}
	
	/**
	 * ʹmark��Ч
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
		
		//ָ���´ζ�ȡ��λ��
		mosrm.mark(3);
		//��Ҫ��reset�����������´ζ�ȡ��λ��Ϊmarkָ����λ��
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
