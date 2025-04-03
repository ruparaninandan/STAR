package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookAssertTest {

	@Test
	public void fb()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");  
		driver.manage().window().maximize();  
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String act = driver.getCurrentUrl();
		String exp="https://www.facebook.com/";
		Assert.assertTrue(exp.equals(act));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("GoodTeam");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Abcd@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
