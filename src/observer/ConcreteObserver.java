package observer;

public class ConcreteObserver implements Observer {
	private static int id;
	private int idx;

	public ConcreteObserver() {
		id++;
		idx = id;
	}

	@Override
	public void update(int v) {
		System.out.println("Observer " + idx + " receved new value " + v);
	}
}
