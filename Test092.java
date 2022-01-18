/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
   E   J   O   T   Y
   D   I   N   S   X   
   C   H   M   R   W   
   B   G   L   Q   V   
   A   F   K   P   U     

계속하려면 아무 키나 누르십시오 . . .
*/

/*
[00][01][02][03][04]    
[10][11][12][13][14]
[20][21][22][23][24]
[30][31][32][33][34]
[40][41][42][43][44]
*/

/*
i = 0                       i= 1
[40][30][20][10][00]       [41][31][21][11][01]        ...
j= 43210                    j=43210
*/

public class Test092
{
	public static void main(String[] args)
	{
		//배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		char start = 'A';

		for (int i=0;i<5 ;i++ )  // i → 0 1 2 3 4
		{
			for (int j=4;j>=0 ;j-- )   // j → 4 3 2 1 0
			{
				arr[j][i] = start++;

			}
		}
		//배열 출력
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%4c",arr[i][j]);
			}
			System.out.println();
		}
	}
}

/*
   E   J   O   T   Y
   D   I   N   S   X
   C   H   M   R   W
   B   G   L   Q   V
   A   F   K   P   U
계속하려면 아무 키나 누르십시오 . . .
*/

/*
public class Test092
{
	public static void main(String[] args)
	{
		//배열 구성.
		char [][] arr = new char [5][5];

		int n=65;
		// 방에 들어가는 문자들 아스키코드 65 ~
		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j=4; j>=0 ;j--,n++) //43210
			{
				arr[j][i] = (char)n;   
				//n++;
				

			}
			//System.out.println(n);
		}

		//배열 출력
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%4c",arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
*/

/*
   E   J   O   T   Y
   D   I   N   S   X
   C   H   M   R   W
   B   G   L   Q   V
   A   F   K   P   U
계속하려면 아무 키나 누르십시오 . . .
*/