/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 사용자로부터 임의의 정수 5개를 입력받아
// 짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
// 단, Scanner를 활용하여 데이터를 입력받을 수 있도록 한다.

// 실행 예 )
// 임의의 정수 5개 입력 : 1 2 3 4 5

// >> 짝수의 합은 6이고, 홀수의 합은 9 입니다.
// 계속하려면 아무 키나....

import java.util.Scanner;

public class Test040
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n1,n2,n3,n4,n5; //입력받는 정수
		int x, y; //짝수합, 홀수 합

		x= 0;
		y= 0;
		
		System.out.print("임의의 정수 5개 입력 : [공백 구문] ");

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		//n에 들어가는 수가 짝수면 x에 증감.


		if (n1 % 2 == 0)
		{
			x += n1; // x = x + n1
					 // x = +n1
					 // x를 n1만큼 증가시켜라.
					 //누적합 연산. → 복합대입연산자, 왼쪽의 피연산자
					 // 초기값있어야함.
					 //			   → 기준값이 필요 초기값 0
					 // 누적합 → 초기값0
					 // 누적곱 → 초기값1
					 // 없다면 얼마만큼 증가시켜라 안돼.
		}
		else if (n1 % 2 != 0)
		{
			y += n1;
		}
		else
			System.out.println("문제 발생.");
			
		

		if (n2 % 2 ==0)
		{
			x += n2;
		}
		else if (n2 % 2 != 0)
		{
			y += n2;
		}
		else 
			System.out.println("문제 발생.");



		if (n3 % 2 == 0)
		{
			x += n3;	
		}
		else if (n3 % 2 != 0)
		{
			y += n3;
		}
		else 
			System.out.println("문제 발생.");




		if (n4 % 2 ==0)
		{
			x += n4;
		}
		else if (n4 % 2 != 0)
		{
			y += n4;
		}

		else 
			System.out.println("문제 발생.");

		if (n5 % 2 == 0)
		{
			x += n5;
		}
		else if (n5 % 2 != 0)
		{
			y += n5;
		}
		else 
			System.out.println("문제 발생.");
	
		

		//System.out.printf("%d %d %d %d %d \n",n1, n2, n3, n4, n5);
		System.out.printf("\n>>짝수의 합은 %d이고, 홀수의 합은 %d 입니다. \n",x,y);

	}
}

/*
임의의 정수 5개 입력 : [공백 구문] 1 2 3 4 5

>>짝수의 합은 6이고, 홀수의 합은 9 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/