package oops;

public  class Test  extends S implements C,B {
	
public static void add() {
	
    Test t=new Test();
	
	System.out.println(t.a+t.c);
}
public static void main(String[] args) {
	add();
}
}
