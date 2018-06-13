package pack3;

public class B {

	public void m1(int a,int b) {
		System.out.println(a+b);
		
	}
	public void m2(int a,float b) {
		System.out.println(a+b);
		
	}
	public void m3(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		B b=new B();
		b.m1(11, 24);
		b.m2(28, 44.64f);
}
	public void phoneupdated() {
		System.out.println("basic phone is old");
	}
}