package awtGui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TwoListen implements MouseMotionListener,MouseListener,WindowListener
{
	private Frame frame;
	
	private TextField textField;
	
	public void go()
	{
		frame = new Frame();
		
		textField = new TextField();
		
		frame.add(textField,BorderLayout.SOUTH);
		
		frame.addMouseListener(this);
		frame.addMouseMotionListener(this);
		
		frame.addMouseListener(new MyMouselistener());
		frame.addMouseMotionListener(new MyMouselistener());
		
		frame.addWindowListener(this);
		
		frame.setSize(400, 400);
		
		frame.setVisible(true);
	}
	
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e)
	{
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
	
	

	public void mouseClicked(java.awt.event.MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(java.awt.event.MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(java.awt.event.MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(java.awt.event.MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(java.awt.event.MouseEvent e)
	{
		this.textField.setText("The Mouse has left the Frame !");
	}

	public void mouseDragged(java.awt.event.MouseEvent e)
	{
		String str = "x: " + e.getX() + ",y: " + e.getY();
		this.textField.setText(str);
	}

	public void mouseMoved(java.awt.event.MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args)
	{
		TwoListen twoListen = new TwoListen();
		
		twoListen.go();
	}
	
}

class MyMouselistener implements MouseMotionListener,MouseListener
{

	public void mouseClicked(MouseEvent e)
	{
		System.out.println("Click Mouse !");
		
	}

	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e)
	{
		String str = "The mouse has entered the Frame !";
		
		System.out.println(str);
		
	}

	public void mouseExited(MouseEvent e)
	{
		String str = "The mouse has left the Frame !";
		
		System.out.println(str);
	}

	public void mouseDragged(MouseEvent e)
	{
		String str = "x: " + e.getX() + ",y: " + e.getY();
		System.out.println(str);
	}

	public void mouseMoved(MouseEvent e)
	{
		
		String str = "x: " + e.getX() + ",y: " + e.getY();
		System.out.println(str);
	}
	
}
