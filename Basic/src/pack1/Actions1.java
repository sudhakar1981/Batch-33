package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Actions1 {

	

	@Test()
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Softwares\\Automationworkspace\\Basic\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.ufthelp.com/");
		WebElement parentele=driver.findElement(By.xpath(".//*[@id='wrap2']/div[5]/div[1]/ul/li[3]/a"));
		WebElement childele=driver.findElement(By.xpath(".//*[@id='wrap2']/div[5]/div[1]/ul/li[3]/ul/li[2]/a"));
		
		Actions act=new Actions(driver);
		act.moveToElement(parentele).moveToElement(childele).click().build().perform();
		
	}

	



	


	@Test()
	public void m2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Softwares\\Automationworkspace\\Basic\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		
		Thread.sleep(5000);
		
		
		WebDriverWait w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(".//*[@id='content']/iframe")));
		
		WebElement s=driver.findElement(By.id("draggable"));
		WebElement d=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(s, d).build().perform();
	}

	}

	
	

