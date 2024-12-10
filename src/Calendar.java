import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		String monthNum = "6";
		String date ="6";
		String year = "2030";	
		
		String[] expectedDate = {monthNum, date, year};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNum)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		List<WebElement> fullDate =driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0;i<fullDate.size();i++) {
			
	System.out.println(fullDate.get(i).getAttribute("value"));		
			Assert.assertEquals(fullDate.get(i).getAttribute("value"),expectedDate[i]);
			
			
		}
		
		
		
	}
	
	

}
