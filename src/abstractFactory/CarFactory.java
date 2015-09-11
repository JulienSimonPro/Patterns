package abstractFactory;

import factory.AbstractCar;

public class CarFactory {
	private CarFactory(){}
	
	public static AbstractCar getCar(ICarFactory iCarFactory){
		return iCarFactory.getCar();
	}
}
