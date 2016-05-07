package netWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerInputThread extends Thread 
{

	private Socket socket;
	
	public ServerInputThread(Socket socket)
	{
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			
			InputStream is = socket.getInputStream();
			
			while(true)
			{
				System.out.println("ServerInputThread 1");
				BufferedReader buff = new BufferedReader(new InputStreamReader(is));
				System.out.println("ServerInputThread 2");
				//如果读取的内容没有的话，程序一直在readLine处等待
				String str =  buff.readLine();
				System.out.println("ServerInputThread 3");
				
				System.out.println("received msg From Client：" + str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
