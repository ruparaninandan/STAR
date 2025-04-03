package com.core;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> al=new HashSet<String>();
		al.add("rama");
		al.add("krishna");
		al.add("ravi");
		al.add("gopi");
		al.add("murali");
		System.out.println(al);
		al.add("krishna");
		al.add("ravi");
		al.add("venu");
		System.out.println(al);
		
	}

}
