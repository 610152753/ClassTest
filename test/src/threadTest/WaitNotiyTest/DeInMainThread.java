package threadTest.WaitNotiyTest;

public class DeInMainThread {
	
	public static void main(String[] args) {
		
		SampleCalc sample = new SampleCalc();
		
		IncreaseThread inc = new IncreaseThread(sample);
		
		DecreaseThread dec = new DecreaseThread(sample);
		
		IncreaseThread inc1 = new IncreaseThread(sample);
		
		DecreaseThread dec1 = new DecreaseThread(sample);
		
		inc.start();
		dec.start();
		
		inc1.start();
		dec1.start();
		
	}
}
