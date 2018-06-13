package pack1;

public class While {
int i=40;

	public void m1()
{
		while(i<=100) {
			System.out.println(i);
			break;
		}
		}
	public static void main(String[] args) {
		new While().m1();
	}
}
