import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
	System.out.println(driver.findElements(By.tagName("a")).size() +" no of links ");
	driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
System.out.println(driver.findElements(By.tagName("frame")).size() +" no of frams");		
	driver.switchTo().frame("frame-top");
	driver.switchTo().frame("frame-middle");
System.out.println(driver.findElement(By.id("content")).getText());	

	
	
	}

}
