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
				BufferedReader buff = new BufferedReader(new InputStreamReader(is));
				
				//�����ȡ������û�еĻ�������һֱ��readLine���ȴ�
				String str =  buff.readLine();
				
				System.out.println("received msg ��" + str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
