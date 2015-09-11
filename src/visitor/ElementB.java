package visitor;

public class ElementB implements Element {

	private int price;
	private String isbnNumber;

	public ElementB(int price, String isbnNumber) {
		super();
		this.price = price;
		this.isbnNumber = isbnNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public int accept() {
		int cost = getPrice();
		System.out.println("Prix du livre : " + getPrice() + "€");
		return cost;
	}

}
