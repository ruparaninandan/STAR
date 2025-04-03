package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");  
		driver.manage().window().maximize(); 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a=new Actions(driver);
		WebElement button1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    //a.moveToElement(button1).doubleClick().build().perform();
	    a.doubleClick(button1).build().perform();
	    Alert at = driver.switchTo().alert();
	    at.accept();
	    WebElement button2 = driver.findElement(By.xpath("//span[text()='right click me']"));
	   // a.moveToElement(button2).contextClick().build().perform();
	    a.contextClick(button2).build().perform();
	}

}
