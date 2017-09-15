package ch19;

public interface Food {
	enum Appetizer implements Food{
		SALAD,SOUP,SPRING_ROLLS;
	}
	enum MainCourse implements Food{
		QWEQ,QWDAS,S,D,
	}
	enum Dessert implements Food{
		CCC,VVV,
	}
	enum Coffee implements Food{
		FFF,HHH,
	}
}
