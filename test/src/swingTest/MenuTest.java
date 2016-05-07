package swingTest;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * 
 * 创建菜单：
 * 步骤：
 * 1.创建一个 MenuBar 对象, 将其加入一个菜单容器，
 * 例如： Frame .
 * 2.创建 一个或多个Menu 对象,将其加入menu bar 
 * 对象.
 * 3.创建 一个或多个MenuItem objects,对象,将其加
 * 入相应的menu object.
 *
 */
public class MenuTest
{
	
	public void MenuFrame()
	{
		JFrame menuFrame = new JFrame("Menu Tool ");
		
		JMenuBar jMenuBar = new JMenuBar();
		
		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("Save");
		JMenu m3 = new JMenu("load");
		JMenu m4 = new JMenu("Quit");
		
		JMenuItem i1 = new JMenuItem("New File");
		JMenuItem i2 = new JMenuItem("Open File");
		JMenuItem i3 = new JMenuItem("New File");
		JMenuItem i4 = new JMenuItem("Save As");
		
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m2.add(i4);
		
		jMenuBar.add(m1);
		jMenuBar.add(m2);
		jMenuBar.add(m3);
		jMenuBar.add(m4);
		
		menuFrame.add(jMenuBar,BorderLayout.NORTH);
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuFrame.setSize(new Dimension(200,300));
		menuFrame.setVisible(true);
		
	}
	
	
	public static void main(String[] args)
	{
		MenuTest frame = new MenuTest();
		
		frame.MenuFrame();
	}
}
