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
         * ��ͨ������new��ͬ��Comparator��ʵ�ִӶ�ʵ�ֲ�ͬ���������
         * �ֱ���
         *  IdOrder����Id����
         *  IdReverseOrder����Id����
         * NameOrder������������
         * NameReverseOrder������������
         * AgeOrder������������
         * AgeReverseOrder������������
         */
        Comparator<Person> comp = new NameOrder();
        Collections.sort(personList, comp);
        System.out.println(((NameOrder)comp).getMethodName()+"  ������������:");
        System.out.println("-----------------------");
        for (Iterator<Person> itor=personList.iterator();itor.hasNext();) {
            Person p=itor.next();
            System.out.println(p.getId() + "  " +p.getName()+ "  " + p.getAge());
        }
	}
	
}
