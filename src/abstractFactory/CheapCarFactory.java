package abstractFactory;

import factory.AbstractCar;
import factory.CheapCar;

public class CheapCarFactory implements ICarFactory {
	@Override
	public AbstractCar getCar() {
		return new CheapCar();
	}

}
