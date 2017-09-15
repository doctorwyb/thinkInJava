package ch12;

public class AlwaysFinally {
	public static void main(String[] args) {
		System.out.println("Entering first try block");
		try {
			System.out.println("Entering second try block");
			try{
				throw new FourException();
			} finally {
				System.out.println("Finally in 2nd try block");
			}
			
		} catch (FourException e) {
			System.out.println("Caught FourException in 1st try block");
		}finally {
			System.out.println("Finally in 1nd try block");
		}
	}
}
