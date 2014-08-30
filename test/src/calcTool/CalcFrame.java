package calcTool;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcFrame implements ActionListener
{
	private JFrame jFrame;
	private JPanel jPanel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton buttona;
	private JButton buttonb;
	private JButton buttonc;
	private JButton buttond;
	private JButton buttone;
	private JButton buttonf;
	private JTextField textField;
	
	public void menuFrame()
	{
		if(jFrame == null)
		{
			jFrame = new JFrame("¼ÆËãÆ÷");
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			jFrame.setSize(240, 280);
			textField = new JTextField();
			textField.setSize(240, 60);
			jFrame.setLayout(new BorderLayout(5,5));
			jFrame.add(textField,BorderLayout.NORTH);
			
			jPanel = new JPanel();
			jPanel.setLayout(new GridLayout(4,4,5,5));
//			jPanel.setLayout(new BorderLayout());
			
			button1 = new JButton("1");
			button1.setSize(60, 60);
			jPanel.add(button1);
			
			button2 = new JButton("2");
			button2.setSize(60, 60);
			jPanel.add(button2);
			
			button3 = new JButton("3");
			button3.setSize(60, 60);
			jPanel.add(button3);
			
			buttona = new JButton("+");
			buttona.setSize(60, 60);
			jPanel.add(buttona);
			
			button4 = new JButton("4");
			button4.setSize(60, 60);
			jPanel.add(button4);
			
			button5 = new JButton("5");
			button5.setSize(60, 60);
			jPanel.add(button5);
			
			button6 = new JButton("6");
			button6.setSize(60, 60);
			jPanel.add(button6);
			
			buttonb = new JButton("-");
			buttonb.setSize(60, 60);
			jPanel.add(buttonb);
			
			button7 = new JButton("7");
			button7.setSize(60, 60);
			jPanel.add(button7);
			
			button8 = new JButton("8");
			button8.setSize(60, 60);
			jPanel.add(button8);
			
			button9 = new JButton("9");
			button9.setSize(60, 60);
			jPanel.add(button9);
			
			buttonc = new JButton("*");
			buttonc.setSize(60, 60);
			jPanel.add(buttonc);
			
			button0 = new JButton("0");
			button0.setSize(60, 60);
			jPanel.add(button0);
			
			buttone = new JButton(".");
			buttone.setSize(60, 60);
			jPanel.add(buttone);
			
			buttonf = new JButton("=");
			buttonf.setSize(60, 60);
			buttonf.addActionListener(this);
			jPanel.add(buttonf);
			
			buttond = new JButton("/");
			buttond.setSize(60, 60);
			buttond.addActionListener(this);
			jPanel.add(buttond);
			
			
			jFrame.add(jPanel,BorderLayout.CENTER);
			jFrame.pack();
			jFrame.setResizable(false);;
			
			jFrame.setVisible(true);
			
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getActionCommand());
		textField.setText(e.getActionCommand());
	}

	public static void main(String[] args)
	{
		CalcFrame calcFrame = new CalcFrame();
		calcFrame.menuFrame();
		
	}
}
