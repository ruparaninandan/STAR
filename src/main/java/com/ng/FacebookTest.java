package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {

	@Test
	public void fb()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");  //hiting a url
		driver.manage().window().maximize();  //screen is maximizing
		//getting titile -----> driver.getTitle()
		System.out.println(driver.getTitle());
		//getting a url---->driver.getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("GoodTeam");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Abcd@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();	
	}
}
