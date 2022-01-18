/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 반복문(for 문) 실습
//다중 for문(반복문의 중첩)을 활용한 별찍기 실습

//◎ 과제
//   다음과 같은 내용이 출력될 수 있도록
//   반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/* 실행 예)  

    *
   ***
  *****
 *******
*********
*/

// 1. 9자리수 
// 2. 별의개수 :ln == 1 , *개수 1개 
//              ln == 2 , *개수 3개
//              ln == 3 , *개수 5개

//즉, ln =k, *개수 2k -1 
// 3. 공백의 개수
// ln == 1 앞 공백 4개 ln - b = 음수
// ln == 2 앞 공백 3개
// ln == 3 앞 공백 2개
// ln == 4 앞 
// 

//즉, ln = k , 공백 -k +5
// 등차수열 일반항 : A는 증가하는 개수(공차, 버블티아님) A*n +B, B는 초항을 위한 상수

// ln = k 번째 행
// * = s
// 공백 = b

// 2k -1 = s
// k = (s + 1) /2 

// -k + 5 = b
// k = -b + 5
// (b=1, b<=5, b++)


public class Test064
{
	public static void main(String[] args)
	{
		int k=0; //-- 개행 반복문 루프변수
		int b; // 공백 
		int s; // 별 
		int l; // 글자개수 변수 루프변수

//방법 ②. 9자리 자릿수에 공백과 별 넣기. + 뒤에 공백은 안찍어도 됨.
// 최종!!!!!!!!!!

		for (k=1; k<=5; k++)   //아래 한줄에 대한 조건의 반복
		{
			b = 5-k; // 두번째 b = 3 앞공백 개수
			s = 2*k-1; // s = 3 = 별 개수

			for (l=1; l<=9; l++)// 한줄에 대한 조건  (b  s  b), 아홉글자, 아홉번 돈다. → bbbsssbbb → 의자.
			{
				if (l<=b) 
				{
					System.out.print(" ");
				}
				else if (l<=b+s)
				{
					System.out.print("*");
				}
				
			}
			System.out.println();

		}

	}
}
/*
실행 결과

    *
   ***
  *****
 *******
*********
계속하려면 아무 키나 누르십시오 . . .
*/



//방법 ①. 9자리 자릿수에 공백과 별 넣기.
/*
public class Test064
{
	public static void main(String[] args)
	{
		int k=0; //-- 개행 반복문 루프변수
		int b; // 공백 반복문 루프변수
		int s; // 별 반복문 루프변수
		int l; // 글자개수 변수

//1 for 돌고 2 for 돈다-> 

		for (k=1; k<=5; k++)   //아래 한줄에 대한 조건의 반복
		{
			b = 5-k; // 두번째 b = 3 앞공백 개수
			s = 2*k-1; // s = 3 = 별 개수

			for (l=1; l<=9; l++)// 한줄에 대한 조건  (b  s  b), 아홉글자, 아홉번 돈다. → bbbsssbbb → 의자.
			{
				if (l <= b)  //공백의 조건
				{
					System.out.print(" ");
				}
				else 
					if (l <= b+s)
					{
					System.out.print("*");
					}
					else if (l <=b+s+b)
					{
						System.out.print(" ");
					}
				
			}
			System.out.println();

		}

	}
}
*/

/*
방법① . 실행결과

    *
   ***
  *****
 *******
*********
계속하려면 아무 키나 누르십시오 . . .
*/

//공백 4,3,2,1,0 감소  
//별 1,3,5,7,9 증가



/*
public class Test064
{
	public static void main(String[] args)
	{
		int ln; // 개행 반복문 루프변수
		int b; // 공백 반복문 루프변수
		       // 공백찍고 별찍고 개행.
		int s; // 별찍는 개수 증가하는 루프변수 1,3,5,7,9...

		for (ln =1 ;ln <= 5 ;ln++ )
		{
			for (b = 5 ;b>=0 ;b-- )		
										//공백 4번
										// ln =1 ,b= 4 , ln - b = -3	" "
										// ln =1 ,b= 3 , ln - b = -2    " " 
										// ln =1 ,b= 2 , ln - b = -1    " "
										// ln =1 ,b= 1 , ln - b = 0     " "
										// ln =1 ,b= 0 , ln - b = 1      *


										//공백3번
										//  ln =2 ,b= 4 , ln - b = -2	" "
										//  ln =2 ,b= 3 , ln - b = -1	" "
										//  ln =2 ,b= 2 , ln - b = 0    " "
										//  ln =2 ,b= 1 , ln - b = 1     *

										 //ln = 1 ,s = 9 ln - s = -8        
										 //ln = 1, s = 7 ln - s = -6
										 //ln = 1, s = 5 ln - s = -4
										 //ln = 1, s = 3 ln - s = -2
										 //ln = 1, s = 1 ln - s = -0

						
										
			{
				if (ln - b <0)              //-3,-2,-1,0 → 4번 공백.
				{
					System.out.print("뀨 ");
				}
				else 
				{
					for (s= 9 ;s >=1 ;s -=2 )
					{
						if (ln - s <=0)
						{
							System.out.println("*");// 별 1,3,5,7,9개 찍기.
						}
					}
				}
			}
			System.out.println();
		}
	}
}
*/
												

/**public class Test064
{
	public static void main(String[] args)
	{


		int k; //-- 개행 반복문 루프변수
		int b; // 공백 반복문 루프변수
		int s; // 별 반복문 루프변수

		for (줄조건)
		{
			for (9자리 글자에 대한 조건.) //_ _ _ _ _ _ _ _ _(b s b)
			{
				if (앞공백조건)
				{
					System.out.print(" ");
				}
				else 
					if (별조건)
					{
					System.out.print("*");
					}
					else if(뒤공백조건)
						System.out.print(" ");
				
			}
			System.out.println();

		}

	}
}
**/




/***
public class Test064
{
	public static void main(String[] args)
	{


		int k; //-- 개행 반복문 루프변수
		int b; // 공백 반복문 루프변수
		int s; // 별 반복문 루프변수

		for (k=1;k<=5;k++)
		{
			for (b=4;b>=0;b--) //첫 1 b = 4,3,2,1,0  → 4,3,2,1 → 음수  " " 0 이면 *

							   //2줄  b = 4,3,2,1,0
			{
				if (k-b<0) 
				{
					System.out.print(" ");
				}
				else // ln - b =0
					if (k - b>=0)
					{
					System.out.print("*");
					}
					else
						System.out.print(" ");
			}
			System.out.println();

		}

	}
}
***/

/****
public class Test064
{
	public static void main(String[] args)
	{


		int k; //-- 개행 반복문 루프변수
		int b; // 공백 반복문 루프변수
		int s; // 별 반복문 루프변수

		for (ln=1;ln<=5 ;ln++ )
		{
			for (b=1;b>=0 ;b++ )
			{
				if (ln-b<0)
				{
					System.out.print(" ");
				}
				else 
					if (ln -b >=0)
					{
					System.out.print("*");
					}
					else
						System.out.print(" ");
				
			}
			System.out.println();

		}

	}
}
****/