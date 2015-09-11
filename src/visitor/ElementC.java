package visitor;

public class ElementC implements Element {

	private int prixDeBase;
	private int pourcentageReduction;
	private String name;

	public ElementC(int prixDeBase, int pourcentageReduction, String name) {
		super();
		this.prixDeBase = prixDeBase;
		this.pourcentageReduction = pourcentageReduction;
		this.name = name;
	}

	public int getPrixDeBase() {
		return prixDeBase;
	}

	public void setPrixDeBase(int prixDeBase) {
		this.prixDeBase = prixDeBase;
	}

	public int getPourcentageReduction() {
		return pourcentageReduction;
	}

	public void setPourcentageReduction(int pourcentageReduction) {
		this.pourcentageReduction = pourcentageReduction;
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
		// TODO Auto-generated method stub
		return 0;
	}

}
