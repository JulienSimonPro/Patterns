package strategy.test;

import strategy.*;

public class Main {

	public static void main(String[] args) {
		Sonic s = new Sonic(new DefaultMoveStrategy());
		s.move();
		s.changeStrategy(new QuickMoveStrategy());
		s.move();
	}
}
