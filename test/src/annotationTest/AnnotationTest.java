package annotationTest;


/**
 *
 * �Զ���ע��:��ע���е�������Ϊvalueʱ����ʹ��ʱ���Բ�ָ�����Ե����ƶ�ֱ��д������
 * ֵ���ɣ�����value��Ϊ������ֵ����Ҫʹ��value="value"���ָ�ֵ��ʽ������ȷָ��
 * �ڶ���Annotation��̬ʱ�����ܼ̳�������Annotation��̬���ǽӿ�
 *
 *������ʹ��@interface�ؼ��ֶ���һ��ע��ʱ����ע�������̳���java.lang.annotation.Annotation
 *�ӿڣ�
 *
 *������Ƕ�����һ���ӿڣ������øýӿڼ̳���Annotation����ô����������Ľӿ���Ȼ���ǽӿڲ���ע�⣬
 *
 *Annotation�����ǽӿڶ�����ע�⡣������Enum���
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