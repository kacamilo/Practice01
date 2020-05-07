package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int width;
		int height;
		
		System.out.print("가로를 입력하세요: ");
		width = sc.nextInt();
		System.out.print("세로를 입력하세요: ");
		height = sc.nextInt();
		
		double area = width * height;
		double line = 2 * (width+height);
		System.out.println("사각형의 넓이는 " + area);
		System.out.println("사각형의 둘레는 " + line);
		
		sc.close();
	}
	

}
