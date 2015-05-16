package netWork;

import java.net.Socket;

public class TalkClientThread {
	
	public static void main(String args[]) throws Exception
	{
		
		Socket socket = new Socket("127.0.0.1",6868);

		//Æô¶¯¶ÁÐ´Ïß³Ì
			
		new ClientOutputThread(socket).start();
		new ClientInputThread(socket).start();
			
	}
}
