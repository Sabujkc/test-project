package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetUrl {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Roshan khadka\\Desktop\\gecodriver.exe"	);	

	}

}
