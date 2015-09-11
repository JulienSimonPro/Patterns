package singleton;

public class Test {
	private static int _i = 0;

	private Test() {
	}

	public static int getTest() {
		if (_i == 0) {
			_i = (int) (1000 * Math.random());
		}
		return _i;
	}
}
