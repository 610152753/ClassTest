package enumeration.Test;

public class EnumTest
{
	public static void main(String[] args)
	{
		doOp(opConstant.SHOOT);
		
		System.out.println("-----------");
		
		doOp(opConstant.TURN_LEFT);
		
	}
	
	public static void doOp(opConstant opConstant)
	{
		switch(opConstant)
		{
		case TURN_LEFT:
			System.out.println("����ת");
			break;
		case TURN_RIGHT:
			System.out.println("����ת");
		    break;
		case SHOOT:
			System.out.println("���");
			break;
		}
			
	}

}

enum opConstant
{
	TURN_LEFT,TURN_RIGHT,SHOOT
}
