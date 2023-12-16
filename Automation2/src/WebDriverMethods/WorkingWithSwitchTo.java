package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSwitchTo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Aman");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
	
		
	}

}
