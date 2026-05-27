package pmBatch2SELENIUM.pmBatch2SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();

	//	driver.get("https://grotechminds.com/hoverover/");
	//	driver.get("https://grotechminds.com/rightclick/");
	//	driver.get("https://grotechminds.com/left-double-click/");
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	//	WebElement demo1= driver.findElement(By.xpath("(//div[contains(text(),'Demo1')])[1]"));
		Actions act= new Actions(driver);
		// hover over: using move to element
		//act.moveToElement(demo1).build().perform();
		
		// right click: using context click
	//	WebElement rightClick= driver.findElement(By.xpath("//a[.='Practice Link1']"));
		
		
	//	act.contextClick().build().perform();
		
		//double click
			//	WebElement doubleclick= driver.findElement(By.xpath("//div[@ondblclick='myFunction1()']"));
				//act.doubleClick(doubleclick).perform();
		WebElement drag=driver.findElement(By.xpath("//img[@id='drag2']"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
	}

}
