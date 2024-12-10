import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Chitti");
		driver.findElement(By.name("email")).sendKeys("Shiva.kumar661994@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345678");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("7251995");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		WebElement option =	driver.findElement(By.id("exampleFormControlSelect1"));
		Select s = new Select(option);
		s.selectByIndex(1);
		System.out.println(s.getFirstSelectedOption().getText());	
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

		driver.quit();
	

	}

}
