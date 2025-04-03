package com.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMWindows {
	public static String parent,linkedIn,facebook,twitter,youtube;
	public static Set<String> all;
	public static Iterator<String> it;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		parent = driver.getWindowHandle();
		System.out.println("Orange HRM Page Alphanumeric "+parent);
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		all = driver.getWindowHandles();
		it = all.iterator();
		while(it.hasNext())
		{
			linkedIn=it.next();
			if(!parent.equals(linkedIn))
			{
				driver.switchTo().window(linkedIn);
			}
		}
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[text()='Join now'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='email-or-phone']")).sendKeys("Trainerlinked@gmail.com");
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		all = driver.getWindowHandles();
		it = all.iterator();
		while(it.hasNext())
		{
			facebook=it.next();
			if(!parent.equals(facebook))
			{
				driver.switchTo().window(facebook);
			}
		}
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("facebooktrainer");
		driver.switchTo().window(parent);
		
	}

}
