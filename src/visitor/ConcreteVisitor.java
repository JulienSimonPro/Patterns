package visitor;

public class ConcreteVisitor implements Visitor {

	@Override
	public int visit(ElementA eA) {
		int cost = eA.getPricePerKg() * eA.getWeight();
		System.out.println(
				eA.getWeight() + " kg de " + eA.getName() + " à " + eA.getPricePerKg() + "€/kg fait " + cost + "€");
		return cost;
	}

	@Override
	public int visit(ElementB eB) {
		int cost = eB.getPrice();
		System.out.println("Prix du livre : " + eB.getPrice() + "€");
		return cost;
	}

	@Override
	public int visit(ElementC elementC) {
		// TODO Auto-generated method stub
		return 0;
	}
}
