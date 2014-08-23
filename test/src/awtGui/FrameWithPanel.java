package awtGui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameWithPanel extends Frame
{
	public FrameWithPanel(String title)
	{
		super(title);
	}
	
	public static void main(String[] args)
	{
		FrameWithPanel frame = new FrameWithPanel("This is Frame With Panel !");
		
		Panel panel = new Panel();
		
		frame.setSize(200, 200);
		frame.setBackground(Color.BLUE);
		frame.setLayout(null);
		
		panel.setSize(100, 100);
		panel.setBackground(Color.CYAN);
		
		frame.add(panel);
		
		frame.setVisible(true);
		
	}
}