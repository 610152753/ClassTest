package awtGui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * 
 * Ϊ�˼򻯱�̣�jdk��Դ�����¼������ӿڶ�������Ӧ��ʵ���࣬���ǳ�֮Ϊ�¼�������(Adapter)��
 *
 * �����������У�ʵ���˼������ӿ����з������������κ����飬ֻҪ�̳��������࣬�͵���ʵ������Ӧ�ļ����ӿ�
 * 
 * 
 * ���Ҫ��ĳ���¼���ĳ��������д���ֻҪ������Ӧ�ķ����Ϳ��ԣ������ķ�����Ҳ����"��ʵ��"��
 *
 *����������¼������������Ѿ��̳��˱���࣬�Ͳ����ټ̳�����������(java���̳о�����)��
 *ֻ��ȥʵ���¼��������ӿ���
 *
 *
 */
public class AdapterListenTest
{
	private Frame frame;
	
	private TextField textField;
	
	public void go()
	{
		frame = new Frame("Adapter Listener Test !");
		
		frame.addWindowListener(new MyWindowListenAdapter());
		
		textField = new TextField();
		
		frame.add(textField, BorderLayout.SOUTH);

		frame.setSize(200, 200);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		AdapterListenTest adapterListenTest = new AdapterListenTest();
		
		adapterListenTest.go();
	}

}

class MyWindowListenAdapter extends WindowAdapter
{
	@Override
	public void windowClosing(WindowEvent e)
	{
//		System.exit(0);
		super.windowClosing(e);
		System.exit(0);
	}
}
