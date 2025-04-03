package com.core;

public class OperatorsProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=6;
		int c=67;
		int d=54;
		int e=6;
		int f=78;
		int h=876;
System.out.println((a>b)&&(d>c)); //true&&false-->false
System.out.println((c<b)&&(c>d)); //false&&true--->false
System.out.println((h>f)&&(c>a)); //true&&true--->true

System.out.println((a>b)||(d>c)); //true||false-->true
System.out.println((c<b)||(c>d)); //false||true--->true
System.out.println((d>c)||(c<b)); //false||false-->false
	}

}
