package swingTest;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * 
 * �����˵���
 * ���裺
 * 1.����һ�� MenuBar ����, �������һ���˵�������
 * ���磺 Frame .
 * 2.���� һ������Menu ����,�������menu bar 
 * ����.
 * 3.���� һ������MenuItem objects,����,�����
 * ����Ӧ��menu object.
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
