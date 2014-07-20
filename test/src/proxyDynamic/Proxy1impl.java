package proxyDynamic;

public class Proxy1impl implements Proxy1Iterface
{

	public String setRealSub()
	{
		System.out.println("This is From Proxy1impl !");
		return "Proxy1impl";
	}

}
