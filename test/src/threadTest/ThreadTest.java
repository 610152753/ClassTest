package threadTest;


/**
 * 
 * 进程:执行中的程序（程序是静态的概念，进程是动态的概念）
 * 
 * 线程是程序内的顺序控制流，只能使用分配给程序的资源和环境。
 * 
 * 多线程编程的目的，就是"最大限度地利用CPU资源"(当某一线程的处理不需要占用CPU而只和I/O等资源打交道时，
 *   让需要占用CPU资源的其它线程有机会获得CPU资源。从根本上说，这就是多线程编程的最终目的。)
 * 
 * 当程序启动运行时，就自动产生一个线程，主方法main就在这个主线程上运行
 * 
 * 
 * 1.基于进程的多任务处理是更熟悉的形式。进程（process）本质上是一个执行的程序。
 *   因此基于进程的多任务处理的特点是允许你的计算机同时运行两个或更多的程序。
 *   举例来说，基于进程的多任务处理使你在运用文本编辑器的时候可以同时运行Java编译器。
 *   在基于进程的多任务处理中，程序是调度程序所分派的最小代码单位。
 * 2.而在基于线程（thread-based）的多任务处理环境中，线程是最小的执行单位。
 *   这意味着一个程序可以同时执行两个或者多个任务的功能。例如，一个文本编辑器可以在打印的同时格式化文本
 * 
 * 有两种技术来为线程提供run方法。
 * 1.继承Thread类并重写run方法。
 * 2.通过定义实现Runnable接口的类进而实现run方法。
 * 
 * Thread类在缺省情况下run方法什么都不做。可以通过继承Thread类并重写Thread类的run方法实现用户线程。
 * 
 * 
          总结：
	1.两种方法均需执行线程的start方法为线程分配必须的系统资源、调度线程运行并执行线程的run方法。
	2.在具体应用中，采用哪种方法来构造线程体要视情况而定。通常，当一个线程已继承了另一个类时，就应该用第二种方法来构造，即实现Runnable接口。
	3.线程的消亡不能通过调用一个stop()命令。而是让run()方法自然结束。
 * 
 * 
 * 
 * 
 * 
 * @author Joe
 *
 */
public class ThreadTest {
	public static void main(String[] args) {
		FirstThread ft = new FirstThread();
		PrimeRun pr = new PrimeRun();

		
		ft.start();
		new Thread(pr).start();
		
	}
}

class FirstThread extends Thread
{
	@Override
	public void run() {
		
		for(int i = 1; i< 1000; i++)
		{
		  System.out.println("This is Thread " + i + "  !");
		}
	}
}

class PrimeRun implements Runnable
{
	public void run() {
		
		for(int i = 1 ; i < 100 ; i ++)
		{
			System.out.println("Runnable implements Thread " + i + " !");
		}
		
	}
}