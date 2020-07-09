package lesson.konwledge.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.sound.midi.Patch;

public class NIOTest {

	public static void main(String[] args) {
		Path p = Paths.get("D:/a_Program/Java/java_training1/File/test1.txt");
		
		System.out.println(p.getFileName());//获取文件名
		System.out.println(p.getNameCount());//获取文件节点数
		System.out.println(p.getRoot());//获取文件根目录
		System.out.println(p.getParent());//获取文件上级关联目录
		
		try {
			Files.copy(Paths.get("D:/a_Program/Java/java_training1/File/test1.txt"),Paths.get("D:/a_Program/Java/java_training1/File/test2.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
