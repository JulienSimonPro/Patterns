package visitor.test;

import visitor.*;

public class Main {

	public static void main(String[] args) {
		ElementA eA = new ElementA(2, 5, "pouf");
		ElementB eB = new ElementB(12, "1258B");
		Element[] e = {eA, eB};
		
		int sum = 0;
		Visitor visitor = new ConcreteVisitor();
		for (Element element : e) {
			sum += element.accept(visitor);
		}
		System.out.println("Total : " + sum);
	}

}
