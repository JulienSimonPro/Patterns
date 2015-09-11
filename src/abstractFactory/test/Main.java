package abstractFactory.test;

import abstractFactory.*;
import factory.AbstractCar;

public class Main {

	public static void main(String[] args) {
		AbstractCar cCar = CarFactory.getCar(new CheapCarFactory());
		AbstractCar lCar = CarFactory.getCar(new LuxuryCarFactory());
		System.out.println(cCar.toString());
		System.out.println(lCar.toString());
	}

}
