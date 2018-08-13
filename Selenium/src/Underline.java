import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Underline {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("https://www.w3schools.com/css/");
		 
		 String cssValue= driver.findElement(By.xpath("//a[text()='Start learning CSS now!']")).getCssValue("text-decoration");
		 
		 System.out.println("value"+cssValue);
		 
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(driver.findElement(By.xpath("//a[text()='Start learning CSS now!']"))).perform();
		 
		 String cssValue1= driver.findElement(By.xpath("//a[text()='Start learning CSS now!']")).getCssValue("text-decoration");
		 
		 System.out.println("value over"+cssValue1);
		 
		 driver.close();
		 

	}

}
