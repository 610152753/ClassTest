package recursionTest;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DirTree {
	
	//����Ŀ¼��ε��˸�
	private String space = "";
	
	
	public void tree(File file)
	{
		
		if(file.isFile()  || file.listFiles().length == 0)
		{
			System.out.println(space + file.getName());
		}
		else
		{
			File[] files = file.listFiles();
			
			System.out.println(space + file.getName());
			
			List<File> fileList = new ArrayList<File>();
			for (File f : files) {
			    fileList.add(f);
			}
			
			//�ļ����ļ��������ļ������ȣ�ͬʱΪ�ļ������ļ��а��ֵ�˳��
			Collections.sort(fileList, new Comparator<File>() {

				public int compare(File o1, File o2) {
					if (o1.isDirectory() && o2.isFile())
						return -1;
					if (o1.isFile() && o2.isDirectory())
						return 1;
					return o1.getName().compareTo(o2.getName());
				}
			});
			
			for(File f : fileList)
			{
				space = space + "--------";   //����Ŀ¼�Ĳ�� ��ÿ������һ��
				tree(f);
				space = space.substring(0, space.length() - 8); //����Ŀ¼�Ĳ�� ��ÿ���˳�һ��
			}
		}
	}
	
	public static void main(String[] args) {
		
		DirTree dirTree = new DirTree();
		
		dirTree.tree(new File("D:/VMware"));
		
	}

}
