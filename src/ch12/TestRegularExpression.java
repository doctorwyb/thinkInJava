package ch12;

//{args: abcabcabcdefabc "abc+" "{abc}+" "(abc){2,}"}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
	public static void main(String[] args) {
		String[] args2={"abcabcabcdefabc","abc+","(abc)+","(abc){2,}"};
		if(args2.length < 2){
			System.out.println("Usage:\njava TestRegularExpression "+
					"characterSequence regularExpression+");
			System.exit(0);
		}
		
		System.out.println("Input: \""+ args2[0] + "\"");
		
		for(String arg : args2){
			System.out.println("Regular expression: \""+ arg + "\"");
			Pattern p=Pattern.compile(arg);
			Matcher m=p.matcher(args2[0]);
			while(m.find()){
				System.out.println("Match \"" + m.group() + "\" at positions " +
						m.start() + "-" + (m.end()-1));
			}
		}
	}
}
