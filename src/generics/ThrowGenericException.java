package generics;

import java.util.ArrayList;
import java.util.List;

interface Processor<T,E extends Exception>{
	void process(List<T> resultCollector) throws E;
}

class ProcessRunner<T,E extends Exception> extends ArrayList<Processor<T, E>>{
	List<T> processAll() throws E{
		List<T> resultCollector = new ArrayList<T>();
		for (Processor<T, E> processor : this) {
			processor.process(resultCollector);
		}
		return resultCollector;
	}
}

class Failrel extends Exception{}

class Processor1 implements Processor<String, Failrel>{
	static int count = 3;

	public void process(List<String> resultCollector) throws Failrel {
		if(count-- > 1){
			resultCollector.add("hep");
		}else {
			resultCollector.add("ho");
		}
		if(count < 0){
			throw new Failrel();
		}
	}
}
class Failre2 extends Exception{}

class Processor2 implements Processor<Integer, Failre2>{
	static int count = 2;
	
	public void process(List<Integer> resultCollector) throws Failre2 {
		if(count-- == 0){
			resultCollector.add(47);
		}else {
			resultCollector.add(11);
		}
		if(count < 0){
			throw new Failre2();
		}
	}
}

public class ThrowGenericException {
	public static void main(String[] args) {
		ProcessRunner<String, Failrel> runner = 
				new ProcessRunner<String, Failrel>();
		for (int i = 0; i < 3; i++) {
			runner.add(new Processor1());
		}
		try {
			System.out.println(runner.processAll());
		} catch (Failrel e) {
			System.out.println(e);
		}
		
		ProcessRunner<Integer, Failre2> runner2 = 
				new ProcessRunner<Integer, Failre2>();
		for (int i = 0; i < 3; i++) {
			runner2.add(new Processor2());
		}
		try {
			System.out.println(runner2.processAll());
		} catch (Failre2 e) {
			System.out.println(e);
		}
	}
}
