package webDriverClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BreakXpathExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/index.php");
		driver.findElement(By.linkText("Mobile Phones->")).click();
		driver.findElement(By.xpath("//*[@id='bodyContent']/div/div/table/tbody/tr[1]/td[2]/a")).click();
		
		//*[@id='tdb4']/span[2]
		
		String startXpath = "//*[@id='tdb";
		String endXpath = "']/span[2]";
		
		for(int count=4;count<=9;count++){
			
			driver.findElement(By.xpath(startXpath+count+endXpath)).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

		}
		
		
		
	}

}
