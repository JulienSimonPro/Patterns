package strategy;

public class DefaultMoveStrategy implements MoveCharacterStrategy {

	@Override
	public void execute() {
		System.out.println("Il avance normalement");
	}

}
