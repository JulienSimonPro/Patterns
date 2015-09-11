package singleton;

public enum EnumSingleton {
	INSTANCE;
	
	public void singletonMethod(){
		System.out.println("I'm the only one ! " + INSTANCE);
	}

}
