package ch19;

import static ch19.Outcome.*;
public enum RoShaB02 implements Competitor<RoShaB02>{
	PAPER(DRAW,WIN,LOSE),
	SCIOSSORS(WIN,DRAW,LOSE),
	ROCK(LOSE,WIN,DRAW),
	;
	private Outcome vPAPER,vSCIOSSORS,vROCK;
	
	private RoShaB02(Outcome PAPER, Outcome SCIOSSORS, Outcome ROCK) {
		this.vPAPER = PAPER;
		this.vSCIOSSORS = SCIOSSORS;
		this.vROCK = ROCK;
	}
	
	public Outcome compete(RoShaB02 it) {
		switch(it){
			default:
			case PAPER:
				return vPAPER;
			case SCIOSSORS:
				return vSCIOSSORS;
			case ROCK:
				return vROCK;
		}
	}
	public static void main(String[] args) {
		RoShaBo.play(RoShaB02.class, 20);
	}

}
