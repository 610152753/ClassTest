package proxyDynamic;

public class RealSubject implements Subject
{

	public void request()
	{
		System.out.println("From Real Subject !");
	}

}
