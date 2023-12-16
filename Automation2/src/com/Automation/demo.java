package com.Automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://103.159.152.169:2062/");
		driver.findElement(By.id("userName")).sendKeys("acpl3429");
		driver.findElement(By.id("password")).sendKeys("acpl3429@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("LCL")).click();
		Thread.sleep(2000);
		
		Set<String> allId = driver.getWindowHandles();
		
		for(String id:allId)
		{
			driver.switchTo().window(id);
		
			if(driver.getTitle().contains("ACPL - LCL"))
			{
				//Thread.sleep(5000);
				break;
			}
		}
		
		driver.findElement(By.xpath("(//div[@class='ng-select-container'])[1]")).click();
		
		
		
		
		
		
		
	}

}
