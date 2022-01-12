/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 반복문(for 문) 실습
//다중 for문(반복문의 중첩)을 활용한 구구단 출력 실습

//① 2중첩 *2		//②3중첩 *1


// 실행 예)
/*

2 * 1 = 2               3 * 1 = 3               4 * 1 = 4               5 * 1 = 5
2 * 2 = 4               3 * 2 = 6               4 * 2 = 8               5 * 2 = 10
2 * 3 = 6               3 * 3 = 9               4 * 3 = 12              5 * 3 = 15
2 * 4 = 8               3 * 4 = 12              4 * 4 = 16              5 * 4 = 20
2 * 5 = 10              3 * 5 = 15              4 * 5 = 20              5 * 5 = 25				→→→ 1문단
2 * 6 = 12              3 * 6 = 18              4 * 6 = 24              5 * 6 = 30
2 * 7 = 14              3 * 7 = 21              4 * 7 = 28              5 * 7 = 35
2 * 8 = 16              3 * 8 = 24              4 * 8 = 32              5 * 8 = 40
2 * 9 = 18              3 * 9 = 27              4 * 9 = 36              5 * 9 = 45

6 * 1 = 6               7 * 1 = 7               8 * 1 = 8               9 * 1 = 9
6 * 2 = 12              7 * 2 = 14              8 * 2 = 16              9 * 2 = 18
6 * 3 = 18              7 * 3 = 21              8 * 3 = 24              9 * 3 = 27
6 * 4 = 24              7 * 4 = 28              8 * 4 = 32              9 * 4 = 36
6 * 5 = 30              7 * 5 = 35              8 * 5 = 40              9 * 5 = 45				→→→ 2문단
6 * 6 = 36              7 * 6 = 42              8 * 6 = 48              9 * 6 = 54
6 * 7 = 42              7 * 7 = 49              8 * 7 = 56              9 * 7 = 63
6 * 8 = 48              7 * 8 = 56              8 * 8 = 64              9 * 8 = 72
6 * 9 = 54              7 * 9 = 63              8 * 9 = 72              9 * 9 = 81
계속하려면 아무 키나 누르십시오 . . .
*/
//■■■Type A■■■
//
//1. Test061과 비교하여
//출력의 방향이 다르기 때문에
//반복문의 제어 흐름도 달라져야 한다.
//콘솔기반의 출력환경이기 때문에..

//2.(1)에따라
//단과 곱해지는 수의 위치가
//달라진 상태에서 반복문 구성
/*
		for (j=1;j<=9 ;j++ )
			{
				for (k=2;k<=5 ;k++ )
				{
					System.out.printf("%4d * %d = %2d ",(k+i*4),j,(k*j)); 
														//____
														//아 i는 0,1
														//2단 밑에는 6단. 문단 바뀔때 앞에 단이 +4만하면 좋겠다.
														//★★★★★★★★어떻게 이런생각을 ㅜㅜ
				}
				System.out.println();
				//2 * 1 = 2    3 * 1 = 3    4 * 1 = 4    5 * 1 = 5    
				//2 * 2 = 4    3 * 2 = 6    4 * 2 = 8    5 * 2 = 10   
		
			}
*/

//3.(2)에서 처리한 결과를 
//두 문단으로 반복하는 반복문 구성
//check~!!!! 반복문에 2의 결과를 삽입.★★★★★★★★★★★★★★★★


/*
	for (i=0;i<2 ;i++ )
		{
			for (j=1;j<=9 ;j++ )
			{
				for (k=2;k<=5 ;k++ )
				{
					System.out.printf("%4d * %d = %2d ",(k+i*4),j,(k*j)); 
														//____
														//아 i는 0,1
														//2단 밑에는 6단. 문단 바뀔때 앞에 단이 +4만하면 좋겠다.
														//★★★★★★★★어떻게 이런생각을 ㅜㅜ
				}
				System.out.println();
				//2 * 1 = 2    3 * 1 = 3    4 * 1 = 4    5 * 1 = 5    
				//2 * 2 = 4    3 * 2 = 6    4 * 2 = 8    5 * 2 = 10   
		
			}
			System.out.println();	//다음 i=1인 문단으로 가기 전에 2단과 6단 사이에 개행한번하자.
		}
*/

//4.같은 구문을 
//두 문단으로 나누어 처리하는 과정에서
//문단에 따라 주어진 환경 (h의 값)을 활용하는 방법으로
//최종 반복문 3중첩.

//■■■Type B■■■
/*
int a,b,c;
for (a=2;a<=6;a+=4)			//2,6
{
	for (b=1,b<=9,b++)		//1 2 3 4 5 6 7 8 9
	{
		for (c=a;c<=(a+3);c++)		//a가 2일때 → 2 3 4 5
									//a가 6일때 → 6 7 8 9
		{
			System.out.printf("%4d * %d = %2d",c,b,(c*b));
		}
		System.out.println();
	}
	System.out.println();
}


*/


public class Test062						//	→ 3중첩 다시해보기
{
	public static void main(String[] args)
	{
		//① 문단 1,2★★★★★★★어떻게 이런 생각을 ㅠㅠ
		//② 곱해지는수 1111
		//              2222
		//              3333
		//				  :
		//③ 단    12345
		//		   56789

		//변수 선언
		int i,j,k;		//--문단,곱해지는수, 단
		for (i=0;i<2 ;i++ )
		{
			for (j=1;j<=9 ;j++ )
			{
				for (k=2;k<=5 ;k++ )
				{
					System.out.printf("%4d * %d = %2d ",(k+i*4),j,(k*j)); 
														//____
														//아 i는 0,1
														//2단 밑에는 6단. 문단 바뀔때 앞에 단이 +4만하면 좋겠다.
														//★★★★★★★★어떻게 이런생각을 ㅜㅜ
				}
				System.out.println();
				//2 * 1 = 2    3 * 1 = 3    4 * 1 = 4    5 * 1 = 5    
				//2 * 2 = 4    3 * 2 = 6    4 * 2 = 8    5 * 2 = 10   
		
			}
			System.out.println();	//다음 i=1인 문단으로 가기 전에 2단과 6단 사이에 개행한번하자.
		}
	}

}


//① for 문 2중 중첩 * 2
/*
		int i,j;

		for (i=1;i<=9 ;i++ )
		{
			for (j=2;j<=5 ;j++ )
			{
				System.out.printf("%d * %d = %d		", j,i,(j*i));
			//	if (j == 5)
			//	{
			//		System.out.println();
				//}
			}
			System.out.println();
		}

		System.out.println();

		int k,h;
		for (k=1;k<=9 ;k++ )
		{
			for (h=6;h<=9 ;h++ )
			{
				System.out.printf("%d * %d = %d		", h,k,(h*k));
				//if (h == 9)
				//{
				//	System.out.println();
				//}
			}
			System.out.println();

		}
	}
}

/*
2 * 1 = 2               3 * 1 = 3               4 * 1 = 4               5 * 1 = 5
2 * 2 = 4               3 * 2 = 6               4 * 2 = 8               5 * 2 = 10
2 * 3 = 6               3 * 3 = 9               4 * 3 = 12              5 * 3 = 15
2 * 4 = 8               3 * 4 = 12              4 * 4 = 16              5 * 4 = 20
2 * 5 = 10              3 * 5 = 15              4 * 5 = 20              5 * 5 = 25
2 * 6 = 12              3 * 6 = 18              4 * 6 = 24              5 * 6 = 30
2 * 7 = 14              3 * 7 = 21              4 * 7 = 28              5 * 7 = 35
2 * 8 = 16              3 * 8 = 24              4 * 8 = 32              5 * 8 = 40
2 * 9 = 18              3 * 9 = 27              4 * 9 = 36              5 * 9 = 45

6 * 1 = 6               7 * 1 = 7               8 * 1 = 8               9 * 1 = 9
6 * 2 = 12              7 * 2 = 14              8 * 2 = 16              9 * 2 = 18
6 * 3 = 18              7 * 3 = 21              8 * 3 = 24              9 * 3 = 27
6 * 4 = 24              7 * 4 = 28              8 * 4 = 32              9 * 4 = 36
6 * 5 = 30              7 * 5 = 35              8 * 5 = 40              9 * 5 = 45
6 * 6 = 36              7 * 6 = 42              8 * 6 = 48              9 * 6 = 54
6 * 7 = 42              7 * 7 = 49              8 * 7 = 56              9 * 7 = 63
6 * 8 = 48              7 * 8 = 56              8 * 8 = 64              9 * 8 = 72
6 * 9 = 54              7 * 9 = 63              8 * 9 = 72              9 * 9 = 81
계속하려면 아무 키나 누르십시오 . . .
*/














/*		for (i=1;i<=9 ;i++ )
		{
			for (j=2;j<=9 ;j++ )
			{
				System.out.printf("%d * %d = %d		", j,i,(j*i));
				if (j == 5)
				{
					System.out.println();
				}
			}
		}
	}
}
/*		int i,j;
		for (i=2;i<=9 ;i++ )
		{
			System.out.printf("%d * 1 = %d	", i,(i*1));
	/*		for (j = 2;j<=9 ;j++ )
			{
				System.out.printf("%d * %d = %d		", i,j,(i*j));
				
			}
			*/
			//if (i == 5)
		//	{
				//System.out.println();
	//		}
//
			/*for (j=1;j<=9 ;j++ )
			{
				System.out.printf("%d * %d = %d		", i,j,(i*j));
			}*/
	//	}
//	}
//}

/*

*/

/*		for (i=2;i<=9 ;i++ )
		{
			for (j=1;j<=9 ;j++ )
			{
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
			}
		System.out.println();
		if (i >5)
		{
			System.out.println();
		}
		}
	}
}

/*		int i, j;
		int k=0;

		for (i=2;i<=9 ;i++ )
		{
			System.out.printf("%d * 1 = %d\n", i,(i*1));
			if (i%5 ==0)
			{
				System.out.println("\n");
			}

			for (j=2;j<=9 ;j++ )
			{
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
			}
			



			for (j=2;j<=9 ;j++ )
			{
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
			}

			
		}
		System.out.println();
		


	}
}

/*
2 * 1 = 2               3 * 1 = 3               4 * 1 = 4               5 * 1 = 5

6 * 1 = 6               7 * 1 = 7               8 * 1 = 8               9 * 1 = 9
계속하려면 아무 키나 누르십시오 . . .

*/