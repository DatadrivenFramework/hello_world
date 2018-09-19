package webDriverClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtractLinksUsingList {

	public static void main(String[] args) {

		
		String text = "Testing";
		
		text = "testing1";
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/");
		
		WebElement catBox = driver.findElement(By.xpath("//*[@id='columnLeft']/div[1]/div[2]"));
		List<WebElement> catValues = driver.findElements(By.tagName("a"));
		//driver.findElement(By.linkText("")).getAttribute("href")
		
		//System.out.println(catValues.get(2).getText());
		System.out.println(catValues.size());
		for(int count=0;count<catValues.size();count++){
			
			
			System.out.println(catValues.get(count).getText());// To print the text of the webelement
			/*catValues.get(count).click();
			System.out.println("Title of the webpage is:->"+driver.getTitle());
			System.out.println("URL of the webpage is:->"+driver.getCurrentUrl());
			driver.navigate().back();
			
			catBox = driver.findElement(By.xpath("//*[@id='columnLeft']/div[1]/div[2]"));
			catValues = catBox.findElements(By.tagName("a"));
			*/
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
