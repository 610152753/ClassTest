package collection;

import java.util.ArrayList;

/**
 * 
 * @author JoePotter
 *
 */
public class ArrayListTest5
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(new Point(2,3));
		list.add(new Point(2,2));
		list.add(new Point(4,4));
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
//			com.qiaoshunlong.Point@290fbc     //没有toString方法时候
//			com.qiaoshunlong.Point@1c80b01    //没有toString方法时候
//			com.qiaoshunlong.Point@4aa0ce     //没有toString方法时候
		}
		System.out.println(list);
//		[com.qiaoshunlong.Point@290fbc, com.qiaoshunlong.Point@1c80b01, com.qiaoshunlong.Point@4aa0ce]  //没有toString方法时候
		
	}

}
class Point
{
	int x;
	int y;
	/**
	 * 
	 * @param x
	 * @param y
	 */
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	/**
	 * 	@return return coordinate of axist of x and y
	 */
	public String toString()
	{
		return "x = " + this.x + ",y = " + this.y + ";";
	}
}
