import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,400)");
				js.executeScript("document.querySelector('.tableFixHead').scrollTop=300");
				
			List<WebElement> data = 	driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
			int dataSum =0;
			for(int i = 0; i<data.size(); i++) {
					
//					System.out.println(data.get(i).getText());
					  dataSum = dataSum +	Integer.parseInt(data.get(i).getText());
		}
			System.out.println(dataSum);
			
		System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText());	
					int total=Integer.parseInt	(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
					
					System.out.println(total);
					
			Assert.assertEquals(dataSum, total);
//			Assert.assertEquals(dataSum, null)
			driver.quit();
	}

}
