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
B  C
D  E  F
G  H  I  J
K  L  M  N  O

계속하려면 아무 키나 누르십시오 . . .
*/

/*
[00][01][02][03][04]
[10][11][12][13][14]
[20][21][22][23][24]
[30][31][32][33][34]
[40][41][42][43][44]

[00] →  i == j 같으면 반복문 밖으로 나가자 ~ ! 근데 넣고 나가라!
[10] → [11] → 
[20] → [21] → [22] → 
[30] → [31] → [32] → [33] →
[40] → [41] → [42] → [43] → [44]

A B C D E F G H I J K L M N O

A  →1개
B C → 2개
D E F → 3개
G H I J → 4개
K L M N O → 5개

*/

public class Test095
{
	public static void main(String[] args)
	{
		
		//배열 구성
		char [][] arr = new char [5][5];

		int n = 65;

		for (int i =0;i<arr.length ;i++ )
		{
			for (int j =0 ;j<arr[i].length ;j++ )
			{
				arr[i][j] = (char)n;
				n++;
				if (i == j)
					//System.out.println("하이요");
					j = arr[i].length; //j를 걍 최대로 두면 이 for문 밖으로 나가겠쥬??
				
			
			}
			
		}

		//배열 출력
		for (int i =0 ;i <arr.length ;i++ )
		{
			for (int j =0;j<arr[i].length ;j++ )
				System.out.printf(" %c", arr[i][j]);
			
			System.out.println();
		}

	}
}
/*
 A
 B C
 D E F
 G H I J
 K L M N O
계속하려면 아무 키나 누르십시오 . . .
*/