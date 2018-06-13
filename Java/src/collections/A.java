package collections;

import java.util.ArrayList;
import java.util.List;

public class A {
	
	public void m() {
	List<String> l=new ArrayList<String>();
	l.add("m");
	l.add("a");
	l.add("n");
	l.add("u");

	for(String s:l) {
		System.out.println(s);
	}
	}
	public static void main(String[] args) {
		new A().m();
	}
}
