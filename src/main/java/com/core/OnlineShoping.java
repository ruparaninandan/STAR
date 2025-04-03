package com.core;

public class OnlineShoping extends ShopingMall{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineShoping os=new OnlineShoping();
		os.cloths();
		os.shoes();
	}
	public void toys()
	{
		System.out.println("kids toys price is very less is online");
	}
	public void watches()
	{
		System.out.println("Onlineshoping watch price is 150$");
	}
	public void belts()
	{
		System.out.println("Online shoping belt price is 25$");
	}
	public void shoes()
	{
		System.out.println("Online shoping shoes price is 15$");
	}

}
