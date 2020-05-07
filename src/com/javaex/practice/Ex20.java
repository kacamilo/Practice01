package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		
		System.out.print("500원 개수: " );
		d = sc.nextInt();
		System.out.print("100원 개수: " );
		c = sc.nextInt();
		System.out.print("50원 개수: " );
		b = sc.nextInt();
		System.out.print("10원 개수: " );
		a = sc.nextInt();
		
		int result=(a*10)+(b*50)+(c*100)+(d*500);
		System.out.print("동전의 총합은 " + result + "원 입니다.");
		
		sc.close();
		
	}

}
