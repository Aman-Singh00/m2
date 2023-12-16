package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTitle {
	
	
	public static void main(String[] args) {
		
		//to launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//to open the webapplication
		driver.get("https://www.flipkart.com/");
		
		//to get the title of current page
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//to get url of webpage
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
//		//to get source code of web page
//		String sourceCode = driver.getPageSource();
//		System.out.println(sourceCode);
		
		driver.close();
		
	
		
		
		
	}

}
