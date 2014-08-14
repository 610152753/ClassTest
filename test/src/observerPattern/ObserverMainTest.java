package observerPattern;

public class ObserverMainTest
{
	public static void main(String[] args)
	{
		Watched watched = new ConcreteWatched();
		
		watched.addWatcher(new ConcreteWatcher());
		watched.addWatcher(new ConcreteWatcher());
		watched.addWatcher(new ConcreteWatcher());
		
		watched.notified("Observer Test !");
	}
}
