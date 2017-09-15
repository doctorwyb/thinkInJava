package ch12;

public class CleanUp {
	public static void main(String[] args) {
		try {
			InputFile in=new InputFile("src/ch12/CleanUp.java");
			try {
				String s;
				int i=1;
				while((s=in.getLine())!=null);
			} catch (Exception e) {
				System.out.println("Caugth Exception in main");
				e.printStackTrace(System.out);
			}finally{
				in.dispose();
			}
		} catch (Exception e) {
			System.out.println("InputFile construction failed");
		}
		
	}

}
