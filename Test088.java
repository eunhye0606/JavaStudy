/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열 (5 x 5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
 1  2  3  4  5
 6  7  8  9 10
11 12 13 14 15
16 18 18 19 20
21 22 23 24 25
*/

public class Test088
{
	public static void main(String[] args)
	{

		//배열의 배열 선언.
		int [][] arr = new int[2][5];
		//System.out.println(arr.length); // 층 5층
		/*
		[] [] [] [] [] → 1층 arr[1]
		[] [] [] [] [] → 2층 arr[2]
		[] [] [] [] [] → 3층 arr[3]
		[] [] [] [] [] → 4층 arr[4]
		[] [] [] [] [] → 5층 arr[5]
		*/
		int n = 1;
		
		//배열의 배열 구성.
		for (int i = 0;i<arr.length ;i++ ) // 웅 → outer → 0 1 2 3 4
			
		{
			for (int j =0;j<arr[i].length ;j++ )
			{
				arr[i][j] = n;
				n ++;
			}
		
		}
		//배열의 배열 출력
		for (int i = 0;i<arr.length ;i++ )
			
		{
			for (int j =0;j<arr[i].length ;j++ )
				
			{
				//System.out.println(arr[i].length);
				System.out.printf("%4d" , arr[i][j]);
			}
			System.out.println();
		}
	}
}

/*
   1   2   3   4   5
   6   7   8   9  10
  11  12  13  14  15
  16  17  18  19  20
  21  22  23  24  25
계속하려면 아무 키나 누르십시오 . . .

*/