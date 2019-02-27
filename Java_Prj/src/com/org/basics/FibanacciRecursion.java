package com.org.basics;

//0 1 1 2 3 5 8 13 21 34
public class FibanacciRecursion {
	
	static int n1=0,n2=1,n3=0;
	public static void printFib(int count){
	if (count>0) {
		n3 = n1+n2;
		n1 = n2;
		n2= n3;
		System.out.print(" "+n3);
		printFib(count-1);
	}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
	 System.out.print("Fibanacci series " +n1+" "+n2);
	 printFib(count-2);
	 
	}

}
