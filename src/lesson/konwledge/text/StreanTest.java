package lesson.konwledge.text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreanTest {

	public static void main(String[] args) {
		//输入流
		File fl = new File("D:/a_Program/Java/java_training1/File/test2.txt");
		try {
			FileInputStream flis = new FileInputStream(fl);
			try {			
				byte bt[] = new byte[flis.available()];
				flis.read(bt);
				for(byte b : bt) {
					System.out.print((char)b);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
