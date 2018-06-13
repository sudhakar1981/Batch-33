package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public void m() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Softwares\\Automationworkspace\\Java\\Drivers\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		
		dr.findElement(By.id("email")).sendKeys("jupallimanoj");
		
		dr.findElement(By.id("pass")).sendKeys("manojpassword");
	}
	
	public static void main(String[] args) {
		new A().m();
	}

	public int a() {
		// TODO Auto-generated method stub
		return 0;
	}
}
