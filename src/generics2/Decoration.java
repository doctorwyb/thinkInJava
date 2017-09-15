package generics2;


import java.util.Date;

class Basic {
	private String value;
	public void set(String val) {
		value = val;
	}
	public String get() {
		return value;
	}
}

class Decorator extends Basic{
	protected Basic basic;
	
	public Decorator(Basic basic) {
		super();
		this.basic = basic;
	}
	public void set(String val) {
		// TODO Auto-generated method stub
		basic.set(val);
	}
	public String get() {
		// TODO Auto-generated method stub
		return basic.get();
	}
}

class TimeStamped extends Decorator{
	private final long timeStamp;
	public TimeStamped(Basic basic) {
		super(basic);
		timeStamp = new Date().getTime();
	}
	public long getStamp(){
		return timeStamp;
	}
}

class SerialNumbered extends Decorator{
	private static long counter = 1;
	private final long serialNumber = counter++;
	public long getSerialNumber() {
		// TODO Auto-generated method stub
		return serialNumber;
	}
	public SerialNumbered(Basic basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}
}

public class Decoration {
	public static void main(String[] args) {
		TimeStamped t1 = new TimeStamped(new Basic());
		TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));
		t2.getStamp();
		SerialNumbered s1 = new SerialNumbered(new Basic());
		SerialNumbered s2 = new SerialNumbered(new TimeStamped(new Basic()));
		s2.getSerialNumber();
		
	}
}
