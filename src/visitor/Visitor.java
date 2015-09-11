package visitor;

public interface Visitor {
	int visit(ElementA eA);
	int visit(ElementB eB);
	int visit(ElementC elementC);
}
