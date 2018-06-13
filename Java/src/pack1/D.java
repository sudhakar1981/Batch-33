package pack1;

public class D {

	// String []st= {"hello"};
	String[][] str = { { "Hi", "Manu"} ,{"how", "r"  }};

	public void m() {
		
		str[0][1]="hello";
for(int i=0;i<str.length;i++) {
	{
		for(int j=0;j<str.length;j++) {
			System.out.println(str[i][j]);
		}
	}}
}
	

	public static void main(String[] args) {
		new D().m();
	}
}
