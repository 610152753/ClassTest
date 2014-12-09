package decorator_Wrapper;

/**
 * 
 * 具体构件角色（Concrete Component）：定义一个将要接收附加责任的类。
 * 
 * @author Joe
 *
 */
public class ConcreteConponent implements Component {

	public void dosomething() {

		System.out.println("功能A");
	}

}
