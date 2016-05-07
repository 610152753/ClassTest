package proxyTest;

public class ProxySubject extends Subject
{

	private RealSubject realsubject; //代理角色内部引用了真实角色
	
	public void request()
	{
		this.preReques();  //在真实角色操作之前所附加的操作
		
		if(null == realsubject)
		{
			realsubject = new RealSubject();
		}
		
		realsubject.request(); //真是角色所完成的事情
		
		this.postRequest();  //在真实角色操作之后附加的操作
	}
	
	private void preReques()
	{
		System.out.println("pre request !");
	}
	
	private void postRequest()
	{
		System.out.println("post request !");
	}

}
