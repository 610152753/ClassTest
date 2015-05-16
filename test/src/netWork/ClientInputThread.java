package netWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientInputThread extends Thread 
{

	private Socket socket;
	
	public ClientInputThread(Socket socket)
	{
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
		
			InputStream is = socket.getInputStream();

			BufferedReader buffer = new BufferedReader(new InputStreamReader(is));
			
			String str =  buffer.readLine();
			
			System.out.println("received msg £º" + str);
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
