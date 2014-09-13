package junitTest;

public class ApplicationRunMain {

	public static void main(String[] args) throws Exception {
		
		ApplicationRunTool app = new ApplicationRunTool();
		
		int re = (Integer)app.run(ApplicationRunTest.class,new Integer[]{3,4});
		
		System.out.println(re);
	}
}
