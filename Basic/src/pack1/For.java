package pack1;

import org.testng.annotations.Test;

public class For {
	
	static int a=100;
	
	@Test
	public void m1() {
			for(a=95;a<=100;a++) {
			System.out.println(a);
			
		}
	}

}
