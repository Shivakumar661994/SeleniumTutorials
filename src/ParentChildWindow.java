import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> windows=  driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String parentTAb = it.next();
		String childTab = it.next();
		driver.switchTo().window(childTab);
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());	
	String eMail =	driver.findElement(By.cssSelector(".im-para.red")).getText();
System.out.println(eMail.split("@")[1].trim().split(" ")[0].trim());
	String trimedEmail =	eMail.split("@")[1].trim().split(" ")[0].trim();
		driver.switchTo().window(parentTAb);
		driver.findElement(By.id("username")).sendKeys(trimedEmail);
		driver.findElement(By.id("password")).sendKeys("learning");
	}

}















//driver.findElement(By.cssSelector(".text-center.text-white")).getText();
//System.out.println(driver.findElement(By.cssSelector(".text-center.text-white")).getText());
//String userName= driver.findElement(By.cssSelector(".text-center.text-white")).getText().split("is")[1].trim().split(" ")[0];	
//System.out.println(userName);




