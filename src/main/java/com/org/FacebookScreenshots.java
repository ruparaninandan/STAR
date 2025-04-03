package com.org;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookScreenshots {
public static ChromeDriver driver;
public static int i=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		FacebookScreenshots fs=new FacebookScreenshots();
		driver.get("https://www.facebook.com/");  //hiting a url
		driver.manage().window().maximize();  //screen is maximizing
		//getting titile -----> driver.getTitle()
		System.out.println(driver.getTitle());
		//getting a url---->driver.getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("GoodTeam");
		fs.snapshot();
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Abcd@123");
		fs.snapshot();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		fs.snapshot();
	}
	public void snapshot() throws IOException
	{
		Random r=new Random();
		if(r.nextInt()!=0)
		{
			i=i+1;
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//images//pic"+i+".png");
		FileUtils.copyFile(src, dest);
		}
	}

}
