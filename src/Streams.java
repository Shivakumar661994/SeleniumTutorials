import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Streams {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// capture all webelements into list
	List<WebElement> vegList= 	 driver.findElements(By.xpath("//tr/td[1]"));
		// capture text of all webelements into new(original) list
	
	List<String> originalList = 	vegList.stream().map(s->s.getText()).collect(Collectors.toList());
		// sort on the original list of step 3 -> sorted list
	List <String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		// compare original list vs sorted list
		Assert.assertEquals(originalList, sortedList);

		// scan the name column with getText ->Beans->print the price of the Brinjal
	List<String> prices = 	vegList.stream().filter(s->s.getText().contains("Brinjal")).map(s->getVegPrice(s)).collect(Collectors.toList());
	prices.forEach(b->System.out.println(b));
	
	// scan the name column with getText from another page item PAGENATION
	
		List<String> price;
		do
		{
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = rows.stream().filter(s->s.getText().contains("Wheat")).map(s->vegPrice(s)).collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));
		if(price.size()<1)
		{
		driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);
	}
//	pagenation 
	public static String vegPrice(WebElement d) {
		
		String priveValue = d.findElement(By.xpath("following-sibling::td[1]")).getText();
	
		return priveValue;
	}
//	from same page
	public static String getVegPrice(WebElement s) {
		
		String priveValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
	
		return priveValue;
		
}
}
