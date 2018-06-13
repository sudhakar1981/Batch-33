package pack1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {

	public void m1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation Softwares\\Automationworkspace\\Basic\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath(".//*[@id='u_0_f']")).sendKeys("manoj");
		
		driver.findElement(By.xpath(".//*[@id='u_0_h']")).sendKeys("jupalli");
		
		driver.findElement(By.xpath(".//*[@id='u_0_k']")).sendKeys("9676889924");
		
		Thread.sleep(6000);
		
		driver.quit();
	}

	@Test
	public void m2() throws InterruptedException {
		m1();

	}
}
