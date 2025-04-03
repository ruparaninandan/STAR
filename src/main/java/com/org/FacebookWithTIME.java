package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWithTIME {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");  //hiting a url
		driver.manage().window().maximize();  //screen is maximizing	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());	
		System.out.println(driver.getCurrentUrl());
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("GoodTeam");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Abcd@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
