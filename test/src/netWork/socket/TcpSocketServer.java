package netWork.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class TcpSocketServer {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(5000);
		
		Socket socket = ss.accept();
		
		InputStream is = socket.getInputStream();
		
		OutputStream os = socket.getOutputStream();
		
		byte[] buffer = new byte[5];
		
		int length = is.read(buffer);
		
		System.out.println(new String(buffer,0,length));
		
		os.write("Welcome !".getBytes());
		
		is.close();
		
		os.close();
		
		socket.close();
		
		ss.close();
		
	}

}
