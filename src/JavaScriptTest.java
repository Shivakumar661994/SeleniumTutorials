import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table =driver.findElement(By.cssSelector(".table-display"));
		System.out.println(table.findElements(By.tagName("tr")).size() + " No of Rows");
	System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size() + " No of Coloums");	
	List 	<WebElement> rowTable =	table.findElements(By.tagName("tr")).get(9).findElements(By.tagName("td"));
				System.out.println(rowTable.get(0).getText());			
				System.out.println(rowTable.get(1).getText());	
				System.out.println(rowTable.get(2).getText());	
				
				driver.findElement(By.id("autocomplete")).sendKeys("Uni");
				Thread.sleep(3000);
			List<WebElement>	options =driver.findElements(By.cssSelector("ul[id='ui-id-1'] li"));
			for(WebElement option:options) {
				
				if(option.getText().equalsIgnoreCase("United States (USA)")) {
					option.click();
				}
			}
			System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
			
			
//			driver.findElement(By.id("autocomplete")).sendKeys("Uni");
//			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
//			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
//			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
//			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
//			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
//		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));	
			
		}
			
		
	}


