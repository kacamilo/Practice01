package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int money ;		//월급
		int x;				//저축액
		
		System.out.print("월급을 입력하세요: ");
		
		money = sc.nextInt();
		
		x = money * 12 * 10;
		
		System.out.println("10년동안 최대 저축액은 " + x +"원 입니다.");
		
		sc.close();
		
	}

}
