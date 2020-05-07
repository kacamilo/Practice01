package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int r;
		double v;
		final double pi=3.14;
		
		System.out.print("반지름: " );
		r = sc.nextInt();
		
		v = (double)4/3*pi*r*r*r;
		System.out.println("구의 부피: "+v+" 입니다." );
		
		sc.close();
		
		
		
	}

}
