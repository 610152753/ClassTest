package awtGui;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3384690116943823448L;

	public MyFrame(String title)
	{
		super(title);
	}
	
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame("First Frame !");
		
		frame.setSize(500, 500);
		
		frame.setBackground(Color.DARK_GRAY);
	
		frame.setVisible(true);
	}
}
