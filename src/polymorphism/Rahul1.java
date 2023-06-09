package polymorphism;

import java.util.Arrays;

public class Rahul1 {

	public static void main(String[] args) {
		Rahul1 r=new Rahul1();
		String s="rahul160@1%1999";
		get(s);

	}
	static void get(String s) {
		System.out.println(s);
		String r=" ";
		String r1=" ";
		String r2=" ";
		for (int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				r=r+s.charAt(i);
			} 
			else if(Character.isDigit(s.charAt(i))){
				r1=r1+s.charAt(i);
			}
			else {
				r2=r2+s.charAt(i);
			}
		}
		System.out.println(r);
		System.out.println(r1);
	}
}

