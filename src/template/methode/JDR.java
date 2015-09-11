package template.methode;

public abstract class JDR {
	public final void makeJDR(){
		inventerScenario();
		trouverJoueur();
	}

	protected abstract void inventerScenario();

	private void trouverJoueur() {
		System.out.println("Qui veux joueur à mon super JDR!");
	}
	
	
}
