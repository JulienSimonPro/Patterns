package factory.test;

import factory.MethodCarFactory;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println(MethodCarFactory.getCar(MethodCarFactory.LUXURY));
		System.out.println(MethodCarFactory.getCar(MethodCarFactory.CHEAP));
	}

}
