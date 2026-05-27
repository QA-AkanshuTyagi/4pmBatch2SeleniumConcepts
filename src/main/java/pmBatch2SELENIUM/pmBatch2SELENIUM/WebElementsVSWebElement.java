package pmBatch2SELENIUM.pmBatch2SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsVSWebElement {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver;

driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
	//	WebElement searchBar= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//a[@class='nav-a  '] //headers xpath.
		
//		To verify below elements are present in header section.: todays deal, giftcard, sell, registry, prime video, customer support
		String[] headersExpected= {"Today's Deals","Gift Cards","Sell","Registry","Prime Video","Customer Service"};		
		List<WebElement>headers=driver.findElements(By.xpath("//a[@class='nav-a  ']"));
		
		for(WebElement header:headers) {
			
		String text= header.getText();
		System.out.println(text);
		
		for(String expectedHeader:headersExpected) {
			if(text.equalsIgnoreCase("Today's Deals")||text.equalsIgnoreCase("Gift Cards")||text.equalsIgnoreCase("Sell")||text.equalsIgnoreCase("Registry")||text.equalsIgnoreCase("Prime Video")||text.equalsIgnoreCase("Customer Service"))	{
				System.out.println(text + "testcase passed");
				break;
				
			}
			
		}
		
		
		
		}
		
		
		
		
	}

}
