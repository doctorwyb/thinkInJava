package ch19;

import java.util.Iterator;

import net.mindview.util.Enums;

class Mail{
	enum GeneralDelivery{YES,NO1,NO2,NO3,NO4,NO5}
	enum Scannability{UNSCANNABLE,YES1,YES2,YES3,YES4}
	enum Readability{ILLEGIBLE,YES1,YES2,YES3,YES4}
	enum ADDRESS{INCORRECT,OK1,OK2,OK3,OK4,OK5,OK6}
	enum RETURNADDRESS{MISSING,OK1,OK2,OK3,OK4,OK5}
	GeneralDelivery generalDelivery;
	Scannability scannability;
	Readability readability;
	ADDRESS address;
	RETURNADDRESS returnAddress;
	static long counter;
	long id = counter++;
	public String toString(){
		return "Mail " + id;
	}
	public String details(){
		return toString() + 
				",General Delivery: " + generalDelivery +
				",Address Scannability: " + scannability +
				",Address Readability: " + readability +
				",Address address: " + address +
				",Return address: " + returnAddress ;
	}
	//Generate test Mail
	public static Mail randomMail(){
		Mail m = new Mail();
		m.generalDelivery = Enums.random(GeneralDelivery.class);
		m.scannability = Enums.random(Scannability.class);
		m.readability = Enums.random(Readability.class);
		m.address = Enums.random(ADDRESS.class);
		m.returnAddress = Enums.random(RETURNADDRESS.class);
		return m;
	} 
	public static Iterable<Mail> generator(final int count){
		return new Iterable<Mail>() {
			int n = count;
			public Iterator<Mail> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<Mail>() {
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return n-- >0;
					}
					public Mail next() {
						// TODO Auto-generated method stub
						return randomMail();
					}
					public void remove() {
						// TODO Auto-generated method stub
						
					}
				};
			}
		};
		
	}
}
public class PostOffice {
	enum MailHandler{
		GENERAL_DELIVERY{
			boolean handle(Mail m){
				switch(m.generalDelivery){
					case YES:
						System.out.println("Useing general delivery for " + m);
						return true;
					default: return false;
				}
			}
		},
	}
}
