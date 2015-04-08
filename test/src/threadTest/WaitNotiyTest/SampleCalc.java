package threadTest.WaitNotiyTest;

public class SampleCalc {
	
	private int number;
	
	public synchronized void increase()
	{
//		if(0 != number)  //只能在两个线程的时候使用if作为判断，当多个线程（2个以上的时候）会出现异常，例如:
		// 同时有两个进入等待，来了一个通知，唤醒的线程不知道在等待的过程中发生了什么，却继续了后续的操作，唤醒后应该立即检查判断条件。
		while(0 != number) //
		{
			
			//如果number不是0的时候就会进入等待的状态，等待notify
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		number++;
		
		System.out.println(number);
		
		notify();
	}
	
	public synchronized void decrease()
	{
//		if(0 == number)
		while(0 == number)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		number--;
		
		System.out.println(number);
		
		notify();
	}
}
