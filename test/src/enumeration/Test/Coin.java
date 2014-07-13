package enumeration.Test;

public enum Coin
{
	penny("hello"),
	nickel("world"),
	dime("welcome");
	
	private String value;
	
	public String getvalue()
	{
		return value;
	}

	Coin(String value)
	{
		this.value = value;
	}
	
	public static void main(String[] args)
	{
		Coin coin = Coin.penny;
		
		System.out.println(coin.getvalue());
	}
}
