package observer.test;

import observer.*;

public class Main {

	public static void main(String[] args) {
//		testObserverPerso();
		testObserverJava();
	}
	
	@SuppressWarnings("unused")
	private static void testObserverPerso(){
		ConcreteSubject sujet = new ConcreteSubject();
		Observer o1 = new ConcreteObserver();
		Observer o2 = new ConcreteObserver();
		Observer o3 = new ConcreteObserver();
		Observer o4 = new ConcreteObserver2();

		sujet.register(o1);
		sujet.register(o2);
		sujet.register(o3);
		sujet.register(o4);

		sujet.setValue(42);		
	}
	
	private static void testObserverJava(){
		Screen sujet = new Screen();
		DataStore ds = new DataStore();
		ds.addObserver(sujet);
		ds.setData("Some data");
		ds.setData("New data");
	}

}
