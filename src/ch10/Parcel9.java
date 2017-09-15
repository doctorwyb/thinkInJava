package ch10;

public class Parcel9 {
public Destination destination(final String dest){
	return new Destination() {
		private String lable=dest;
		public String readLable() {
			return lable;
		}
	};
	
} 
public static void main(String[] args) {
	
}
}
