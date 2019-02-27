package com.org.basics;

import java.util.Scanner;

/*Armstrong Number in Java: A positive number is called armstrong number
if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153 */ 

public class ArmstrongNumber {

	public static void main(String[] args) {
	 int c=0, temp, a;
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter Number ");
	 int num = s.nextInt();
	 temp = num;
	 while (num>0){
		 a = num%10;
		 num = num/10;
		 c = c+(a*a*a);
	 }
	 if (temp==c)
		 System.out.println("The number is Armstrong number " +c);
	 else
		 System.out.println("The number is not Armstrong number "+c);
	 
	}

}
