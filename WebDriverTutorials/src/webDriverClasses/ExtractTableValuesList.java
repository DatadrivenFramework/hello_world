package webDriverClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtractTableValuesList {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/compucrack/catalog/admin");
		
		driver.findElement(By.name("username")).sendKeys("compucrack");
		driver.findElement(By.name("password")).sendKeys("compucrack");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		WebElement table = driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		
		for(int row=0;row<tableRows.size();row++){
			
			List<WebElement> tableCols = tableRows.get(row).findElements(By.tagName("td"));
			
			for(int col=0;col<tableCols.size();col++){
				
				System.out.print(tableCols.get(col).getText()+"      ");
			}
			
			System.out.println();
			
		}
	}

}
