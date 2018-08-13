import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshan khadka\\Desktop\\chromedriver.exe");
		List <WebElement>link1= driver.findElements(By.tagName("a"));
		System.out.println(link1.size());
		for(int i=1;i<=link1.size();i=i+1)
		{
		System.out.println(link1.get(i).getText());
	}
		driver.close();

}
}
