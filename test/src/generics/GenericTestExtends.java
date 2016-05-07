package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GenericTestExtends<T>
{
	private  T foo;

	public T getFoo()
	{
		return foo;
	}

	public void setFoo(T foo)
	{
		this.foo = foo;
	}
	
	public static void main(String[] args)
	{
//		只能在List下面的类型
		GenericTestExtends<? extends List> ge = null;
		
		//引用指向不同类
		ge = new GenericTestExtends<ArrayList>();
		ge = new GenericTestExtends<LinkedList>();
		
//		ge = new GenericTestExtends<HashMap>();
		
//		只能在List上面的类型
		GenericTestExtends<? super List> ge2 = null;
		
//		ge2 = new GenericTestExtends<ArrayList>();
		ge2 = new GenericTestExtends<Object>();
		
		GenericTestExtends<String> ge3 = new GenericTestExtends<String>();
		
		ge3.setFoo("hello world !");
		
//		GenericTestExtends<? extends Object> ge4 = ge3;  //和一句下面一样
		GenericTestExtends<?> ge4 = ge3;
		
		System.out.println(ge4.getFoo());
		
		ge4.setFoo(null);
		
		System.out.println(ge4.getFoo());
		
		/**
		 * 使用<？>或者<? extends SomeClass>的声明方式，意味着您只能
		 * 通过该名称来取得所参考实例的信息，或者是移除某些信息，但不能增加它的
		 * 信息，因为只知道当中放置的是SomeClass的子类，但不一定是什么类的实例
		 * ，编译器不让您加入信息，理由是，如果可以加入信息的话，那么您旧的记得取回的
		 * 实例是什么类型，让后转换为原来的类型方可进行操作，这就失去了使用泛型的意义。
		 */
//		ge4.setFoo("welcome!");
		
		
	}

}
