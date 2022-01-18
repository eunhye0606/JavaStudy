/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
   1   2   3   4   5   ← arr[0][4]    0번부터 담기
   5   1   2   3   4   ← arr[1][4]    1번부터 담기
   4   5   1   2   3   ← arr[2][4]    2번부터 담기
   3   4   5   1   2   ← arr[3][4]    3번부터 담기
   2   3   4   5   1   ← arr[4][4]    4번부터 담기

계속하려면 아무 키나 누르십시오 . . .
*/

/*                  0으로
   1   2   3   4   5|  
       1   2   3   4|  5 
           1   2   3|  4  5 
               1   2|  3  4  5 
                   1|  2  3  4  5 

계속하려면 아무 키나 누르십시오 . . .
*/
/*
		[00][01][02][03][04]    
		[10][11][12][13][14]
		[20][21][22][23][24]
		[30][31][32][33][34]
		[40][41][42][43][44]
		1이 시작하는곳 i = j

		
*/

public class Test090
{
	public static void main(String[] args)
	{
		//배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		
		//System.out.println(arr.length);
		// -->> 5
		for (int i = 0 ;i<arr.length;i++ )   //--5행.
		{
			for (int j=i,n=1; n<=5 ;n++ )    // 시작점이 00 11 22 33 44 [i][j] 
			{    //여기로 도래 ＠＠＠＠＠＠＠도래 아님!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				//근데 j가 0이 되는데 이 for 문에서는 j=i라서 arr[1][5] == arr[0][0] 아닌가?
				//                                            _______________________
				//                                             아님.

				//System.out.print( i + " - " + j+ "	");
				arr[i][j] = n; //1 2 3 4 5   12345 12345 12345 반복.  //시작점. 값넣고 j 늘리기 옆방으로 호수 늘리기
				//arr[1][0]arr[1][1]arr[1][2]arr[1][3]arr[1][4]   | arr[1][5]==arr[1][0] |
				//     1         2        3       4         5     |  1                   |
				//                                                -------------------------
				j++;
				if (j==5)  //
				{ //j가 0이 되면 ＠＠＠＠＠＠＠
					// arr[1][5] ==arr[1][0]
					j=0;            //i= 0, j = 0 1 2 3 4
				}                   //i =1, j =   1 2 3 4 |5 →[1][5] j==5
									//i =2, j =     1 2 3 |4 5 →[2][5]    [2][6]  j=5가 되면 j=0, 
			}                       //i =3, j =       1 2 |3 4 5
		                            //i =4, j =         1 |2 3 4 5
									// i<5라서 4까지, j는 계속 커짐. j++이라서  
		}


		//전체 요소 출력
		for (int i = 0 ;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

		/*
		int [][] arr = new int[5][5];
		int n=1;
		
		for (int i=0;i<arr.length ;i++ ) //0층 ~ 5층
		{
			for (int j = 0;j<arr[i].length ;j++ ) // [00][01][02][03][04]
			{
				arr[i][j] =n;
				n++;
				if (j==0)
				{
					
				}
			
			}
		}
		//배열 출력
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0 ;j<arr[i].length ;j++ )
			{
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}


		/*
		int [][] arr1 = new int [5][5];
		int [][] arr2 = new int [5][5];

		int n;

		for (int i = 0;i<arr1.length ;i++ )
		{
			for (int j = 0;j< arr1[i].length ;j++ )
			{
				arr[i][j] = n;
				n++;
			}

		}

		// x ^ y;
		// y ^ x;
		// x ^ y;
		
		//배열의 배열 구성 
	//	int [][] arr = new int [5][5];
		/*
		[00][01][02][03][04]    
		[10][11][12][13][14]
		[20][21][22][23][24]
		[30][31][32][33][34]
		[40][41][42][43][44]
		*/
		/*
		int n=1;
		
		
		for (int i=0 ;i<arr.length ;i++ )
		{ 
			
			//n = arr[i][4];
			//System.out.println(arr[i][4]); → 0
			for (int j = 0;j<arr[i].length ;j++ )
			{
		s
				arr[i][j] = n;
				n++;
				
				//n = arr[i-1][4];
				
			}
			n -=1;
			//System.out.println(n);
			//n = arr[i-1][4];
		}
		//배열 출력
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0 ;j<arr[i].length ;j++ )
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
				if (arr[i][j]<arr[i][j+1])
				{
					arr[i][j] =n;
					n++;
				}
				else 
				{
					arr[i][j] = arr[i-1][4];
					arr[i][j+1] = n;
					n++;
				}
		
				//arr[i][j] =n;
				//n++;
				//System.out.println(i + " :::: " + arr[i][j]);

			}
		}

		//배열 출력
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0 ;j<arr[i].length ;j++ )
			{
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}
}
*/