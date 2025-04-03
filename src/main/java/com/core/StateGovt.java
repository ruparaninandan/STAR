package com.core;

public class StateGovt extends CentralGovt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateGovt sg=new StateGovt();
		sg.healthInsurance();
		sg.farmerFund();
		sg.education();
	}
	public void healthInsurance()
	{
		System.out.println("State Govt provides Health Insurance");
	}
	public void loans()
	{
		System.out.println("State Govt provides loans to poor people");
	}

	public void tax() {
		// TODO Auto-generated method stub
	System.out.println("tax percentage depands on states");	
	}

	public void jobs() {
		// TODO Auto-generated method stub
		System.out.println("Jobs depends on states");
	}

}
