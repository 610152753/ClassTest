package strategyTestPerson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Client
{
	public static void main(String[] args)
	{
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person(9, "zhangsan", 20));
		personList.add(new Person(2, "lisi", 21));
        personList.add(new Person(3, "wangwu", 25));
        personList.add(new Person(4, "zhaoliu", 26));
        personList.add(new Person(5, "chenqi", 28));
        personList.add(new Person(6, "dongba", 10));
        personList.add(new Person(7, "zhangsan", 15));
        personList.add(new Person(8, "liujiu", 26));
 
        /*
         * 可通过这里new不同的Comparator的实现从而实现不同的排序策略
         * 分别有
         *  IdOrder：按Id正序
         *  IdReverseOrder：按Id逆序
         * NameOrder：按姓名正序
         * NameReverseOrder：按姓名逆序
         * AgeOrder：按年龄正序
         * AgeReverseOrder：按年龄逆序
         */
        Comparator<Person> comp = new NameOrder();
        Collections.sort(personList, comp);
        System.out.println(((NameOrder)comp).getMethodName()+"  排序后的序列是:");
        System.out.println("-----------------------");
        for (Iterator<Person> itor=personList.iterator();itor.hasNext();) {
            Person p=itor.next();
            System.out.println(p.getId() + "  " +p.getName()+ "  " + p.getAge());
        }
	}
	
}
