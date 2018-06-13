package collections;

import java.util.HashSet;
import java.util.Set;

public class B {
	
	public void m1() {
		
		Set<String> s=new HashSet<String>();
		s.add("m");
		s.add("a");
		s.add("n");
		s.add("u");
		//s.add("m");
		for(String m:s) {
			System.out.println(m);
		}
		
	}
	public static void main(String[] args) {
		new B().m1();
	}

}
