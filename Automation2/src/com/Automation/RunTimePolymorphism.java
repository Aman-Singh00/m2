package com.Automation;
import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the browser value");
		String browser = s.next();
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeDriver driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			FirefoxDriver driver = new FirefoxDriver();

		}
		else if(browser.equals("edge"))
		{
			EdgeDriver driver = new EdgeDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}
		
	}

}
