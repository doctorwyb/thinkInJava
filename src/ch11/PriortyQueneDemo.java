package ch11;

import java.util.*;



public class PriortyQueneDemo {
	public static void main(String[] args) {
	PriorityQueue<Integer> priortyQueue=new PriorityQueue<Integer>();
	Random rand =new Random(47);
	for (int i = 0; i < 10; i++) {
		priortyQueue.offer(rand.nextInt(i+10));
		}
	QueneDemo.printQ(priortyQueue);
	List<Integer> ints=Arrays.asList(25,22,20,
			18,14,9,3,1,1,2,3,9,14,18,21,23,25);
	priortyQueue=new PriorityQueue<Integer>(ints);
	QueneDemo.printQ(priortyQueue);
	//priortyQueue= new PriorityQueue<Integer>(ints.size().Collection.reverseOrder());
	priortyQueue.addAll(ints);
	QueneDemo.printQ(priortyQueue);
	}

}
