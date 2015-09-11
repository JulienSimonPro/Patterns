package builder.test;

import builder.*;

public class Main {

	public static void main(String[] args) {
		ComplexObject complexObject = new ComplexObject.ComplexObjectBuilder("Julien", "SIMON").setAuto(true)
				.setBig(true)
				// .setNumber(42)
				.build();
		System.out.println(complexObject);
	}

}
