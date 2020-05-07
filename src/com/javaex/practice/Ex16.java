package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double price;
		double in;
		
		System.out.print("상품가격: ");
		price = sc.nextInt();
		System.out.print("받은 돈: ");
		in = sc.nextInt();
		System.out.println("====================");
		
		double tax = price * 0.1;
		double result01 = in - price;
		
		System.out.println("받은 돈: " + in);
		System.out.println("상품 가격: " + price);
		System.out.println("부가세: " + tax );
		System.out.print("잔액: " + result01);
		
		
//		double tax = price * 0.1;
//		double leave = in - price;
//		
//		System.out.println("상품가격: ");
//		price = sc.nextInt();
//		System.out.print("받은돈: ");
//		in = 
		
		sc.close();
	
		
	}

}
