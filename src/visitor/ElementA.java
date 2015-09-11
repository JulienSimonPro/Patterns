package visitor;

public class ElementA implements Element {

	private int pricePerKg;
	private int weight;
	private String name;

	public ElementA(int pricePerKg, int weight, String name) {
		super();
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public int accept() {
		int cost = getPricePerKg() * getWeight();
		System.out.println(getWeight() + " kg de " + getName() + " à " + getPricePerKg() + "€/kg fait " + cost + "€");
		return cost;
	}

}
