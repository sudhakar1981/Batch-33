package pack1;

public class Array {
	
	String[] name= {"manu","tpt","plr","ctr"};
	
	public void m() {
		
		//name[0]="hello";
		
		for(String s:name) {
		System.out.println(s);
		
		/*for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
			*/
			
		}
	}
	public static void main(String[] args) {
		new Array().m();
	}
	

}
