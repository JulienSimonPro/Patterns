package template.methode;

public class JDRMedFan extends JDR {

	@Override
	protected void inventerScenario() {
		ajouterDragon();
		ajouterNecromancien();
		ajouterRoyaune();
	}

	private void ajouterRoyaune() {
		System.out.println("Royaume oublié");
	}

	private void ajouterNecromancien() {
		System.out.println("Le vilain nécromancien");
	}

	private void ajouterDragon() {
		System.out.println("Le gros dragon noir");
	}

}
