package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("(//input[@name='webform'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='webform'])[4]")).click();
		driver.findElement(By.xpath("(//input[@name='webform'])[5]")).click();
		driver.findElement(By.xpath("(//input[@name='webform'])[6]")).click();
	}

}
