package com.core;

public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House hs=new House();
		hs.apartment(2);
		hs.plot();
		hs.apartment(true, 3);
	}

	public void plot()
	{
	System.out.println("i have 200 sqyards plot");
	}
	public void govtLand()
	{
		System.out.println("I got 150sq yards govt land");
	}
	public void apartment()
	{
		System.out.println("Govt constructed appartments for poor people");
	}
	public void apartment(boolean gated,int bedrooms)
	{
		System.out.println("Apartment is Gated comunity: "+gated);
		System.out.println("I have bedrooms in apartment: "+bedrooms);
	}
	public void apartment(int bedrooms)
	{
		System.out.println("I have bedrooms in apartment: "+bedrooms);
	}
}
