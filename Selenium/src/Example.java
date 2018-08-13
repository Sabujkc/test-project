//facebook signup 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
	public class Example {


		public static void main(String[] args) {
			//WebDriver driver = new FirefoxDriver();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshan khadka\\Desktop\\chromedriver.exe"	);	
			driver.findElement(By.id("u_0_c")).sendKeys("Sabuj");
			//driver.findElement(By.name("firstname")).click();
			driver.findElement(By.id("u_0_e")).sendKeys("khatri");
			driver.findElement(By.id("u_0_h")).sendKeys("+7206465966");
			//password
			driver.findElement(By.id("u_0_o")).sendKeys("Agama123");
			//birthday- month/date/year
			Select s1 = new Select(driver.findElement(By.name("birthday_month")));
			s1.selectByIndex(6);
			Select s2 = new Select(driver.findElement(By.name("birthday_day")));
			s2.selectByIndex(25);
		    Select s3 = new Select(driver.findElement(By.name("birthday_year")));
		    s3.selectByValue("1995");
		    
		    
		    //choosing the gender
		    driver.findElement(By.id("u_0_a")).click();
		   // driver.findElement(By.id("u_0_9")).click();
		    //signup
		    driver.findElement(By.id("u_0_u")).click();
		    
		  
		    
		}
	}


