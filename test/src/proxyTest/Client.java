package proxyTest;

public class Client
{
	public static void main(String[] args)
	{
		//ͨ������������ǽ�ɫ
		
		ProxySubject  proxySubject = new ProxySubject();

		proxySubject.request();
		
		//ֱ�ӷ�����ʵ��ɫ
		
		RealSubject realSubject = new RealSubject();
		
		realSubject.request();
	}

}
