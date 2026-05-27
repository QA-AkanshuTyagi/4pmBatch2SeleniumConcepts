package pmBatch2SELENIUM.pmBatch2SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsConceptInSelenium02 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		LocatorsConceptInSelenium02 ss= new LocatorsConceptInSelenium02();
		ss.WebDriverInitialisation("edge");
		ss.openWebSite("http://www.amazon.com");
		Thread.sleep(8000);
		ss.clickingOnSearchButtonAndSearchingForAnyProduct("Iphone");
		ss.clickOnSearchIcon();
		
		Thread.sleep(10000);
		ss.closeBrowser();
		
		
		
		
		
		
		
		
		// locators: 
		
		/*
		 * 1. By.id-- done
		 * 2.by.name --done
		 * 3.by.tagname--
		 * 4.by.css
		 * 5.by.xpath-- imp
		 * 6.by.linktext
		 * 7.by.partiallinktext
		 * 8.By.classname
		 */
// /html/body/div/header/div/div/div/div/a[@id='nav-logo-sprites']
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
	
	public void clickingOnSearchButtonAndSearchingForAnyProduct(String productName) {
		
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.click();
		searchBar.sendKeys(productName);
		
		
	}
	
	public void clickOnSearchIcon() {
		WebElement searchIcon=driver.findElement(By.id("nav-search-submit-button"));
		searchIcon.click();
		
	}
	
	public void closeBrowser() {
		driver.close();
		
	}
}
