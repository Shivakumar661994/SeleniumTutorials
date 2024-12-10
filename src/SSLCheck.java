import java.lang.reflect.Proxy;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		// setting up proxy
//		Proxy proxy = new Proxy();   
//		proxy.setHttpProxy("ipaddress:4444");
//		options.setCapability("proxy", proxy);
		//Setting up default path for download 
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("download.default_directory", "/directory/path");
//		options.setExperimentalOption("prefs", prefs);
		//bypass sslCheck
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
