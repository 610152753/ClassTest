package netWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
			
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				//如果读取的内容没有的话，程序一直在readLine处等待
				String line = reader.readLine();
				
				os.write(line.getBytes());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
