package com.core;

import java.util.ArrayList;

public class CollectionProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
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
System.out.println(al.get(3));
	}

}
