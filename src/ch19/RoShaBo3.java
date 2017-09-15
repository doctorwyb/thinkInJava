package ch19;

import static ch19.Outcome.*;

public enum RoShaBo3 implements Competitor<RoShaBo3>{
	PAPER{
		public Outcome compete(RoShaBo3 it){
			switch(it){
				default:
				case PAPER:
					return DRAW;
				case SCIOSSORS:
					return LOSE;
				case ROCK:
					return WIN;
		}
		}
	},
	SCIOSSORS{
		public Outcome compete(RoShaBo3 it){
			switch(it){
			default:
			case PAPER:
				return WIN;
			case SCIOSSORS:
				return DRAW;
			case ROCK:
				return LOSE;
			}
		}
	},
	ROCK{
		public Outcome compete(RoShaBo3 it){
			switch(it){
			default:
			case PAPER:
				return LOSE;
			case SCIOSSORS:
				return WIN;
			case ROCK:
				return DRAW;
			}
		}
	};

	public abstract Outcome compete(RoShaBo3 it);
	public static void main(String[] args) {
		RoShaBo.play(RoShaBo3.class, 20);
	}
}
