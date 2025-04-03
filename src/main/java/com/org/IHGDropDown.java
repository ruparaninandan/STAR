package com.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IHGDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
Select s=new Select(country);
//s.selectByValue("AQ");
s.selectByVisibleText("India");
System.out.println("Country Names are:");
List<WebElement> all = s.getOptions();
for(WebElement each:all)
{
	System.out.println(each.getText());
}
	}

}
