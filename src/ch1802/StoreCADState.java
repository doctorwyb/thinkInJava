package ch1802;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


abstract class Shape implements Serializable{
	public static final int RED = 1,BLUE = 2,GREEN = 3;
	private int xPos, yPos, dimension;
	private static Random rand = new Random(47);
	private static int counter = 0;
	public abstract void setColor(int newColor);
	public abstract int getColor();
	public Shape(int xPos, int yPos, int dimension) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.dimension = dimension;
	}
	@Override
	public String toString() {
		return  getClass() + "color[" +getColor()+ "] " +
				"[xPos=" + xPos + ", yPos=" + yPos + ", dimension=" + dimension + "]\n";
	}
	
	public static Shape randomFactory(){
		int xPos = rand.nextInt(100);
		int yPos = rand.nextInt(100);
		int dimension = rand.nextInt(100);
		switch (counter++ % 3) {
		default:
		case 0: return new Cricle(xPos, yPos, dimension);
		case 1: return new Square(xPos, yPos, dimension);
		case 2: return new Line(xPos, yPos, dimension);
		}
	}
}

class Cricle extends Shape{
	private static int color = RED;
	public Cricle(int xPos, int yPos, int dimension) {
		super(xPos, yPos, dimension);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setColor(int newColor) {
		color = newColor;
	}
	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return color;
	}
}

class Square extends Shape{
	private static int color;
	public Square(int xPos, int yPos, int dimension) {
		super(xPos, yPos, dimension);
		color = RED;
	}
	@Override
	public void setColor(int newColor) {
		color = newColor;
	}
	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return color;
	}
}

class Line extends Shape{
	private static int color = RED;
	public static void serializeState(ObjectOutputStream os) throws IOException{
		os.writeInt(color);
	}
	public static void deserializeState(ObjectInputStream os) throws IOException{
		color = os.readInt();
	}
	public Line(int xPos, int yPos, int dimension) {
		super(xPos, yPos, dimension);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setColor(int newColor) {
		color = newColor;
	}

	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return color;
	}
	
}
public class StoreCADState {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Class<? extends Shape>> shapTypes = new ArrayList<Class<? extends Shape>>();
		shapTypes.add(Cricle.class);
		shapTypes.add(Square.class);
		shapTypes.add(Line.class);
		List<Shape> shapes = new ArrayList<Shape>();
		for (int i = 0; i < 10; i++) {
			shapes.add(Shape.randomFactory());
		}
		for (int i = 0; i < 10; i++) {
			((Shape)shapes.get(i)).setColor(Shape.GREEN);
		}
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("CADState.out"));
		out.writeObject(shapTypes);
		Line.serializeState(out);
		out.writeObject(shapes);
		System.out.println(shapes);
	}
}
