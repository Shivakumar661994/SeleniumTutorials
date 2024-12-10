import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicOptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		   driver.findElement(By.xpath("//label[@for='benz']")).click();
//		//div[@id='checkbox-example']/fieldset/legend[2]/input
		String opt=driver.findElement(By.xpath("//label[@for='benz']")).getText();
WebElement dropdown =	driver.findElement(By.id("dropdown-class-example"));
	Select s = new Select(dropdown);
	s.selectByVisibleText(opt);
	driver.findElement(By.name("enter-name")).sendKeys(opt);
	driver.findElement(By.id("alertbtn")).click();

    String text=  driver.switchTo().alert().getText();
    if(text.contains(opt))

    {

   System.out.println("Alert message success");
   driver.switchTo().alert().accept();
    }

    else

   System.out.println("Something wrong with execution");
    driver.quit();
}
	
	}


