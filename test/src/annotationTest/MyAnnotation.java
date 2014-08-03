package annotationTest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation
{
	String address() default "shanghai";
	
	String world();
}
