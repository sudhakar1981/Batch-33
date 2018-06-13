package pack1;

public class StringCon {
	
	String name="manoj";
	
	String name1=new String("     hi java and string");
	
	StringBuffer name2=new StringBuffer("Welcome to Strings");
	
	
	public void m() {
		
		System.out.println(name);
		
		System.out.println(name.concat(name1));
		
		System.out.println(name2.append(name1));
		
		System.out.println(name1.toUpperCase());
		
		System.out.println(name1.toLowerCase());
		
		System.out.println(name1.trim());
		
		System.out.println(name1.substring(8));
		
		System.out.println(name1.substring(6, 8));
		
	}

public static void main(String[] args) {
	new StringCon().m();
}
}