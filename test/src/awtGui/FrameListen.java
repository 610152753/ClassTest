package awtGui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameListen
{
	
	public static void main(String[] args)
	{
		Frame frame = new Frame("My Frame 2 !");
		
		frame.addWindowListener(new MyWindowListener());
		
		Button button = new Button("Click me ");
		
		button.addActionListener(new ActionHandler());
		
		frame.add(button);
		
		frame.setSize(200, 200);
		
		frame.setVisible(true);
	}
	
}
class ActionHandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getActionCommand());
		
	}
}


class MyWindowListener implements WindowListener
{

	public void windowOpened(WindowEvent e)
	{
		System.out.println("Open My Frame 2 ");
		
	}

	public void windowClosing(WindowEvent e)
	{
		System.out.println("Close Windows !");
		System.exit(0);
	}

	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
}

