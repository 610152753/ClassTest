package enumeration.Test;

public class ShowEnum
{
	public static void enumCompareTo(opConstant constant)
	{
		System.out.println(constant);
		
		for(opConstant c : opConstant.values())
		{
			System.out.println(constant.compareTo(c));
		}
	}
	
	public static void main(String[] args)
	{
		enumCompareTo(opConstant.SHOOT);
	}

}
