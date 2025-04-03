package com.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement table = driver.findElement(By.xpath("//table[@id='countries']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Table Rows:"+rows.size());
		outer:
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<columns.size();j++)
			{
				String value = columns.get(j).getText();
				//System.out.println(value);
				if(value.equals("Angola"))
				{
					System.out.println("Country:  "+columns.get(j).getText());
					System.out.println("Capital:  "+columns.get(2).getText());
					System.out.println("Currency  "+columns.get(3).getText());
					System.out.println("Primary languages:  "+columns.get(4).getText());
					columns.get(0).findElement(By.tagName("input")).click();
					break outer;
				}
			}
		}
	}

}
