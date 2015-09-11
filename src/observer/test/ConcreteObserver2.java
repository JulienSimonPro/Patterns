package observer.test;

import observer.Observer;

public class ConcreteObserver2 implements Observer {
	private static int id;
	private int idx;

	public ConcreteObserver2() {
		id++;
		idx = id;
	}

	@Override
	public void update(int v) {
		System.out.println("Observer2 " + idx + " receved new value " + v);

	}

}
