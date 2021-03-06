/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
   1   8   9    16   17   
   2   7   10   15   18   
   3   6   11   14   19   
   4   5   12   13   20     

계속하려면 아무 키나 누르십시오 . . .
*/

/*
[00][01][02][03][04]    
[10][11][12][13][14]
[20][21][22][23][24]
[30][31][32][33][34]

00 → 10 →20 → 30 → 31 → 21 → 11 → 01 → 02 → 12 → 22 → 32 → 33 → 23 → 13 → 03 → 13....
                 _______           _________

j=0 i ++ i<=3
                 i=3 j+=1 i--
				                  
i증가, j는 i가 3일때 1증가. j가 웅웅이
*/
/*
i = 0             i=1 ★              i=2              i=3 ★             i=4
00 10 20 30       31 21 11 01       02 12 22 32      33 23 13 03      04 14 24 34
j=0123            j=3210            j=0123           j=3210           j=0123

                  
*/
public class Test091
{
	public static void main(String[] args)
	{
		int [][] arr = new int[4][5];
		int n=0;

		for (int i = 0;i<5 ;i++ )  //웅웅 ~~~ 0 1 2 3 4  i가 좌표 뒷자리.
		{
			for (int j=0;j<4 ; j++)  //슝슝 ~~~~ 0123 
				
			{
				n++; //n은 1씩증가.
			    if (i % 2 ==0)
			    {
					
					arr[j][i] = n;  //i == 0,2,4일때.
			    }
				else if (i % 2 !=0) //i ==1,3일때.
				{
					arr[3-j][i] =n;  //[01][11][21][31] → 3-j → [31][21][11][01] check~!!!

				}
				
			}

		}

		//배열의 배열 출력.
		for (int i = 0;i<arr.length ;i++ )
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
실행 결과
   1   8   9  16  17
   2   7  10  15  18
   3   6  11  14  19
   4   5  12  13  20
계속하려면 아무 키나 누르십시오 . . .
*/




/*
public class Test091
{
	public static void main(String[] args)
	{
		int [][] arr = new int[4][5];
		int n=1;

		for (int j=0;j<arr.length+1 ;j++ )
		{
			
			for (int i=0;i<arr.length ;i++ )
			{
				
					
					if (i ==3)
					{
						arr[i][j] = n;
						n++;
					}
			}

		}




		//배열의 배열 출력.
		for (int i = 0;i<arr.length ;i++ )
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
   1   5   9  13  17
   2   6  10  14  18
   3   7  11  15  19
   4   8  12  16  20
계속하려면 아무 키나 누르십시오 . . .
*/