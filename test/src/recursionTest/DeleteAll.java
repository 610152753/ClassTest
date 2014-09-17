package recursionTest;

import java.io.File;

public class DeleteAll {
	
	
	public void delAll(String path)
 {

		File file = new File(path);
		
		if (file.isFile() || (file.list().length == 0)) {
			file.delete();
		} else {
			
			String[] files = file.list();

			for (String f : files) {
				
				System.out.println(file.getPath());

				delAll((file.getPath()) + File.separator  + f);
				
				new File((file.getPath()) + File.separator  + f).delete();
			}
		}

	}
	
	
	public void delAll1(File file)
 {
		
		//确定出口
		if (file.isFile() || (file.list().length == 0)) {
			file.delete();
		} else {
			
			File[] files = file.listFiles();

			for (File f : files) {

				delAll1(f);
				f.delete();
			}
			
			//最后删除自己文件夹，最后的处理
			file.delete();
		}

	}
	
	public static void main(String[] args) {
		
		DeleteAll de = new DeleteAll();
		
		de.delAll1(new File("D:/aaa"));
//		de.delAll( "D:/aaa/sdagsda");
		
	}
	

}
