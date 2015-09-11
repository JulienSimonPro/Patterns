package template.methode.test;

import template.methode.*;

public class Main {
	public static void main(String[] args){
		JDRSpaceOpera so = new JDRSpaceOpera();
//		so.makeJDR();
		
		JDRMedFan mf = new JDRMedFan();
//		mf.makeJDR();
		
		
		JDR[] jdrs = {so, mf};
		for (JDR jdr : jdrs) {
			jdr.makeJDR();
		}
		
	}
}
