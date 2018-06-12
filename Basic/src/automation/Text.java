package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.Test;

public class Text {

	@Test
public void m() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Softwares\\Automationworkspace\\Basic\\Drivers\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.get("https://www.google.co.in/search?q=facebook&ie=utf-8&oe=utf-8&client=firefox-b-ab&gfe_rd=cr&dcr=0&ei=OYjcWZrHMMOL8Qet8qfAAQ");
		
		List<WebElement> list=dr.findElements(By.tagName("a"));
		
		for(int i=0;i>=0;i++) {
			
			System.out.println(list.get(i).getText());
		
		}
		
		
	}
}
