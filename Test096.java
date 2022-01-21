/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 배열(2차원 배열)


//○ 과제
//   배열의 배열(다차원 배열)을 활용하여
//   다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//   그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
A
C  B 
D  E  F
J  I  H  G 
K  L  M  N  O

계속하려면 아무 키나 누르십시오 . . .
*/

/*
[00] →  i == j 같으면 반복문 밖으로 나가자 ~ ! 근데 넣고 나가라!
[10] ← [11]  // 주목~!!!!!!!!!!!!
[20] → [21] → [22] → 
[30] ← [31] ← [32] ← [33] →   // 주목~!!!!!!!!!!!!
[40] → [41] → [42] → [43] → [44]

1. i == j → j=0됨. 그래서 i0 에 a++이 들어감.
2. 

A B C D E F G H I J K L M N O

A  →1개
B C → 2개 i가 1
D E F → 3개
G H I J → 4개 i가 3 
K L M N O → 5개

i % 2 != 0이면 역순 ㄱ ㄱ
*/

public class Test096
{
	public static void main(String[] args)
	{
		int a = 65; // A는 65부터 시작
		

		//배열만들기~~~~
		char [][] arr = new char [5][5];

		for (int i = 0;i<arr.length ;i++ )
		{
			if (i % 2 != 0) //홀수번째 행이면..
			{
				for (int j = i;j>=0 ;j-- )
				{
					arr[i][j] = (char)a;
					a++; // 일단 넣고..
					if (j==0) // 조건이 다름. i == j일때 반복문 돌리니까
					          //언제 개행되는지 보자~!
					{
						break;
					}
				}
			}
			else //짝수행이면...
			{
				for (int j =0;j<arr[i].length ;j++ )
				{
					arr[i][j] = (char)a;
					a++; //일단 값 넣고
					if (i == j)
					{
						break; //반복문 나가라. 같으면			
					}
				}
			}
		}


		//배열출력~~~~~~
		for (int i =0 ;i < arr.length ;i++ )
		{
			for (int j =0;j<arr[i].length ;j++ )
			{
				System.out.printf("%4c",arr[i][j]);
			}
			System.out.println();
		}
	}
}

/*
   A
   C   B
   D   E   F
   J   I   H   G
   K   L   M   N   O
계속하려면 아무 키나 누르십시오 . . .
*/