package autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download  {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "D:\\Automation Softwares\\Automationworkspace\\Java\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
		driver.findElement(By.xpath(".//*[@id='post-body-4024384759750876807']/div[1]/div/a[1]")).click();
		Runtime.getRuntime().exec("D:\\Automation Softwares\\Automationworkspace\\Java\\Documents\\B.exe");
		
		driver.close();
		
	}
}
