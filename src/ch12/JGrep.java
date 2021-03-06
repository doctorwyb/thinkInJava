package ch12;

//{Args: JGrep.java "\\b[Ssct]\\W+"}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class JGrep extends Exception{
	public static void main(String[] args) {
		if(args.length < 2){
			System.out.println("Usage: java JGrep file regex");
			System.exit(0);
		}
		Pattern p = Pattern.compile(args[1]);
		int index = 0;
		Matcher m = p.matcher("");
		for(String line : new TextFile(args[0])){
			m.reset(line);
			while(m.find()){
				System.out.println(index++ + ": "+
						m.group() + ": " +m.start());
			}
		}
	}
}

