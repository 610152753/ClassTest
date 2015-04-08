package threadTest.WaitNotiyTest;

public class IncreaseThread extends Thread 
{
	
	private SampleCalc SampleCalc;
	
	public IncreaseThread(SampleCalc sample)
	{
		this.SampleCalc = sample;
	}
	
	@Override
	public void run() {
	
		for(int i = 0 ; i < 20 ; i ++)
		{
			try {
				Thread.sleep((long)Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			SampleCalc.increase();
		}
		
	}	

}
