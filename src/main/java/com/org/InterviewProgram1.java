package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//difference between isSelected() isDisplayed isEnabled()
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement maleradio = driver.findElement(By.xpath("(//input[@id='sex'])[1]"));
		System.out.println("Is Displaying: "+maleradio.isDisplayed());
		System.out.println("Is Selected: "+maleradio.isSelected());
		System.out.println("Is enabled: "+maleradio.isEnabled());
		maleradio.click();
		System.out.println("After click on radio button");
		System.out.println("Is Displaying: "+maleradio.isDisplayed());
		System.out.println("Is Selected: "+maleradio.isSelected());
		System.out.println("Is enabled: "+maleradio.isEnabled());
	}

}
