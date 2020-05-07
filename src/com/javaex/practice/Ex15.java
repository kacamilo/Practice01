package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		// 선언
		Scanner sc = new Scanner(System.in);
	
		int km;
		final double mile = 1.609;
		double result;
		
		//연산
		System.out.print("마일을 입력하세요: " );
		km = sc.nextInt();
		result = mile * km;
		
		//출력
		System.out.println(km+"마일은 " + result + "키로미터 입니다.");
		
		sc.close();
	}

}
