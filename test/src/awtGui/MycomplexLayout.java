package awtGui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class MycomplexLayout
{
	private Frame frame;
	
	private Button b1,b2,b3,b4;
	
	private Panel panel;
	
	public void go()
	{
		frame = new Frame("Complex Layout !");
		
		b1 = new Button("b1");
		b2 = new Button("b2");
		
		frame.add(b1,BorderLayout.WEST);
		frame.add(b2,BorderLayout.CENTER);
		
		panel = new Panel();  //默认为FlowLayout
		
		b3 = new Button("b3");
		b4 = new Button("b4");
		
		panel.add(b3);
		panel.add(b4);
		
		frame.add(panel,BorderLayout.NORTH);
		
		frame.setSize(200,200);
		
//		frame.pack();
		
		frame.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		MycomplexLayout mycomplexLayout = new MycomplexLayout();
		
		mycomplexLayout.go();
	}
	
	
}
