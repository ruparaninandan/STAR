package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(6000);
		WebElement button1 = driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display an  alert box:')]]"));
		button1.click();
		Alert at = driver.switchTo().alert();
		at.accept();
		WebElement ok = driver.findElement(By.xpath("//a[text()[contains(.,'Alert with OK & Cancel')]]"));
		ok.click();
		Thread.sleep(4000);
		WebElement button2 = driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display a confirm box')]]"));
		button2.click();
		at.dismiss();
		WebElement text = driver.findElement(By.xpath("//a[text()[contains(.,'Alert with Textbox')]]"));
		text.click();
		Thread.sleep(4000);
		WebElement button3 = driver.findElement(By.xpath("//button[text()[contains(.,'click the button to demonstrate the prompt box')]]"));
		button3.click();
		at.sendKeys("Rama");
		at.accept();
	}

}
