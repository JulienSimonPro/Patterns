package composite.test;

import composite.*;

public class Main {

	public static void main(String[] args) {
		Composite component = new Composite();
		component.add(new Leaf());
		component.add(new Composite());
		Composite component2 = new Composite();
		component2.add(component);
		component2.drow();
	}

}
