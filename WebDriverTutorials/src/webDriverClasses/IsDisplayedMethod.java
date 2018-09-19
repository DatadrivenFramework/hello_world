package webDriverClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayedMethod {

	static WebDriver driver = null;
	
	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/");
		signIn("test@test.com", "unicode");
		
		try{
		
		boolean checkLogin = driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[2]/a/u")).isDisplayed();
		
		if(checkLogin){
			
			System.out.println("Pass");
		}else{
			
			System.out.println("Fail");
		}
		
		}catch(Throwable t){
			
			System.out.println("Fail");
		}
		
		
	}
	
	public static void signIn(String emailAdd, String password){
		
		driver.findElement(By.linkText("log yourself in")).click();
		driver.findElement(By.name("email_address")).sendKeys(emailAdd);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
	}

}
