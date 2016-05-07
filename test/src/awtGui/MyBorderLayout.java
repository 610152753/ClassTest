package awtGui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class MyBorderLayout
{
	private Frame frame;
	
	private Button bn;
	private Button bs;
	private Button bw;
	private Button be;
	private Button bc;
	
	
	public void go()
	{
		frame = new Frame("Frame Test borderlayout title !");
		
		bn = new Button("Bn");
		bs = new Button("Bs");
		bw = new Button("Bw");
		be = new Button("Be");
		bc = new Button("Bc");
		
		frame.add(bn,BorderLayout.NORTH);
		frame.add(bs,BorderLayout.SOUTH);
		frame.add(be,BorderLayout.EAST);
		frame.add(bw,BorderLayout.WEST);
		frame.add(bc,BorderLayout.CENTER);
		
//		frame.setSize(550,400);
		
		frame.pack();   //根据布局自动调节Size的大小
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		MyBorderLayout exGui1 = new MyBorderLayout();
		
		exGui1.go();
	}
	
	
	
}
