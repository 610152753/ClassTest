package netWork;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ServerOutputThread extends Thread
{
	private Socket socket;
	
	public ServerOutputThread (Socket socket){
		
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			OutputStream os = socket.getOutputStream();
			
			while(true){
			
			byte[] buffer = new byte[200];
			
			int length = buffer.length;
			
			String str =new String(buffer,0,length);
			
			System.out.println(str);
			
			os.write(buffer);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
