package netWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;


public class ClientOutputThread extends Thread 
{

	private Socket socket;
	
	public ClientOutputThread(Socket socket)
	{
		this.socket = socket;
	}
	
	@Override
	public void run() {

		try {
		
			OutputStream os = socket.getOutputStream();

			while(true)
			{

				//由Socket对象得到输出流，并构造PrintWriter对象
				PrintWriter pw = new PrintWriter(os);
				
				//由系统标准输入设备构造BufferedReader对象
				BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

				//从系统标准输入读入一字符串
				String str = buffer.readLine();
				
				if("bye".equals(str))
				{
					System.out.println("bye========");
					System.exit(0);
				}
				//将从系统标准输入读入的字符串输出到Server
				pw.println(str);
				
				//刷新输出流，使Server马上收到该字符串
				pw.flush();

			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
