package netWork.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	
	public static void  main(String[] args) throws Exception
	{
		ServerSocket sers = new ServerSocket(5001);
		
		Socket socket = sers.accept();
		
		InputStream ins = socket.getInputStream();
		
	    OutputStream os = socket.getOutputStream();
		
		byte[]  buffer =new byte[200];
		
		int length =0;
		
		while(-1 != (length = ins.read(buffer, 0, buffer.length)))
		{
			String str = new String(buffer,0,length);
			
			System.out.println(str);
		}
		
		os.write("wolcome".getBytes());
		
		ins.close();
		os.close();
		sers.close();
	}

}
