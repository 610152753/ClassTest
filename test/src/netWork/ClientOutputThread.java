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

				//��Socket����õ��������������PrintWriter����
				PrintWriter pw = new PrintWriter(os);
				
				//��ϵͳ��׼�����豸����BufferedReader����
				BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

				//��ϵͳ��׼�������һ�ַ���
				String str = buffer.readLine();
				
				if("bye".equals(str))
				{
					System.out.println("bye========");
					System.exit(0);
				}
				//����ϵͳ��׼���������ַ��������Server
				pw.println(str);
				
				//ˢ���������ʹServer�����յ����ַ���
				pw.flush();

			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
