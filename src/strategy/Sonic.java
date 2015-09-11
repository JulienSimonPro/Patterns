package strategy;

public class Sonic {

	private MoveCharacterStrategy mcs;
	
	public Sonic(MoveCharacterStrategy mcs){
		this.mcs = mcs;
	}
	
	public void changeStrategy(MoveCharacterStrategy mcs){
		this.mcs = mcs;
	}
	
	public void move(){
		mcs.execute();
	}

}
