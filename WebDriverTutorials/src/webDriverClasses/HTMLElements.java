package webDriverClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HTMLElements {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/");
		
		/*
		WebElement logInLink = driver.findElement(By.linkText("log yourself in"));
		logInLink.click();
		*/
		driver.findElement(By.linkText("log yourself in")).click();
		driver.findElement(By.name("email_address")).sendKeys("test@test.com");
		driver.findElement(By.name("password")).sendKeys("unicode");
		driver.findElement(By.id("tdb5")).click();
		
		driver.findElement(By.linkText("Television->")).click();
		
		driver.findElement(By.xpath("//*[@id='tdb4']/span")).click();
		driver.findElement(By.xpath("//*[@id='tdb4']/span[2]")).click();
		
		driver.findElement(By.linkText("create an account")).click();
		
		driver.findElement(By.name("country")).sendKeys("India");
		
		WebElement country = driver.findElement(By.name("country"));
		Select sel = new Select(country);
		sel.selectByVisibleText("India");
		
		Thread.sleep(10000);
		
		driver.close();
		
	}

}
