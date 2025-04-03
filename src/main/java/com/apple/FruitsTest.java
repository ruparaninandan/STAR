package com.apple;

import org.testng.annotations.Test;

public class FruitsTest {

	@Test(priority=2)
	public void mango()
	{
		System.out.println("Mango Fruit");
	}
	@Test(priority=1)
	public void grapes()
	{
		System.out.println("Grapes Fruit");
	}
	
	@Test(priority=5)
	public void guva()
	{
		System.out.println("Guva Fruit");
	}
	
	@Test(priority=4)
	public void apple()
	{
		System.out.println("Apple Fruit");
	}
	
	@Test(priority=3)
	public void banana()
	{
		System.out.println("Banana Fruit");
	}
}
