package observer;

import java.util.Observable;
import java.util.Observer;

public class Screen implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof DataStore) {
			System.out.println("New value: " + ((DataStore) o).getData());
		}
	}

}
