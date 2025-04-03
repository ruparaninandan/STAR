package com.core;

public class SundayMarket extends SuperMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SundayMarket sm=new SundayMarket();
		sm.apple();
		sm.mango();
		sm.vegitables();
		sm.snacks();
	}
	public void vegitables()
	{
		System.out.println("SundayMarket Vegitables");
	}

	public void snacks()
	{
		System.out.println("SundayMarket Snacks ");
	}

}
