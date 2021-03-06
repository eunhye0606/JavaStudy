 /*===============================================
	  ■■■ 정렬(Sort) 알고리즘 ■■■
================================================*/ 
/*
○ 정렬
   : 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열 (오름차순, 내림차순)

○ 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
     → 보기 좋게 ... 검색하기 위함

○ 정렬의 종류
   : 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬 ....
     → 회사에서 order by 못쓰게 할 정도로 리소스 소모가 크다.  
*/
// 버블 정렬(거품 정렬, Bubble Sort)

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 아무 키나 누르세요...

public class Test110
{
	public static void main(String[] args)
	{
		int [] a = {52, 42, 12, 62, 60};

		/*
		42 52 12 62 60      01
		== --
		42 12 52 62 60      12
		   == --
		42 12 52 62 60      23
			  == --
		42 12 52 60 62      34
			     == --
		------------------------1회전 선택정렬이랑 다른 점 : 선택 정렬 맨 왼쪽이 fix,						기준을 0~3까지
															 버블 정렬 맨 오른족이 fix
		12 42 52 60 62 //-- 다시 첨부터          01
		== --
		12 42 52 60 62                           12
		   == --
		12 42 52 60 62 //-- 60 vs 62는 1회전때 끝남.      23
		      == --
	    ------------------------2회전																		기준을 0~2까지
		12 42 52 60 62        01
		== --
		12 42 52 60 62        12
		   == --
		------------------------3회전																		기준을 0~1까지
		12 42 52 60 62 
		== --
		------------------------4회전																		기준을 0까지	
		*/
		

		//원본 데이터
		System.out.print("Source Data : ");
		for (int n:a )
			System.out.print(n + " ");
		System.out.println();


		//Bubble Sort (for문 한개만)
		// i 는 뒤에 빼주는 용도임! 다시 ㅠㅠ for 문 하나에 변수 두개 넣는법
		int pass =0;
		
		for (i = 0;i<a.length-pass ;i++ )	//반복문하나로 버블Sort만들기!
		{
			if (a[i] > a[i+1])
			{
				// 자리 바꾸기.
				a[j] = a[j]^a[j+1];
				a[j+1] = a[j+1]^a[j];
				a[j] = a[j]^a[j+1];
			}
		}

		//Bubble Sort (답)
		/*
		int i,j;

		for (i=1;i<a.length ;i++ ) // 뒤에서 비교 대상을 하나씩 줄여주는 역할
		{
			for (j=0;j<a.length-i ;j++ ) //i가 1일 때, j = 0, 1, 2, 3	i가 2일 때, j = 0, 1, 2		.... check~!! j == 비교기준자리. vs 1234   123   12    1(비교대상자리)
			{      //-------------
				if (a[j] > a[j+1])
				{ 
					//자리바꾸기
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];

				}
			}
		}
		*/


		//Bubble Sort
		/* 최종
		for (k=4;k>=1 ;k-- )
		{
			for (i=0,j=1;j<=k;i++,j++ )
			{			      // k= 4             k =3          k=2       k=1
			if (a[i] > a[j]) //01 12 23 34      01 12 23       01 12       01
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}
		*/
		

		
		/*
		for (i = 0,j=i+1;i<a.length-1 ;i++,j++ )
		{
			if (a[i] > a[j])
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}

		}
		*/

		/*
		for (i = 0;i<a.length-1 ;i++ ) //웅웅~!!     0123       012       01    01   
		{
			for (j=i+1;j<a.length ;j++) //쑝쑝~!!!   1234       123       12    
			{
				if (a[i] > a[j])
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}
		*/

		//정렬 데이터
		System.out.print("Sorted Data : ");
		for (int n:a )
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
}

/*
실행결과
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/