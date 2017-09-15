package ch06;

 class Grain {
public String toString(){return "Grain";}
 }
 
class Wheat extends Grain{
	public String toString(){return "Wheat";}
}

class Mail{
	Grain process(){return new Grain();}
}

class WheatMail extends Mail{
	Wheat propess(){return new Wheat();}
}

public class Test04{
	public static void main(String[] args) {
		Mail m=new Mail();
		Grain g=m.process();
		System.out.println(g);
		m=new WheatMail();
		g=m.process();
		System.out.println(g);
	}
}
