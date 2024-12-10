import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverLimitations {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	1. Give me the count of links on the page.
		System.out.println(driver.findElements(By.tagName("a")).size() +" links from full Website");	
	//2. Count of footer section-
			WebElement footerDriver =	driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size()+" links from bottom page");	
			WebElement footerCoulumDriver= 	footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
			System.out.println(footerCoulumDriver.findElements(By.tagName("a")).size()+" links in Discount Coupons");	
			
			
	//4- click on each link in the coloumn and check if the pages are opening-
			
			for(int i = 1; i<footerCoulumDriver.findElements(By.tagName("a")).size();i++) {
				
			String action = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			footerCoulumDriver.findElements(By.tagName("a")).get(i).sendKeys(action);
				Thread.sleep(3000);
			}
			
			Set<String> handles = driver.getWindowHandles();
			Iterator <String >it =       handles.iterator();
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());	
			}
	// opens all the tabs
			
			
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
