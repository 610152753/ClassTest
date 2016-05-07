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
			System.out.println("向左转");
			break;
		case TURN_RIGHT:
			System.out.println("向右转");
		    break;
		case SHOOT:
			System.out.println("射击");
			break;
		}
			
	}

}

enum opConstant
{
	TURN_LEFT,TURN_RIGHT,SHOOT
}
