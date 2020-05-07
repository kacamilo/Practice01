package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int r;
		
		final double pi = 3.14;
		
		System.out.print("반지름을 입력하세요: ");
		
		r = sc.nextInt();
		
		double result01 = r*r*pi;
		
		System.out.println("원의 넓이는 " + result01 );
		
		sc.close();
	}

}
