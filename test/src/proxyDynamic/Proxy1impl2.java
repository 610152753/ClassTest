package proxyDynamic;

public class Proxy1impl2 implements Proxy1Iterface
{
	public String setRealSub()
	{
		System.out.println("This is From Proxy1impl2 !");
		return "Proxy1impl2";
	}
}
