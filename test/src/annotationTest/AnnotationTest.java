package annotationTest;


/**
*
* 自定义注解:当注解中的属性名为value时，在使用时可以不指定属性的名称而直接写上属性
* 值即可；除了value以为的其它值都需要使用value="value"这种赋值方式，即明确指定
* 在定义Annotation型态时，不能继承其它的Annotation型态或是接口
*
*当我们使用@interface关键字定义一个注解时，该注解隐含继承了java.lang.annotation.Annotation
*接口；
*
*如果我们定义了一个接口，并且让该接口继承自Annotation，那么我们所定义的接口依然还是接口不是注解，
*
*Annotation本身是接口而不是注解。可以与Enum类比
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