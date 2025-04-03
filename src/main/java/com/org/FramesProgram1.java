package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesProgram1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/checkboxradio/");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
Thread.sleep(6000);
WebElement boarder = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(boarder);
//driver.switchTo().frame(1);
WebElement checkbox1 = driver.findElement(By.xpath("//legend[text()[contains(.,'Hotel Ratings:')]]/following::span[1]"));
checkbox1.click();
	}

}
