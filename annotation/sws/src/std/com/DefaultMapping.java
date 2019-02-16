package std.com;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultMapping {
	String value() default "value~!"; 
	String name() default "name~!"; 
	int age() default 35; 
	String[] newNames() default {"newName1", "newName2"};
}
