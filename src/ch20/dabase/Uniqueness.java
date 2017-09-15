package ch20.dabase;

public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique = true);
}
