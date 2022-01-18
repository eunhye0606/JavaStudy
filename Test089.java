/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 배열(2차원 배열)

// 실행 예)
/*
   1   2   3   4   5  i=0
   2   3   4   5   6  i=1
   3   4   5   6   7  i=2
   4   5   6   7   8  i=3
   5   6   7   8   9  i=4

계속하려면 아무 키나 누르십시오 . . .
*/
public class Test089
{
	public static void main(String[] args)

	{
		//배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		int n;

		for (int i =0;i<arr.length ;i++ )		//웅웅이   층
		{
			n = 1+i; //check~!!!!!!
			for (int j=0;j<arr[i].length ;j++ ) //쑝숑이 사무실
			{
				//System.out.print(n + " ");
				//n++;
				arr[i][j] =n;
				n++;
				
			}
			//System.out.println();
		}

		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0 ;j<arr[i].length ;j++ )
			{
				System.out.printf("%d",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
/*
12345
23456
34567
45678
56789

계속하려면 아무 키나 누르십시오 . . .
*/


/*
public class Test089
{
	public static void main(String[] args)

	{
		//배열의 배열 선언 및 메모리 할당
		int [][] arr = new int [5][5];
		int n;

		for (int i=0;i<arr.length ;i++ )
		{
			for (n=i+1;n<arr.length+1 ;n++ )
			{
				for (int j = 0;j < arr[i].length ;j++ )
				{
					arr[i][j]=n;
					n++;
				}
			}

		}
		for (int i =0 ;i<arr.length ;i++ )
		{
			for (int j = 0;j < arr.length ;j++ )
			{
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
*/

/*
   1   2   3   4   5
   2   3   4   5   6
   3   4   5   6   7
   4   5   6   7   8
   5   6   7   8   9

계속하려면 아무 키나 누르십시오 . . .
*/