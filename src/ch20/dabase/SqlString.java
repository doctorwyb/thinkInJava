package ch20.dabase;

import java.lang.annotation.*;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SqlString {
	int value() default 0;
	String name() default "";
	Constraints constraints() default @Constraints;
}
