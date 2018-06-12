package pack1;

public class StringEquals {

	String x = "Chennai";

	String oid = "orderid 123456";

	public void m() {

		/*
		 * if(x.equals("Chennai")) { System.out.println("I am in chennai");
		 * 
		 * }
		 */
		/*
		 * if (x.equalsIgnoreCase("chennai")) { System.out.println("i am in chennai"); }
		 */
		/*
		 * if (x == "Chennai") { System.out.println("i am in chennai");
		 */
		String[] str = oid.split("1");
		for (String st : str) {
			System.out.println(st);
		}
		try {
		System.out.println(str[1]);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new StringEquals().m();

	}
		
	}


