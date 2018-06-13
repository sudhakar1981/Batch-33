package oops;

public class Const {
	
	int id;
	String name;
	
	Const(int i,String n){
		
		id=i;
		name=n;
		
	}
	void display() {
		System.out.println(id+" "+name);
	}
public static void main(String[] args) {
	Const c1=new Const(222,"manoj");
	Const c2=new Const(444,"kvp");
	c1.display();
	c2.display();
}
}
