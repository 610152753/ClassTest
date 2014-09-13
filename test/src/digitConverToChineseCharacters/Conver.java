package digitConverToChineseCharacters;


/**
 * 
 * 通过命令行输入一串字符，首先判断这些字符都为数字
 * 如果其中有字符不是数字，那么就只在命令行上输出"用户输入的字符不都为数，无法转换 !"
 * 程序结束；
 * 如果用户输入的都为数字，那么将该数字转换为中文的大写的表示(每次用户最多输入8个字符)。
 *
 */
public class Conver {

	public static void main(String args[]) {
		
		if (args.length > 0) {
			
			if(args[0].length() <= 8 )
			{
				if (isNum(args[0])) {
					
					Conver cv = new Conver();
					
					cv.converStart(args[0]);

				} else {
					System.out.println("用户输入的字符不都为数，无法转换 !");
				}
			}
			else
			{
				System.out.println("请输入八位以内的数字 !");
			}
			

		}
		else{
			System.out.println("请输入八位以内的数字 !");
		}
		
	}
	private void converStart(String str)
	{
		String strR = "";
		String strVal = "";
		//去掉开头的0
		for(int i = 0 ; i < str.length() ; i++ )
		{
			if(!"0".equals(str.substring(i, i+1)))
			{
				System.out.println(str.substring(i, i+1));
				strVal = str.substring(i);
				System.out.println(strVal);
				break;
			}
		}
		if(strVal.length() == 0)
		{
			System.out.println("零");
		}
		else
		{
			for( int j = 0 ; j < strVal.length(); j++ )
			{
				
				//连续多个零的处理
				if ("0".equals(strVal.substring(j, j + 1))) {

						//万位为零的情况
						if(j == strVal.length() -5)
						{
							strR = strR + "万";
						}
						
						strR = strR + digitConver(strVal.substring(j, j + 1).charAt(0));

						strR = strR + unitConver(0);
				}
				else
				{
					strR = strR + digitConver(strVal.substring(j, j + 1).charAt(0));

					strR = strR + unitConver(strVal.length() - j);
				}

			}
			//去掉结尾的零
			for(int i = strR.length() ; i > 0  ; i-- )
			{
				if(!"零".equals(strR.substring(i-1, i)))
				{
					strR = strR.substring(0, i);
					break;
				}
			}

			//去掉连续重复的零，保留一个零
			strR = rmRepeated(strR);
			System.out.println(strR.replace("零万", "万"));
		}
		
	}
    /*
     * 清除字符串中连续重复算法
     */
    private String rmRepeated(String s){
        int len = s.length();
        int k = 0;
        int count = 0;
        String str = "";
        char[] c = new char[len];
        for(int i=0;i<len;i++){
            c[i] = s.charAt(i);
        }
        for(int i=0;i<len;i++){
                k=i+1;
                while(k<len-count){
                if(c[i]==c[k]){
                    for(int j=k;j<len-1;j++){
                    c[j] = c[j+1];//出现重复字母，从k位置开始将数组往前挪位
                    }
                    count++;//重复出现的次数
                    k--;
                    i--;
                }
                k++;
                break;
                }
             
            }
        for(int i=0;i<len-count;i++){
             str+=String.valueOf(c[i]);
        }
        return str;
    }
	
	
	private String unitConver(int len)
	{
		String reVal;
		
		switch(len)
		{
		   case 2:
			   reVal = "十";break;
		   case 3:
			   reVal = "百";break;
		   case 4:
			   reVal = "千";break;
		   case 5:
			   reVal = "万";break;
		   case 6:
			   reVal = "十";break;
		   case 7:
			   reVal = "百";break;
		   case 8:
			   reVal = "千";break;
		   default:
			   reVal = "";
		}
		return reVal;
		
	}
	
	
	private String digitConver(char digit)
	{
		String returnVal; 
		switch(digit)
		{
		   case '1':
			   returnVal = "壹";break;
		   case '2':
			   returnVal = "贰";break;
		   case '3':
			   returnVal = "叁";break;
		   case '4':
			   returnVal = "肆";break;
		   case '5':
			   returnVal = "伍";break;
		   case '6':
			   returnVal = "陆";break;
		   case '7':
			   returnVal = "柒";break;
		   case '8':
			   returnVal = "捌";break;
		   case '9':
			   returnVal = "玖";break;
		   default:
			   returnVal = "零";
			
		}
		return returnVal;

	}

	public static boolean isNum(String str){
		return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
	}
}
