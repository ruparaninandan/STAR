package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");  
		driver.manage().window().maximize(); 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a=new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement abc = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement xyz = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(abc, xyz).build().perform();
	}

}
