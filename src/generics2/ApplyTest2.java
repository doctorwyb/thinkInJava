package generics2;

import java.util.ArrayList;
import java.util.List;

public class ApplyTest2 {
	public static void main(String[] args) throws Exception {
		List<Shape> shapes = new ArrayList<Shape>();
		for (int i = 0; i < 10; i++) {
			shapes.add(new Shape());
		}
		Apply.apply(shapes, Shape.class.getMethod("rotate"));
		Apply.apply(shapes, Shape.class.getMethod("resize",int.class), 5);
		List<Square> squares = new ArrayList<Square>();
		for (int i = 0; i < 10; i++) {
			shapes.add(new Square());
		}
		Apply.apply(squares, Shape.class.getMethod("rotate"));
		Apply.apply(squares, Shape.class.getMethod("resize",int.class), 5);
		
		Apply.apply(new FilledList<Shape>(Shape.class, 10), Shape.class.getMethod("rotate"));
		Apply.apply(new FilledList<Shape>(Shape.class, 10), Square.class.getMethod("rotate"));
		
		SimpleQueue<Shape> shapeQ = new SimpleQueue<Shape>();
		for (int i = 0; i < 5; i++) {
			shapeQ.add(new Shape());
			shapeQ.add(new Square());
		}
		Apply.apply(shapeQ, Shape.class.getMethod("rotate"));
	}
}
