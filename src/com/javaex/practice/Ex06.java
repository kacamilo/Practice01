package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {

		
			int i = 10;
			int n = i++ %2;
			
			System.out.println(i);		//11...i++ 다음줄에 영향을 미침
			System.out.println(n);		//0 ... ++%2가 0이기 때문에
	}

}
