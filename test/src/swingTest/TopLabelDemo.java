package swingTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class TopLabelDemo
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("TopLevel Demo !");
		
		JLabel label = new JLabel("hello");
		
		label.setBackground(Color.YELLOW);
		label.setPreferredSize(new Dimension(200,160));
		
		JMenuBar menuBar = new JMenuBar();
		
		menuBar.setBackground(Color.cyan);
		menuBar.setPreferredSize(new Dimension(200,20));
		
		frame.setJMenuBar(menuBar);
		
		frame.setSize(new Dimension(200,500));
		frame.getContentPane().add(label,BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
}
