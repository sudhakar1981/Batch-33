package pack1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prop1 extends Prop {

	@Test
	public void m2() throws IOException {
		m1();
		WebDriver dr = new ChromeDriver(); 

		dr.get("furl");
		dr.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a")).click();
		dr.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("fusername");

		dr.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("fpassword");
		dr.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();

	}

}
