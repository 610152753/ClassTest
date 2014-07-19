package enumeration.Test;

public class AccessControl
{
	private static boolean chechAccess(AccessRight accessRight)
	{
		if(accessRight == AccessRight.MANAGER)
		{
			System.out.println("YOU ARE MANAGER !");
			return true;
		}
		else if(accessRight == AccessRight.DEPARTMENT)
		{
			System.out.println("YOU ARE DEPARTMENT !");
			return false;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		AccessRight accessRight = AccessRight.MANAGER;
		AccessRight accessRight1 = AccessRight.valueOf("DEPARTMENT");
		
		chechAccess(accessRight);
		chechAccess(accessRight1);
	}
}
