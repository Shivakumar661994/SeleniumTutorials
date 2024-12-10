import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it = 	windows.iterator();
		String 	parentTab	= it.next();
		String 	childTab	= it.next();
		driver.switchTo().window(childTab);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText() + " from Child window");	
		driver.switchTo().window(parentTab)	;
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText()+ " from Parent window");	
		
	}

}
