package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");  
		driver.manage().window().maximize(); 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a=new Actions(driver);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		//a.moveToElement(email).sendKeys("Rama",Keys.TAB).build().perform();
		//a.moveToElement(password).sendKeys("Testing").build().perform();
		//a.moveToElement(button).click().build().perform();
		a.sendKeys(email, "Rama").build().perform();
		a.sendKeys(password, "Testing").build().perform();
		a.click(button).build().perform();
	}

}
