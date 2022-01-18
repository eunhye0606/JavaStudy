/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 반복문(for 문) 실습
//다중 for문(반복문의 중첩)을 활용한 별찍기 실습

//◎ 과제
//   다음과 같은 내용이 출력될 수 있도록
//   반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/* 실행 예)

*********
 *******
  *****
   ***
	*
*/
// 9 - 1 = 8 /2 = 4
// 9 - 3 = 6 /2 = 3
// 9 - 5 = 4 /2 = 2
// 9 - 7 = 2 /2 = 1
// 9 - 9 = 0
//Test063의 반대.
//별 9~1개. (9,7,5,3,1)
//공백 0~4개
//첫줄 공백 0 별 9개
//두줄 공백 1 별 7개
//세줄 공백 2 별 5개
//네줄 공백 3 별 3개
//다섯줄 공백 4 별 1개
// 공백 + 별 = 9,8,7,6,5



//전체 자리 : s+2*b






public class Test065
{
	public static void main(String[] args)
	{
		int ln; //--line 루프변수
		int x; // 자리 루프변수

		int s; // 별
		int b; // 앞공백
		
		/*
		첫줄 : s=9 , b=0
		두줄 : s=7 , b=1
		세줄 : s=5 , b=2
		네줄 : s=3 , b=3
		다섯줄: s=1 ,b=4
		*/
		


		for (ln=1;ln<=5 ;ln++ ) //첫번째 줄 ~ 다섯번째 줄까지 반복.
		{
			s = -2*ln + 11;  //9,7,5,3,1
			b = ln - 1;     //0,1,2,3,4

			for (x=1;x<=9 ;x++ ) //_ _ _ _ _ _ _ _ _ 
			{
				if (x<=b) // 두번째줄을 예시로 들자면      b_ s_ s_ s_ s_ s_ s_ s_ b_
				{                                //        x =1 b =1 s =7       s+b =8
					System.out.print(" ");
				}
				else if (x<=b+s)
				{
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
	}
}

//세번째 줄 예시
// b_ b_ s_ s_ s_ s_ s_ b_ b_
// x = 1,2는 b 
//b = 2
//x<=b
// 