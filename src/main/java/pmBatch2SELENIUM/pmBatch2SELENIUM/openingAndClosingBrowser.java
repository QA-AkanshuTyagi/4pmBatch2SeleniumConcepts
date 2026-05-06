package pmBatch2SELENIUM.pmBatch2SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class openingAndClosingBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		openingAndClosingBrowser bb= new openingAndClosingBrowser();
		bb.WebDriverInitialisation("edge");
		bb.openWebSite("http://www.amazon.com");
		Thread.sleep(5000);
		bb.closeBrowser();

	}

	public void WebDriverInitialisation(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}else {
			
			System.out.println("please check your browserName");
		}

	}
	
	
	
	public void openWebSite(String webSiteName) {
		
		driver.get(webSiteName);
		
		driver.manage().window().maximize();
		
		
	
	}
	
	public void closeBrowser() {
		driver.close();
		
	}
	
}
