package template.methode;

public class JDRMedFan extends JDR {

	@Override
	protected void inventerScenario() {
		ajouterDragon();
		ajouterNecromancien();
		ajouterRoyaune();
	}

	private void ajouterRoyaune() {
		System.out.println("Royaume oubli�");
	}

	private void ajouterNecromancien() {
		System.out.println("Le vilain n�cromancien");
	}

	private void ajouterDragon() {
		System.out.println("Le gros dragon noir");
	}

}
