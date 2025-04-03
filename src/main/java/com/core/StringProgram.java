package com.core;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1="rama";
String name2="KRISHNA";
String name3="murali";
String name4="gopi";
String name5="RAMA";
String name6="Hanuma";
String name7="Venue";
String name8="    hello i am rama    ";
System.out.println(name2.length());
System.out.println(name3.toUpperCase());
System.out.println(name2.toLowerCase());
System.out.println(name4.toCharArray());
char cp[]=name4.toCharArray();
for(int i=0;i<cp.length;i++)
{
	System.out.println(cp[i]);
}
System.out.println(name1.equals(name5));
System.out.println(name1.equalsIgnoreCase(name5));
System.out.println(name1.hashCode());
System.out.println(name5.hashCode());
System.out.println(name6.charAt(3));
System.out.println(name7.isEmpty());
System.out.println(name1.concat(name3));
System.out.println(name8.trim());
	}

}
