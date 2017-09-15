package ch19;

import java.util.EnumMap;
import java.util.Map;

import static ch19.AlarmPoints.*;
interface Command{
	void action();
};
public class EnumMaps {
	public static void main(String[] args) {
		EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
		em.put(KITCHEN, new Command() {
			public void action() {
				// TODO Auto-generated method stub
				System.out.println("Kitchen fire");
			}
		});
		em.put(BATHROMM, new Command() {
			public void action() {
				// TODO Auto-generated method stub
				System.out.println("Bathroom alert");
			}
		});
		for(Map.Entry<AlarmPoints, Command> e : em.entrySet()){
			System.out.print(e.getKey() + ": ");
			e.getValue().action();
		}
		try{
			em.get(UTILITY).action();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
