package ch19;

import static ch19.Spiciness.*;
public class Burrito {
	Spiciness degree;

	public Burrito(Spiciness degree) {
		super();
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Burrito [degree=" + degree + "]";
	}
	public static void main(String[] args) {
		System.out.println(new Burrito(NOT));
		System.out.println(new Burrito(MEDIUM));
		System.out.println(new Burrito(HOT));
	}
}
