package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {

			int	 x = 1;
			int y = 1;
			
			int a = ++x *2;			// ++x(2)*2=4 ==>x인 1의 증가값 2 * 2 = 4
			int b = y++ *2;		// y++*2=2 ==> y증가 이전 값인 1 * 2 = 2 
			
			System.out.println("a=" + a);		// a = 4
			System.out.println("b=" + b);		// b = 2
			System.out.println("x=" + x);		// (1)1 = 2
			System.out.println("y=" + y);		// 1(1) = 2
			
	}

}
