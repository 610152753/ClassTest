package enumeration.Test;

public class ShowEnum1
{
	public static void main(String[] args)
	{
		for(opConstant c : opConstant.values())
		{
			System.out.printf("%d,%s %n",c.ordinal(),c);
		}
	}

}
