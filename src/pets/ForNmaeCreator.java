package pets;

import java.util.ArrayList;
import java.util.List;


public class ForNmaeCreator extends PetCreator{
	private static List<Class<? extends Pet>> types =
			new ArrayList<Class<? extends Pet>>();
	private static String[] typeNames ={
		"pets.Mutt",
		"pets.Pug",
		"pets.EgyptianMau",
		"pets.Manx",
		"pets.Cymric",
		"pets.Rat",
		"pets.Mouse",
		"pets.Hamster"
	};
	
	@SuppressWarnings("unchecked")
	private static void loader() {
		try{
			for (String name : typeNames) {
				types.add((Class<? extends Pet>)Class.forName(name));
				}
		}catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	static {loader();}
	
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}

}
