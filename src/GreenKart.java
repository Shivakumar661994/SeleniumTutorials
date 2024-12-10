import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));


		String[] fruits = {"Apple", "Orange", "Pears","Pomegranate","Water Melon","Banana","Strawberry"};
		m1(driver, fruits);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
	System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());	
	driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		
		
		
	}
	
	public static  void m1 (WebDriver driver, String[] fruits) {
		int s= 0;
		
		
		List<WebElement> fruitsName = driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i= 0; i<fruitsName.size();i++) {
			
		String[] name= 	fruitsName.get(i).getText().split("-");
		String formatedName = name[0].trim();
			List<String> al =	Arrays.asList(fruits);
			
			if(al.contains(formatedName)) {
			s++;
			driver.findElements(By.xpath("//div[@class='product-action'] //button")).get(i).click();
			
		}
			if(s==fruits.length) {
				
				break;
			}
	}
		
	}
}
