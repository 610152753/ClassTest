package calcTool;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcFrame implements ActionListener {
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

	//参考模式 ：A 运算符a B 运算符b (1+11+  显示  ：12+ )  
	
	private String strVal;  //接受数字用的临时变量
	private String cflag;   //连续输入多个运算符的时用的控制变量
	private String equflag = "0";  //多次输入等号的时候用的控制变量(运算符号发生过一次变化)
	private String equflag1 = "0";  //多次输入等号的时候用的控制变量(运算符号没有发生变化)
	private String strVaDisp;  //显示用的变量
	private String calcValA;  //运算数A
	private String calcValB;  //运算数B
	private String calcValBTemp; //多次输入等号的时候，保存临时变量用
	private String optionFlagA; //操作符A
	private String optionFlagB; //操作符B

	public void menuFrame() {
		if (jFrame == null) {
			jFrame = new JFrame("计算器");
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			textField = new JTextField();
			textField.setSize(240, 60);
			textField.setHorizontalAlignment(JTextField.RIGHT);
			jFrame.setLayout(new BorderLayout(5, 5));
			jFrame.add(textField, BorderLayout.NORTH);

			jPanel = new JPanel();
			jPanel.setLayout(new GridLayout(4, 4, 5, 5));

			button1 = new JButton("1");
			button1.setSize(60, 60);
			button1.addActionListener(this);
			jPanel.add(button1);

			button2 = new JButton("2");
			button2.setSize(60, 60);
			button2.addActionListener(this);
			jPanel.add(button2);

			button3 = new JButton("3");
			button3.setSize(60, 60);
			button3.addActionListener(this);
			jPanel.add(button3);

			buttona = new JButton("+");
			buttona.setSize(60, 60);
			buttona.addActionListener(this);
			jPanel.add(buttona);

			button4 = new JButton("4");
			button4.setSize(60, 60);
			button4.addActionListener(this);
			jPanel.add(button4);

			button5 = new JButton("5");
			button5.setSize(60, 60);
			button5.addActionListener(this);
			jPanel.add(button5);

			button6 = new JButton("6");
			button6.setSize(60, 60);
			button6.addActionListener(this);
			jPanel.add(button6);

			buttonb = new JButton("-");
			buttonb.setSize(60, 60);
			buttonb.addActionListener(this);
			jPanel.add(buttonb);

			button7 = new JButton("7");
			button7.setSize(60, 60);
			button7.addActionListener(this);
			jPanel.add(button7);

			button8 = new JButton("8");
			button8.setSize(60, 60);
			button8.addActionListener(this);
			jPanel.add(button8);

			button9 = new JButton("9");
			button9.setSize(60, 60);
			button9.addActionListener(this);
			jPanel.add(button9);

			buttonc = new JButton("*");
			buttonc.setSize(60, 60);
			buttonc.addActionListener(this);
			jPanel.add(buttonc);

			button0 = new JButton("0");
			button0.setSize(60, 60);
			button0.addActionListener(this);
			jPanel.add(button0);

			buttone = new JButton(".");
			buttone.setSize(60, 60);
			buttone.addActionListener(this);
			jPanel.add(buttone);

			buttonf = new JButton("=");
			buttonf.setSize(60, 60);
			buttonf.addActionListener(this);
			jPanel.add(buttonf);

			buttond = new JButton("/");
			buttond.setSize(60, 60);
			buttond.addActionListener(this);
			jPanel.add(buttond);

			jFrame.add(jPanel, BorderLayout.CENTER);
			jFrame.pack();
			jFrame.setResizable(false);
			;

			jFrame.setVisible(true);

		}
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getActionCommand());
		//获取输入的数字，并赋值给显示用的变量
		if(isNumeric(e.getActionCommand()))
		{
			if(strVal != null)
			{
				strVal = strVal + e.getActionCommand();
			}
			else
			{
				strVal = e.getActionCommand();
			}
			if(calcValA == null)
			{
				strVaDisp = strVal;
			}
			else
			{
				//多次输入等号后再次输入运算数的处理
				if(equflag == "1" || equflag1 == "1")
				{
					strVaDisp = strVal;
					equflag = "0";
					strVal = null;
				}
				else
				{
					strVaDisp = calcValA + optionFlagA + strVal; 
				}

			}
			//输入的是等号时
		}else if(e.getActionCommand() == "=")
		{
			//当输入的算式是这样样式(A 运算符)时：再次输入等号做一下处理。
			if(calcValA != null && optionFlagA != null && strVal == null)
			{
				//多次连续输入等号的处理，如果运算符发生变化时，将运算数calcValB改为当前的A，再此连续的运算
				if(equflag == "0" && equflag1 == "0")
				{
					calcValBTemp = calcValA;
					equflag = "1";
				}
				calcValB = calcValBTemp;
				calcValA = clac();
				strVaDisp = calcValA;
				calcValB = null;
				strVal = null;
			}
			//两个运算数和一个运算符都已经正常获取后，再次输入了等号的处理,没有清空optionFlagA是为了连续再次输入等号用，
			//实现连续的运算
			if(calcValA != null && optionFlagA != null && strVal != null)
			{
				//除数为0的处理
				if(optionFlagA == "/" && strVal == "0")
				{
					calcValA = null;  //清空运算数A
					optionFlagA = null; //清空运算符a
					strVaDisp = "除数为零重新输入！";  //显示信息赋值
				}
				else
				{
					equflag1 = "1";
					calcValBTemp = strVal;
					calcValB = strVal;
					calcValA = clac();
					strVaDisp = calcValA;
					calcValB = null;
					strVal = null;
				}

			}
			
		}
		else
		{
			//多次输入等号的时候，控制运算数calcValB的变化的变量
			equflag = "0";
			equflag1 = "0";
			
			if(strVal == null)
			{
				// 开始就输入运算符的情况，做strVal = "0";
				strVal = "0";
				// 连续输入多个运算符的情况，cflag = "1"
				cflag = "1";
			}
			//第一次输入运算符的处理
			if(calcValB == null && optionFlagA == null)
			{
				optionFlagA = e.getActionCommand();
				strVaDisp = strVal + optionFlagA;
			}
			else
			{
				//连续输入多个运算符的时候运算符的处理
				if(calcValA != null && optionFlagA != null && cflag == "1")
				{
					optionFlagA = e.getActionCommand();
					strVaDisp = calcValA + optionFlagA;
					cflag = "0";
				}
				else
				//输入第二个运算数后再次输入的运算符的处理
				{
					optionFlagB = e.getActionCommand();
					strVaDisp = strVal + optionFlagB;
					System.out.println("optionFlagB set ");
				}
			}
			//将接受的运算数分别赋值给相应的变量方便调用共通方法
			if(calcValA != null && calcValB == null && optionFlagB != null)
			{
				calcValB = strVal;
			}
			else if(calcValA == null)
			{
				calcValA = strVal;
			}
			strVal = null;  //清空接受运算数的变量
			
			//如果有两个运算数都不为空的时候的处理
			if(calcValA != null && calcValB != null)
			{

				//除数为0的处理
				if(optionFlagA == "/" && calcValB == "0")
				{
					calcValA = null;  //清空运算数A
					optionFlagA = null; //清空运算符a
					strVaDisp = "除数为零重新输入！";  //显示信息赋值
				}
				else
				//两个运算数都正常调用运算方法，并将结果返回给第一个运算数，将第二次接受的运算符b赋值给运算符a
				{
					calcValA = clac();
					optionFlagA = optionFlagB;
					strVaDisp = calcValA + optionFlagA;
				}
				calcValB = null;   //清空运算数B
				optionFlagB = null;  //清空运算符b
			}

		}
		textField.setText(strVaDisp);  //显示相应的信息
	}

	//加减乘除运算方法
	public String clac() {
		
		double A = Double.parseDouble(calcValA);
		double B = Double.parseDouble(calcValB);
		double calcALL;
		
		if(optionFlagA == "+")
		{
			calcALL = A + B;
		}
		else if(optionFlagA == "-") 
		{
			calcALL = A - B;
		}
		else if(optionFlagA == "*")
		{
			calcALL = A * B;
		}
		else
		{
			calcALL = A / B;
		}
		return String.valueOf(calcALL);
	}

	public static void main(String[] args) {
		CalcFrame calcFrame = new CalcFrame();
		calcFrame.menuFrame();

	}

	// 使用正则表达式，判断当前输入的字符是否是数字或者小数点
	public boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]|\\.");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}
}
