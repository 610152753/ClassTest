package annotationTest;


/**
 *
 * �Զ���ע��:��ע���е�������Ϊvalueʱ����ʹ��ʱ���Բ�ָ�����Ե����ƶ�ֱ��д������
 * ֵ���ɣ�����value��Ϊ������ֵ����Ҫʹ��value="value"���ָ�ֵ��ʽ������ȷָ��
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