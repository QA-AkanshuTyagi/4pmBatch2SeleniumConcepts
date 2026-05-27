package pmBatch2SELENIUM.pmBatch2SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkText {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver;

driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
	//	WebElement searchBar= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//a[@class='nav-a  '] //headers xpath.
		
		
		//xpath, id, class, linktext, partial link text
		
		
	//	WebElement sellLinkText=driver.findElement(By.linkText("Customer Service"));
		WebElement partial=driver.findElement(By.partialLinkText("Prime"));

		
		partial.click();
		Thread.sleep(5000);
	
		}
			
}
