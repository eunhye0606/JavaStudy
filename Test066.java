/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 반복문(for 문) 실습
//다중 for문(반복문의 중첩)을 활용한 별찍기 실습

//◎ 과제
//   다음과 같은 내용이 출력될 수 있도록
//   반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/* 실행 예)

    *   → 별 1 앞공백 4
   ***  → 별 3 앞공백 3
  ***** → 별 5 앞공백 2
 *******→ 별 7 앞공백 1 
*********  별 9 앞공백 0 ====================
 *******→ 별 7 앞공백 1
  ***** → 별 5 앞공백 2
   ***  → 별 3 앞공백 3
	*   → 별 1 앞공백 4
*/
/*
k =1 일 때, s= 1,b=4
k =2 일 때, s= 3,b=3
....

s = 2 * k -1
b = -k +5
===========
k = 6 일 때, s =7, b= 1
k = 7 일 때, s =5, b= 2
....

s = -2 * k +19       k>5
b = k -5
*/

public class Test066
{
	public static void main(String[] args)
	{
		int k; //-- k번째 줄. 1~9줄.루프변수
		int x; //-- _ _ _ _ _ _ _ _ _ x번째 자리. 의자.루프변수
		int b; // 공백
		int s; // 별
		
		for (k=1;k<=9 ; k++) //첫번째 줄 ~ 아홉번째 줄
		{
			if (k<=5)
			{ 
				s = 2 * k -1;
				b = -k + 5;
				for (x=1;x<=9 ;x++ ) // b_ b_ s_ s_ s_ s_ s_ b_ b_ 3번째예시.
				{					 // 1  2  3  4  5  6  7  8  9  x자리.	
					
					if(x<=b)
						System.out.print(" ");
					else if (x<=s+b)
					
						System.out.print("*");
					
				}
				System.out.println();

			}
			else
			{
				for (x=1;x<=9 ;x++ )
				{
					s= -2 * k + 19;
					b = k - 5;
					if (x<=b)
				
						System.out.print(" ");
					
					else if (x<=s+b)
					
						System.out.print("*");
					
				}
				System.out.println();

			} 

		}
	}
}
/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .
*/