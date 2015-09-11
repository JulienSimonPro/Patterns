package abstractFactory;

import factory.AbstractCar;
import factory.LuxuryCar;

public class LuxuryCarFactory implements ICarFactory {

	@Override
	public AbstractCar getCar() {
		// TODO Auto-generated method stub
		return new LuxuryCar();
	}

}
