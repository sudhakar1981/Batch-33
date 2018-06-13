package pack3;

public class D {

	public void m1(int a, int b) {
		System.out.println(a + b);
	}

	public void m2(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		new D().m1(2, 7);
		new D().m2(4, 8, 9);
	}
}
