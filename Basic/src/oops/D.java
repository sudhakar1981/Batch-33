package oops;

public class D {

	String str="Hello Java";
	public void m() {
		char[] cc=str.toCharArray();
		//normal string code
		for(char c:cc) {
			System.out.print(c);
		}
		//System.out.println(cc.length); 
		System.out.println();
		//string reverse code
		for(int i=cc.length-1;i>=0;i--) {
			System.out.print(cc[i]);
		}
		
	}
	public static void main(String[] args) {
		new D().m();
	}

}
