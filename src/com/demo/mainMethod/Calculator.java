package com.demo.mainMethod;
import java.util.Scanner;
import com.demo.impl.Addition;
import com.demo.impl.Subtraction;
public class Calculator {
    public static void main(String[] args) {
    	
	System.out.println("\ninside main method");
	Scanner sc=new Scanner(System.in);
	System.out.println("\nenter num1");
	int i1=sc.nextInt();
	System.out.println("\nenter num2");
	
	int i2=sc.nextInt();
	System.out.println("your num is "+i1+"  "+i2);
	
	Addition s1=new Addition();
	s1.sum(i1, i2);
	
	Subtraction s2=new Subtraction();
	s2.sub(i1, i2);
	
	
	
}

}
