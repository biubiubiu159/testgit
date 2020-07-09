package lesson.konwledge.text;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建File对象
		File fl = new File("D:/a_Program/Java/java_training1/File/test.txt");
		
		System.out.println("文件是否存在："+fl.exists());
		
		//创建文件
		try {
			fl.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("文件是否存在："+fl.exists());
		
		System.out.println("文件名："+fl.getName());
		System.out.println("文件路径："+fl.getPath());
		System.out.println("文件绝对路径："+fl.getAbsolutePath());
		System.out.println("文件是否可读："+fl.canRead());
		System.out.println("文件是否可写："+fl.canWrite());
		
		fl.delete();//文件删除
		
		System.out.println("文件是否可读："+fl.canRead());
		System.out.println("文件是否可写："+fl.canWrite());
		
		System.out.println(fl.toString());
	}

}
