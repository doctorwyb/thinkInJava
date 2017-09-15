package ch19;

import java.util.Random;

import net.mindview.util.Generator;


enum CartoonCharacter implements Generator<CartoonCharacter>{
	AAA,BBB,CCC,DDD,EEE;
	private Random rand = new Random(47);
	public CartoonCharacter next() {
		return values()[rand.nextInt(values().length)];
	}
}

public class EnumImplementation {
	public static <T> void printNext(Generator<T> rg){
		System.out.println(rg.next() + ",");
	}
	public static void main(String[] args) {
		CartoonCharacter cc = CartoonCharacter.EEE;
		for (int i = 0; i < 10; i++) {
			printNext(cc);
		}
	}
}
