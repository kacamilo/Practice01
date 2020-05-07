package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {

		int i = 10;
		int n = ++i %2;
		
		System.out.println(i);		//11...++i 선반영 (1)증가
		System.out.println(n);		//1... 11%2 
	}

}
