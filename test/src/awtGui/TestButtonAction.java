package awtGui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TestButtonAction
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("Test Button !");
		
		Button button = new Button("Button1");
		
		frame.add(button,BorderLayout.CENTER);
		
		button.addActionListener(new handlerButton());
		
		frame.pack();
		
		frame.setVisible(true);
	}
}
class handlerButton implements ActionListener
{
	@SuppressWarnings( "deprecation" )
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Test Ok !");
		System.out.println( "Action Command :" + e.getActionCommand());
		System.out.println( "Action the event type. :" + e.getID());
		long milliseconds =  e.getWhen();
		Date date =  new Date(milliseconds);
		System.out.println( "this event's timestamp:" + date.toLocaleString());
		System.out.println( "The object on which the Event initially occurred:" + e.getSource());
		
	}
}
