import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement dropDown =  	driver.findElement(By.xpath("//Select[@class='form-control']"));
		Select s = new Select(dropDown);
		s.selectByIndex(2);
		System.out.println(s.getFirstSelectedOption().getText());	
		driver.findElement(By.cssSelector("#signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Shop Name']")));
		
	List<WebElement> products=  driver.findElements(By.cssSelector(".btn.btn-info"));
	for(int i =0;i<products.size();i++) {
		
		products.get(i).click();
	}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		
		
		
	}

}
