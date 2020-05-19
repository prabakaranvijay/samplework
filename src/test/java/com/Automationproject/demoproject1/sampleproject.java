package com.Automationproject.demoproject1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.rcarz.jiraclient.JiraException;


public class sampleproject {
	
public static WebDriver driver;
	
	
	@BeforeMethod
	public void launchDriver(){
	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\sdirvers\\chromedriver1.exe");
		
		driver = new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void Test1() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 1 title is "+driver.getTitle());
	}
	
	@Test
	public void Test2() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 2 title is "+driver.getTitle());
	}
	

	
	@AfterMethod
	public void quit() throws JiraException {
		driver.quit();
	}

}
