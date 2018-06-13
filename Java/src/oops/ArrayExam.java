package oops;

public class ArrayExam {
	
	String[] names= {"manu","kvp","rcl"};
	public void m1() {
		for(String s:names) {
			System.out.println(s);
		}
		
	}
public static void main(String[] args) {
	new ArrayExam().m1();
}
}
