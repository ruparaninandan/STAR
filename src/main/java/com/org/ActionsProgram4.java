package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProgram4 {

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
		a.keyDown(Keys.SHIFT).sendKeys(email, "r").keyUp(Keys.SHIFT).sendKeys("a").keyDown(Keys.SHIFT).sendKeys("m").build().perform();
	}

}
