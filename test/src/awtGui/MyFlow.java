package awtGui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MyFlow
{
	private Frame frame;
	
	private Button b1,b2,b3,b4;
	
	public void go()
	{
		frame = new Frame("Frame for Flow lay out !");
		
		b1 = new Button("B1");
		b2 = new Button("B2");
		b3 = new Button("B3");
		b4 = new Button("B4");
		
		frame.setLayout(new FlowLayout());  //使用FlowLayout替换默认的BorderLayout
//		frame.pack();
		
		frame.setSize(200,200);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		MyFlow myFlow = new MyFlow();
		
		myFlow.go();
	}
		

}
