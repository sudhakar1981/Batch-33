package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prop {
	@Test
	public void m1() throws IOException {

		String configfile = "D:\\Automation Softwares\\Automationworkspace\\Basic\\config.properties";
		File a = new File(configfile);
		FileInputStream b = new FileInputStream(a);

		Properties p = new Properties();
		p.load(b);

		String furl = p.getProperty("flipkartUrl");
		String fkey = p.getProperty("chromeKey");
		String fvalue = p.getProperty("chromevalues");
		String fusername = p.getProperty("username");
		String fpassword = p.getProperty("password");

		System.setProperty(fkey, fvalue);
		

	}

}
