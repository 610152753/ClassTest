package netWork;

import java.net.ServerSocket;
import java.net.Socket;

public class TalkServerThread {

	public static void main(String[] args) throws Exception {
		
		ServerSocket serverSocket = new ServerSocket(6868);
		
		while(true)
		{
		
		Socket socket = serverSocket.accept();
		
		//Æô¶¯¶ÁÐ´Ïß³Ì
		
		new ServerInputThread(socket).start();
		new ServerOutputThread(socket).start();
		
		}
		
	}
	
}
