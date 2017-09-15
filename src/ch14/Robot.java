package ch14;

import java.util.List;

import net.mindview.util.Null;

public interface Robot {
	String name();
	String modle();
	List<Operation> operations();
	class Test{
		public static void test(Robot r){
			if (r instanceof Null) {
				System.out.println("[Null Robot]");
			}
			System.out.println("Robot name: " + r.name());
			System.out.println("Robot modle: " + r.modle());
			for (Operation operation : r.operations()) {
				System.out.println(operation.description());
				operation.command();
			}
		}
	}
}
