package com.javalec.base;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		int[] functionNumArr = {1,2,3,4,5,6,7};
		int functionNum , inputNum1 , inputNum2;
		String result = null;
		
		System.out.println("1.덧셈");
		System.out.println("2.뺄셈");
		System.out.println("3.곱셈");
		System.out.println("4.나눗셈 몫");
		System.out.println("5.나눗셈 나머지");
		System.out.println("6.나눗셈");
		System.out.println("7.종료");
		
		while(exit) {
			
			System.out.print(">>번호를 선택하세요 : ");
			functionNum = sc.nextInt();
			
			System.out.print("첫번째 숫자를 입력하세요 : ");
			inputNum1 = sc.nextInt();
			System.out.print("두번째 숫자를 입력하세요 : ");
			inputNum2 = sc.nextInt();
			
			
			if( functionNum == 1) {
				System.out.println("덧셈 결과는 " + functionOne(inputNum1, inputNum2));
			}
			// result 에 번호 선택한 결과 넣어서 이걸 프린트 하면 됨
		}
		
		
		
	}

}
