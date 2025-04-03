package com.apple;

import org.testng.annotations.Test;

public class FruitsDependsTest {
	@Test(dependsOnMethods= {"grapes"})
	public void mango()
	{
		System.out.println("Mango Fruit");
	}
	@Test()
	public void grapes()
	{
		System.out.println("Grapes Fruit");
	}
	
	@Test(dependsOnMethods= {"apple"})
	public void guva()
	{
		System.out.println("Guva Fruit");
	}
	
	@Test(dependsOnMethods= {"banana"})
	public void apple()
	{
		System.out.println("Apple Fruit");
	}
	
	@Test(dependsOnMethods= {"mango"})
	public void banana()
	{
		System.out.println("Banana Fruit");
	}
}
