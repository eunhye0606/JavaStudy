 /*===============================================
				■■■ 만년달력■■■
================================================*/ 

// 다음과 같은 기능의 프로그램을 구현한다.

// 실행 예)
// 『연도』를 입력하세요 : 2020
// 『월』를 입력하세요 : 6

/*
       [2020년 6월]

   일 월 화 수 목 금 토
   ====================
             1  2  3  4
   5  6  7  8  9  10 11
   12 13 14 15 16 17 18
   19 20 21 ....

   계속하려면 아무 키나 ...
*/
import java.util.Scanner;
import java.io.IOException;


public class Test107
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);

		int y; //-- 사용자가 입력한 연도 담는 변수.
		int m; //-- 사용자가 입력한 월 담는 변수.
		int lastW; // -- 전달에 마지막 요일
		char startW='g'; //--시작요일 문자.
		           
		

		//사용자한테 입력 받기
		System.out.print("『연도』를 입력하세요 : ");
		y = sc.nextInt();
		System.out.print("『월』를 입력하세요 : ");
		m = sc.nextInt();


		//요일을 배열에 담자.
		char [] wArr = {'일','월','화','수','목','금','토'};
		                //0    1     2    3    4    5    6

		//1년 1월 1일 월요일 
		//1년 1월 2일 화요일 
		//1년 1월31일은 31%7 = 수요일.
		//1년 2월 1일은 목요일 ( 수요일 + 1일)

		//1일의 시작날짜 부터 한달의 날짜일수까지 배열에 담아
		//현재까지의 날수 구하기.
		//그리고 마지막 날만 알아와.
		// 입력을 2022년 6월로 했으면
		// 2022년 5월31일의 요일, 6월의 일수
		// 시작 요일부터 6월 일수만큼 배열에 담기.
		// 그럴필요가 있냐? 걍 m - 1하면 전달인데
		// 아 있다. 

		//전년도까지 날수 구하고 (윤년 평년 고려)
		int [] months = {31,0,31,30,31,30,31,31,30,31,30,31};
		//               1월	~~~~~~~~~~~~~~~~~~~~~~  12월
		if (y % 4 ==0 && y % 100 !=0 || y % 400 == 0)
		{
			//System.out.println("윤년");
			//윤년이면 2월에 29일
			months[1] = 29;
		}
		else 
			//System.out.println("평년");
			//평년이면 2월에 28일.
			months[1] = 28;

		int nalsu =0; // 전년도 + 전월까지 날수 누적합.
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;


		//전월 마지막날까지 날수 합해서
		for (int i =0;i<m-1 ;i++ ) 
			// 입력을 4월을 받았으면 3월까지는 구해야됨.
			// 3월은 months[2]
		{
			nalsu += months[i];
			
		}
		//테스트!
		//System.out.println("전년도 + 전월까지의 날수 : " + nalsu);
		//요일 구하고
		lastW =nalsu % 7;
		//System.out.println("마지막날 요일 : " + lastW+1);
		//System.out.println("입력달 시작 요일 : " + wArr[lastW +1]);


		//그 요일 + 1부터 해당월의 날수해서
		startW = wArr[lastW + 1];
		//System.out.println("입력달 시작 요일 : " + startW);
		//System.out.println("마지막날 요일 : " + nalsu%7);
		// 2022.5.31일 요일 → 화요일 ㅇㅋ
		// nalsu % 7 == 1 → 월요일

	   

		// 한달 그릴 배열 5 * 7
		/*
		[][][][][][][] → i가 0일때, j는 startW
		[][][][][][][] → i가 1일때, j는 0~6까지.
		[][][][][][][]
		[][][][][][][]
		[][][][][][][]

		*/

		int sit = 1; //자리가 1번부터 7까지
		int ln = 1; //줄은 최대 6까지.
		// _ _ _ _ _ _ _
		//  시작 수가 lastW +1 => 만약 수요일 부터면 3
		int b = 0; //공백
		
		//첫줄은 sit == lastW + 1
		int n =1;
		// n부터 출력
		// n++;
		
		//2022년 1월 시작요일
		//System.out.println(lastW + 1); //6임.

		System.out.printf("\n       [%4d년 %2d월]"     ,y,m);
		System.out.println();
		
		for (int k = 0;k < wArr.length ;k++ )
		{
			System.out.printf("%3c" , wArr[k]);
		}
		System.out.println();
		System.out.println("==============================");
		for (ln=1;ln<=6 ;ln++ )
		{

			if (ln ==1) //첫주.
			{
				
				
				for (sit =1;sit<=7 ;sit++ )
				{
					if (sit < lastW + 1)
					{
						System.out.printf("    ");
						// 아 공백 몇칸인지 몰라서
						// 개해맸음 근데 제발 안에 한글넣어서
						// 함 확인해라 오늘처럼 뻘짓하지말고

					}
					else 
					{
						System.out.printf("%4d",n);
						n++;
					}
					
				}
			}
			else // 2주부터 6주까지.
			{
			    for (sit=1;sit<=7 ;sit++ )
			    {
					if (n<=months[m-1])
					{
						System.out.printf("%4d",n);
						n++;

					}
					



			    }
				
			}
			
			System.out.println();
		}
		/* 배열아님~ 배열은 공백안돼 0으로 채움!
		int [][] monArr = new int[6][7];
		int n=1; // 1부터 months[m-1]까지 채우기.
		int i;
		int j;
		for (i = 0;i<monArr.length ;i++ )
		{
			if (i ==0)
			{
				for (j = lastW +1 ;j<monArr[i].length;j++ )
				{
					monArr[0][j] = n;
					n++;
					if (n >months[m-1])
					{
						monArr[i][j] = 0;
					}

				}
			}
			else 
			    for (j = 0;j<monArr[i].length ;j++ )
			    {
				  monArr[i][j] = n;
				  n++;
				  if (n >months[m-1])
					{
						monArr[i][j] = 0;
					}
				
			    }
			

			//if (n <1 || n>months[m-1])
			//{
				//monArr[i][j] = ' ';
			//}
		}
		*/
		
			
		
		




		//출력.
		/*

		System.out.printf("       [%4d년 %4d월]"     ,y,m);
		System.out.println();


		for (int k = 0;k < wArr.length ;k++ )
		{
			System.out.printf("%3c" , wArr[k]);
		}
		System.out.println();
		System.out.println("==============================");

		for (int k =0;k<monArr.length ;k++ )
		{
			
			for (int h =0;h<monArr[k].length ;h++ )
			{
				
				System.out.printf("%4d",monArr[k][h]);

			}
			System.out.println();
			

		}
		System.out.println("==============================");
		
		
		*/

		
	}
}

/*
『연도』를 입력하세요 : 2022
『월』를 입력하세요 : 1

       [2022년  1월]
  일  월  화  수  목  금  토
==============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
계속하려면 아무 키나 누르십시오 . . .
*/