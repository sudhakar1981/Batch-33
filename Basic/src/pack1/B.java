package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {

	public void m() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation Softwares\\Automationworkspace\\Basic\\Drivers\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();

		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		dr.get("https://www.flipkart.com/");

		dr.findElement(
				By.xpath("//*[@id=\"container\"]/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input"))
				.sendKeys("laptop");
		dr.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button"))
				.click();

		dr.findElement(By.xpath(
				".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/a/div[3]/div[1]/div[1]"))
				.click();

		dr.findElement(
				By.xpath(".//*[@id='container']/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[2]/form/button"))
				.click();

		dr.findElement(By.xpath(
				".//*[@id='container']/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input"))
				.sendKeys("jupallimanoj@gmail.com");

		dr.findElement(By.xpath(
				".//*[@id='container']/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/button"))
				.click();

		dr.findElement(By.xpath(
				".//*[@id='container']/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input"))
				.sendKeys("Manu@1994");

		dr.findElement(By.xpath(
				".//*[@id='container']/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button"))
				.click();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		dr.close();

	}

	@Test
	public void m1() throws InterruptedException {

		m();

	}
}
