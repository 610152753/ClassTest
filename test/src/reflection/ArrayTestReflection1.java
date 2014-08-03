package reflection;

import java.lang.reflect.Array;


/**
 * 
 * @author JoePotter
 *
 */
public class ArrayTestReflection1
{
   public static void main(String[] args)
   {
	   int[] dims = new int[]{4,40,20};
	   
	   Object array = Array.newInstance(Integer.TYPE, dims);
	   
	   Class<?> classType = array.getClass().getComponentType();
	   
	   System.out.println(classType);
	   
	   Object arrayObj = Array.get(array, 2);
	   
	   Class<?> classType1 = arrayObj.getClass().getComponentType();
	   
	   System.out.println(classType1);
	   
	   arrayObj = Array.get(arrayObj, 5);
	   
	   Array.set(arrayObj, 12, 90);
	   
	   int[] [] []  arrayCast = (int[] [] []) array;
	   
	   System.out.println(arrayCast[2][5][12]);
	   
	   System.out.println("-----------------------");
	   
		/**
		 * 
		 * Integer.TYPE���ص���int����Integer.Class���ص���Integer���� ��Ӧ��Class����
		 * int 
		 * class java.lang.Integer
		 */
	   
	   System.out.println(Integer.TYPE);
	   System.out.println(Integer.class);
   }
}
