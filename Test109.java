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

// 선택 정렬(Selection Sort)
// 하나를 기준으로 비교해간다~1

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 아무 키나 누르세요...

public class Test109
{
	public static void main(String[] args)
	{
		int [] a = {52, 42, 12, 62, 60};
		/*
		42 52 12 62 60			0 vs 1
		== -- 
		12 52 42 62 60			0 vs 2
		==    --
		12 52 42 62 60			0 vs 3
		==       --
		12 52 42 62 60			0 vs 4
		==	        --
		------------------------1회전
		12 42 52 62 60			1 vs 2
		   == --
		12 42 52 62 60			1 vs 3
		   ==    --
		12 42 52 62 60			1 vs 4
		   ==       --
		------------------------2회전
		12 42 52 62 60			2 vs 3
		      == -- 
		12 42 52 62 60			2 vs 4
		      ==    --
		------------------------3회전
		12 42 52 60 62			3 vs 4
		         == --
		------------------------4회전

		*/

		//답

		int i, j;
		System.out.print("Source Data : " );
		/*
		for (i = 0;i<a.length ;i++ )
			System.out.print(a[i] + " ");
		System.out.println();
		*/
		// 향상된 for문(foreach 구문)
		// 자료구조를 탈탈 털겠다! a에 첨부터 순차적으로 접근하겠다.
		// int배열타입 ㄴㄴ 하나의 요소의 데이터 타입 = int타입
		/*
		for (요소 하나의 자료타입 변수명(아무거나)	:①자료구조)
		{
			a자료구조에 제일 첫번째 가져와서 n에 담아서 반복문 수행
			a끝까지 a.length만큼
			5번 돌아요... a의 방갯수만큼!
			a에서 끄집어낼게 없으면 반복문끝나요..
		}
		*/
		for (int n :a )
			System.out.print(n + " "); //a[0], a[i], a[2], ..., a[4]
		System.out.println();

	

		// Selection Sort
		for (i=0;i<a.length ;i++ ) // 웅웅 ~~비교기준데이터 0 1 2 3 //// 52,~,60까지만
		{
			for (j=i;j<a.length ;j++ ) //쑝쑝~!!!! 비교대상데이터  1234 234 34 4
			{
				if (a[i] < a[j])			//if (a[i] > a[j]) //오름차순 정렬
				{
					//자리바꾸기
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}

			}
		}


		/*
		System.out.print("Sorted Data : " );
		for (i=0;i<a.length ; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		*/
		System.out.print("Sorted Data : " );
		for (int n:a )
			System.out.print(n + " " );
		System.out.println();
		
		
		
	}
}
		
		
		
		/*
		//Source Data
		System.out.print("Source Data : " );
		for (int i = 0;i<a.length ;i++ )
			System.out.printf("%4d",a[i]);
		System.out.println();


		//정렬
		for (int i = 1;i<=a.length ;i++ )
		{
			for (int j = 0;j<i ;j++ )
			{
				for (int h =j+1;h<i ;h++ )
				{
					if (a[j] > a[h])  //0 vs 1, 0 vs 2
					{
						a[j] = a[j]^a[h];
						a[h] = a[h]^a[j];
						a[j] = a[j]^a[h];
					}
				}
			}
		}
		

		//결과출력
		//Sorted Data
		System.out.print("Sorted Data : ");
		for (int i = 0;i < a.length ;i++ )
		{
			System.out.printf("%4d",a[i]);
		}
		System.out.println();
		


	}
}
*/

/*
실행결과

Source Data :   52  42  12  62  60
Sorted Data :   12  42  52  60  62
계속하려면 아무 키나 누르십시오 . . .
*/