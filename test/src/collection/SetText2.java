package collection;

import java.util.HashSet;

public class SetText2
{
	public static void main(String[] args)
	{

		HashSet set1 = new HashSet();

		Student s1 = new Student("zhangsan");
		Student s2 = new Student("zhangsan");

		set1.add(s1);
		set1.add(s2);

		System.out.println(set1);

	}
}

class Student
{

	String name;

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (!(obj instanceof Student))
		{
			return false;
		}
		Student other = (Student) obj;
		if (name == null)
		{
			if (other.name != null)
			{
				return false;
			}
		}
		else if (!name.equals(other.name))
		{
			return false;
		}
		return true;
	}

	public Student(String name)
	{
		this.name = name;
	}

//	public int hashCode()
//	{
//		return this.name.hashCode();
//	}
//
//	public boolean equals(Object obj)
//	{
//		if (this == obj)
//		{
//			return true;
//		}
//
//		if (null != obj && obj instanceof Student)
//		{
//			Student s = (Student) obj;
//
//			if (name.equals(s.name))
//			{
//				return true;
//			}
//		}
//
//		return false;
//
//	}

}