package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\baji\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
