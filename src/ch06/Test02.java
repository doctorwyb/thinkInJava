package ch06;

public class Test02 {
public static void main(String[] args) {
	//Sundae sundae=new Sundae();
	Sundae sundae2=Sundae.makeASundae();
}
}
class Sundae{
	private Sundae(){}
	static Sundae makeASundae(){
		return new Sundae();
	}
	
}
