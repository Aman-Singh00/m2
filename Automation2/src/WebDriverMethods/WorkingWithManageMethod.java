package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithManageMethod {
	
	public static void main(String[] args) {
		
		WebDriver  driver = new ChromeDriver();
		
//		Point p = new Point(200,100);
//		 
//		driver.manage().window().setPosition(p);
		
		Dimension d = new Dimension(100, 200);
		
		driver.manage().window().setSize(d);
		
		//driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		
		
		driver.get("https://www.flipkart.com/");
		
		
	}

}
