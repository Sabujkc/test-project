import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonAssignment {

	public static void main(String[] args) throws InterruptedException {
	//to open the new url
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Roshan khadka\\\\Desktop\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//to open the amazon homepage
	driver.get("https://www.amazon.com/");
	//implicit wait for waiting 10 seconds to load all image
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       //Thread.sleep(4000);
       
	//to maximize the window
       driver.manage().window().maximize();
	// to select the books related to Selenium from the search dropdown box
	Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
	s1.selectByValue("search-alias=stripbooks");
    Thread.sleep(4000);	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium");
	Thread.sleep(4000);
	driver.findElement(By.className("nav-input")).click();
	
	//get the title of the page
	String s2 = driver.getTitle();
	System.out.println(s2);
	//list of the books
	WebElement lis = driver.findElement(By.cssSelector("#s-results-list-atf"));
	List<WebElement> list1 = lis.findElements(By.tagName("li"));
	
	System.out.println("Search result number is: "+list1.size());
	for(int i=1; i<list1.size(); i=i+1) {
		System.out.println(list1.get(i).getText());
	}
	//navigates back to the homepage
	driver.navigate().to("https://www.amazon.com/");
	
//shows all the options from the dropdown button and print in console
	WebElement sel = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
    Select s = new Select(sel);
    List <WebElement> cou = s.getOptions();

    System.out.println(cou.size());
    for(int i=0 ;i<cou.size();i++)
    {
        String value = cou.get(i).getText();
        System.out.println(value);

    }
	
	
	

	}

}
