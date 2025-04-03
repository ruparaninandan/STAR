package com.core;

public class HDFC implements ReserveBankOfIndia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hf=new HDFC();  //total 6 methods
		ReserveBankOfIndia rb=new HDFC();  //only 4 methods
	hf.carLoan();
	hf.plotLoan();
	hf.goldLoan();
	}
	public void carLoan()
	{
		System.out.println("HDFC carloan intrest rate 6%");
	}
	public void plotLoan()
	{
		System.out.println("HDFC plot loan intrest rate is 12%");
	}
	public void educationalLoan() {
		// TODO Auto-generated method stub
	System.out.println("HDFC educational loan 8%");	
	}
	public void personalLoan() {
		// TODO Auto-generated method stub
		System.out.println("HDFC personal loan is 11%");
	}
	public void homeLoan() {
		// TODO Auto-generated method stub
		System.out.println("HDFC home loan starts from 8.5%");
	}
	public void goldLoan() {
		// TODO Auto-generated method stub
		System.out.println("HDFC gold loan is 9%");
	}

}
