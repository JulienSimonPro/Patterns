package singleton.test;

import singleton.*;

public class Main {

	public static void main(String[] args) {
		System.out.println(Test.getTest());
		System.out.println(Test.getTest());
		System.out.println(Test.getTest());
		System.out.println(Test.getTest());
		
		System.out.println(SingletonWithHelper.getInstance());
		
		EnumSingleton.INSTANCE.singletonMethod();
	}

}
