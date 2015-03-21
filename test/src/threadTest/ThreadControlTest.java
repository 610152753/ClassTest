package threadTest;

public class ThreadControlTest {
	public static void main(String[] args) {
		
		ControlThread ct = new ControlThread();
		ct.StartThread();
		System.out.println("==============================");
		ct.StopThread();

	}
}

class ControlThread
{
	private ThreadT3 tt3 = new ThreadT3();
	
	public void StartThread()
	{
	   tt3.start();
	   System.out.println("StartThread !");
	}
	public void StopThread()
	{
		tt3.StopRunning();
		System.out.println("StopRunning !");
	}
}

class ThreadT3 extends Thread
{
	private boolean ctl = true;
	@Override
	public void run() {
		System.out.println("run Start !");
		while(ctl)
		{
			System.out.println("Control Test :" );
		}
	}
	
	public void StopRunning()
	{
		System.out.println("Stop Run !");
		ctl = false;
	}
	
}