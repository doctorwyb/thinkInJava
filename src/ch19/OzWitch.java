package ch19;

import static net.mindview.util.Print.*;

public enum OzWitch {
	WEST("aaaaaaaaaaaa"),
	NORTH("bbbbbbbbbbbbbb"),
	EAST("cccccccccc"),
	SOUTH("ddddddddd");
	
	private String description;
	private OzWitch(String description){
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	public static void main(String[] args) {
		for(OzWitch witch : OzWitch.values()){
			print(witch + ": " + witch.getDescription());
		}
	}
}
