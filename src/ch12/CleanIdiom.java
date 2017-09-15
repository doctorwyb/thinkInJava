package ch12;

class NeedsCleanup{
	private static long count=1;
	private final long id=count++;
	public void dispose(){
		System.out.println("NeedCleanup "+id+" disposed");
	}
}

class ConstructionException extends Exception{}

class NeedsCleanup2 extends NeedsCleanup{
	public NeedsCleanup2() throws ConstructionException{}
}

public class CleanIdiom {
	public static void main(String[] args) {
		//Section 1
		NeedsCleanup nc1= new NeedsCleanup();
		try {
			//....
		} finally{
			nc1.dispose();
		}
		
		//Section 2
		NeedsCleanup nc2= new NeedsCleanup();
		NeedsCleanup nc3= new NeedsCleanup();
		try {
			//....
		} finally{
			nc3.dispose();
			nc2.dispose();
		}
		
		//Section 3
		try {
			NeedsCleanup2 nc4=new NeedsCleanup2();
			try {
				NeedsCleanup2 nc5=new NeedsCleanup2();
				try {
					//....
				} finally{
					nc5.dispose();
				}
			} catch (ConstructionException e) {
				System.out.println(e);
			}finally{
				nc4.dispose();
			}
		} catch (ConstructionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
}
