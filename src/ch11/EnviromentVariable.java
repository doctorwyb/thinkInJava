package ch11;

import java.util.Map;

public class EnviromentVariable {
	public static void main(String[] args) {
		for(Map.Entry entry : System.getenv().entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
