package tmpTest;

public class InheritorClass
{
	
//	public InheritorClass(String str)
//	{
//		System.out.println(str);
//	}
	
	public InheritorClass()
	{
		System.out.println("hello !");
	}
	public void InheritorClass1()
	{
		System.out.println("hello !");
	}
	

}


class Inherited extends InheritorClass
{
    
	//Ĭ�ϼ̳в��������Ĺ��췽�����������Ĺ��췽�����в������˴��������¶��幹�췽��
	
	
	
	public void invoke(){
     super.InheritorClass1();
	}
	
	
}