package pack1;

public abstract class C extends B {
	
	int a;
	int b=20;
	
	public void m1() {
		System.out.println("hello");
	}
	public void m3() {
		
	}
	public abstract void m();
public static void main(String[] args) {
	B bb=new B();
	bb.m1();
	bb.m2();
}
}