package ch18;

import java.io.File;

import net.mindview.util.Directory;
import net.mindview.util.PPrint;

public class DirectoryDemo {
	public static void main(String[] args) {
		PPrint.pprint(Directory.walk("./src").dirs);
		for(File file : Directory.local("./src/ch18", "D.*")){
			System.out.println(file);
		}
		System.out.println("-----------");
		for(File file : Directory.walk(".", "T.*\\.java")){
			System.out.println(file);
		}
		System.out.println("=============");
		for(File file : Directory.walk(".", ".*[Zz].*\\.class")){
			System.out.println(file);
		}
	}
}
