package ch20;

@ExtractInterface("IMulitpltier")
public class Mulitpltier {
	public int multiply(int x, int y){
		int total = 0;
		for (int i = 0; i < x; i++) {
			total = add(total, y);
		}
		return total;
	}
	private int add(int x,int y){
		return x + y;
	}
	public static void main(String[] args) {
		Mulitpltier m = new Mulitpltier();
		System.out.println("11*16 = " + m.multiply(11, 16));
	}
}
