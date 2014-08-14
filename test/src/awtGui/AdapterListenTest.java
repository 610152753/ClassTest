package awtGui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * 
 * 为了简化编程，jdk针对大多数事件监听接口定义了相应的实现类，我们称之为事件适配器(Adapter)类
 *
 * 在适配器类中，实现了监听器接口所有方法，但不做任何事情，只要继承适配器类，就等于实现了相应的监听接口
 * 
 * 
 * 如果要对某类事件的某种情况进行处理，只要覆盖相应的方法就可以，其他的方法再也不用"简单实现"了
 *
 *如果想用做事件监听器的类已经继承了别的类，就不能再继承适配器类了(java单继承决定的)，
 *只能去实现事件监听器接口了
 *
 *
 */
public class AdapterListenTest
{
	private Frame frame;
	
	private TextField textField;
	
	public void go()
	{
		frame = new Frame("Adapter Listener Test !");
		
		frame.addWindowListener(new MyWindowListenAdapter());
		
		textField = new TextField();
		
		frame.add(textField, BorderLayout.SOUTH);

		frame.setSize(200, 200);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		AdapterListenTest adapterListenTest = new AdapterListenTest();
		
		adapterListenTest.go();
	}

}

class MyWindowListenAdapter extends WindowAdapter
{
	@Override
	public void windowClosing(WindowEvent e)
	{
//		System.exit(0);
		super.windowClosing(e);
		System.exit(0);
	}
}
