package generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTestGeneric
{
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<String>();
		
		set.add("aa");
		set.add("bb");
		set.add("cc");
		
		for(Iterator<String> iter = set.iterator();iter.hasNext();){
			
			String value = iter.next();
			System.out.println(value);
		}
		
		Set<People> set1 = new HashSet<People>();
		
		set1.add(new People("zhangsan","10","chnia"));
		set1.add(new People("lisi","20","chnia"));
		set1.add(new People("joe","20","usa"));
		
		for(Iterator<People> iter = set1.iterator();iter.hasNext();){
			People people = iter.next();
			String name = people.getName();
			String age = people.getAge();
			String address = people.getaddress();
			System.out.println(name + "--" + age + "--" + address);
		}
		
	}
}

class People
{
	private String name;
	
	private String age;
	
	private String address;
	
	public People(String name,String age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (address == null)
		{
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age == null)
		{
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAge()
	{
		return age;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public String getaddress()
	{
		return address;
	}

	public void setaddress(String address)
	{
		this.address = address;
	}
	
}