package annotationTest;


/**
 *
 * 自定义注解:当注解中的属性名为value时，在使用时可以不指定属性的名称而直接写上属性
 * 值即可；除了value以为的其它值都需要使用value="value"这种赋值方式，即明确指定
 * 
 */
public @interface AnnotationTest
{
	String[] value() default "hello";
	
	String value1();
	
	EnumTest value2() default EnumTest.HELLO;
}
enum EnumTest
{
	HELLO,WORLD,WELCOME;
}