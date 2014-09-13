package junitTest;

public class ApplicationRunMain {

	public static void main(String[] args) throws Exception {
		
		ApplicationRunTool app = new ApplicationRunTool();
		
		app.run(ApplicationRunTest.class);
	}
}
