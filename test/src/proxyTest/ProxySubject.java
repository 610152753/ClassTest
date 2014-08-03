package proxyTest;

public class ProxySubject extends Subject
{

	private RealSubject realsubject; //�����ɫ�ڲ���������ʵ��ɫ
	
	public void request()
	{
		this.preReques();  //����ʵ��ɫ����֮ǰ�����ӵĲ���
		
		if(null == realsubject)
		{
			realsubject = new RealSubject();
		}
		
		realsubject.request(); //���ǽ�ɫ����ɵ�����
		
		this.postRequest();  //����ʵ��ɫ����֮�󸽼ӵĲ���
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
