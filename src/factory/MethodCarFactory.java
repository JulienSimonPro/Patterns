package factory;

public class MethodCarFactory {
	public static final int LUXURY = 0;
	public static final int CHEAP = 1;

	private MethodCarFactory() {
	}

	public static AbstractCar getCar(int type) throws Exception {
		switch (type) {
		case LUXURY:
			return new LuxuryCar();
		case CHEAP:
			return new CheapCar();
		default:
			throw new Exception("type de voiture indéfini");
		}
	}
}
