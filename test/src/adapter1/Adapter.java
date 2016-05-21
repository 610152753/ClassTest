package adapter1;

public class Adapter implements Target {
	
   private Adaptee adaptee;
	
   public Adapter(Adaptee adaptee)
   {
	   this.adaptee = adaptee;
   }
	
	public void method1() {
		
		adaptee.method2();
	}

}
