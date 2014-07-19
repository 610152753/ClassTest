package enumeration.Test;


/**
 * 
 * ö������ʵ���Ͼ����ڶ���һ�����ֻ�����ܶ�ϸ���ɱ�������������ˡ�
 * ������ĳ�̶ֳ��ϣ�enum�ؼ��ֵ����þ���class��interface��
 * 
 * ö��(Enum):�����������ÿ��ö�����Ͷ��̳���java.lang.Enum�࣬ö��
 * �е�ÿ����ԱĬ�϶���public static final�ġ�
 * 
 * ÿ��ö�ٵĳ�Ա�����������ö�����͵�һ��ʵ��(Instance)
 * 
 * @author JoePotter
 *
 */
public enum Color
{
	RED,WHITE,BULE, BLACK;

	public static void main(String[] args)
	{
		Color myColor = Color.BULE;
		
		System.out.println(myColor);
		
		System.out.println("------------------");
		
		for(Color c : Color.values())
		{
			System.out.println(c);
		}
		
	}
}
