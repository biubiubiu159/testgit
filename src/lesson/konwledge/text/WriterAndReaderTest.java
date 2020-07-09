package lesson.konwledge.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterAndReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("D:/a_Program/Java/java_training1/File/test.txt");
			int c;
			while((c = fr.read()) != -1) {
				System.out.print((char)c);
			}
			
		 
		 FileWriter fw = new FileWriter("D:/a_Program/Java/java_training1/File/test1.txt");
		 char[] ch  = new char[1024];
		 while(fr.read(ch) != -1) {
			 fw.write(ch);
		 }
		 fw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
