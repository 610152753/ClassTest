package proxyTest;

public class Client
{
	public static void main(String[] args)
	{
		//通过代理访问真是角色
		
		ProxySubject  proxySubject = new ProxySubject();

		proxySubject.request();
		
		//直接访问真实角色
		
		RealSubject realSubject = new RealSubject();
		
		realSubject.request();
	}

}
