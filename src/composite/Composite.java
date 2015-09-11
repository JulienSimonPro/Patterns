package composite;

import java.util.ArrayList;

public class Composite implements Component {
	private ArrayList<Component> listComponent;
	private static String indent = "";

	public Composite(){
		listComponent = new ArrayList<>();
	}
	
	public void add(Component component) {
		listComponent.add(component);
	}

	public void remove(Component component) {
		listComponent.remove(component);
	}
	
	public void empty(){
		listComponent.clear();
	}

	@Override
	public void drow() {
		System.out.println("Composite");
		indent+="\t";
		for (Component component : listComponent) {
			System.out.print(indent);
			component.drow();
		}
	}

}
