package interfaces;

import ch06.Shape;



//适配器设计模式
public class FilterProcessor {
public static void main(String[] args) {
	Waveform w=new Waveform();
	Apply.process(new FilterAdapter(new LowPass(1.0)), w);
	Apply.process(new FilterAdapter(new HighPass(2.0)), w);
}
}
class FilterAdapter implements Processor{
	Filter filter;
	public FilterAdapter(Filter filter) {
		// TODO Auto-generated constructor stub
		this.filter=filter;
	}

	public String name() {
		// TODO Auto-generated method stub
		return filter.name();
	}

	public Waveform process(Object input) {
		// TODO Auto-generated method stub
		return filter.process((Waveform)input);
	}
	
}
