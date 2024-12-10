import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());	
	driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();			
//		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());	
		
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("rus");
		Thread.sleep(3000);
//		List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item a"));
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
	for(WebElement option:options) {
		
		if(option.getText().equalsIgnoreCase("Russian Federation")) {
			
			option.click();
		}
	}
	//alternate with out for loop using keys  and get attribute vale 
			driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN);
			driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN);
			driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN);
			driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN,Keys.ENTER);
		System.out.println(driver.findElement(By.id("autosuggest")).getAttribute("value"));	
	}

}
	
