package pack1;

public class E {

	static String str = "kallavaripalli";

	public static void m() {
		char[] c = str.toCharArray();
		for (char s : c) {
			System.out.println(s);
			for (int i = c.length - 1; i > 0; i--) {
				System.out.print(c[i]);

				System.out.println(str.equals("banglore"));
				System.out.println(str.toUpperCase());
				System.out.println(str.length());
				System.out.println(str.trim());
				System.out.println(str.toLowerCase());
				System.out.println(str.charAt(1));
			}
		}
	}

	public static void main(String[] args) {
		m();
	}
}
