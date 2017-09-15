package ch19;

import static ch19.Outcome.*;

import java.util.EnumMap;

public enum RoShaBo5 implements Competitor<RoShaBo5>{
	PAPER,SCISSORS,ROCK;
	static EnumMap<RoShaBo5, EnumMap<RoShaBo5, Outcome>> table = 
			new EnumMap<RoShaBo5, EnumMap<RoShaBo5,Outcome>>(RoShaBo5.class);
	static{
		for (RoShaBo5 it : RoShaBo5.values()) {
			table.put(it, new EnumMap<RoShaBo5,Outcome>(RoShaBo5.class));
		}
		initRow(PAPER, DRAW, LOSE, WIN);
		initRow(SCISSORS, WIN, DRAW, LOSE);
		initRow(ROCK, LOSE, WIN, DRAW);
	}
	static void initRow(RoShaBo5 it,Outcome vPAPER, Outcome vSCIOSSORS, Outcome vROCK){
		 EnumMap<RoShaBo5, Outcome> row = RoShaBo5.table.get(it);
		 row.put(PAPER, vPAPER);
		 row.put(SCISSORS, vSCIOSSORS);
		 row.put(ROCK, vROCK);
	}
	public Outcome compete(RoShaBo5 it) {
		// TODO Auto-generated method stub
		return table.get(this).get(it);
	}
	public static void main(String[] args) {
		RoShaBo.play(RoShaBo5.class, 20);
	}

}
