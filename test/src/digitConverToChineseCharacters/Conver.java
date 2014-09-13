package digitConverToChineseCharacters;


/**
 * 
 * ͨ������������һ���ַ��������ж���Щ�ַ���Ϊ����
 * ����������ַ��������֣���ô��ֻ�������������"�û�������ַ�����Ϊ�����޷�ת�� !"
 * ���������
 * ����û�����Ķ�Ϊ���֣���ô��������ת��Ϊ���ĵĴ�д�ı�ʾ(ÿ���û��������8���ַ�)��
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
					System.out.println("�û�������ַ�����Ϊ�����޷�ת�� !");
				}
			}
			else
			{
				System.out.println("�������λ���ڵ����� !");
			}
			

		}
		else{
			System.out.println("�������λ���ڵ����� !");
		}
		
	}
	private void converStart(String str)
	{
		String strR = "";
		String strVal = "";
		//ȥ����ͷ��0
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
			System.out.println("��");
		}
		else
		{
			for( int j = 0 ; j < strVal.length(); j++ )
			{
				
				//���������Ĵ���
				if ("0".equals(strVal.substring(j, j + 1))) {

						//��λΪ������
						if(j == strVal.length() -5)
						{
							strR = strR + "��";
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
			//ȥ����β����
			for(int i = strR.length() ; i > 0  ; i-- )
			{
				if(!"��".equals(strR.substring(i-1, i)))
				{
					strR = strR.substring(0, i);
					break;
				}
			}

			//ȥ�������ظ����㣬����һ����
			strR = rmRepeated(strR);
			System.out.println(strR.replace("����", "��"));
		}
		
	}
    /*
     * ����ַ����������ظ��㷨
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
                    c[j] = c[j+1];//�����ظ���ĸ����kλ�ÿ�ʼ��������ǰŲλ
                    }
                    count++;//�ظ����ֵĴ���
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
			   reVal = "ʮ";break;
		   case 3:
			   reVal = "��";break;
		   case 4:
			   reVal = "ǧ";break;
		   case 5:
			   reVal = "��";break;
		   case 6:
			   reVal = "ʮ";break;
		   case 7:
			   reVal = "��";break;
		   case 8:
			   reVal = "ǧ";break;
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
			   returnVal = "Ҽ";break;
		   case '2':
			   returnVal = "��";break;
		   case '3':
			   returnVal = "��";break;
		   case '4':
			   returnVal = "��";break;
		   case '5':
			   returnVal = "��";break;
		   case '6':
			   returnVal = "½";break;
		   case '7':
			   returnVal = "��";break;
		   case '8':
			   returnVal = "��";break;
		   case '9':
			   returnVal = "��";break;
		   default:
			   returnVal = "��";
			
		}
		return returnVal;

	}

	public static boolean isNum(String str){
		return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
	}
}
