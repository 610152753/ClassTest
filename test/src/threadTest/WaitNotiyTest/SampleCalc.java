package threadTest.WaitNotiyTest;

/**
 * 
 * wait与notify方法都是定义在Object类中，而且是final的，
 * 因此会被所有的Java类所继承并且无法重写。这两个方法要求在调用时线程应该已经获得了对象的锁，
 * 因此对这两个方法的调用需要放在synchronized方法或块当中。当线程执行了wait方法时，
 * 它会释放掉对象的锁。
 * 
 * 另一个会导致线程暂停的方法就是Thread 类的sleep 方法，它会导致线程睡眠指定
 * 的毫秒数，但线程在睡眠的过程中是不会释放掉对象的锁的。
 * 
 * @author Joe
 *
 */
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
//		if(0 == number)  //只能在两个线程的时候使用if作为判断，当多个线程（2个以上的时候）会出现异常，例如:
		// 同时有两个进入等待，来了一个通知，唤醒的线程不知道在等待的过程中发生了什么，却继续了后续的操作，唤醒后应该立即检查判断条件。
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
