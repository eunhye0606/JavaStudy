/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
   1   2   3   4   10 ← [04]
   5   6   7   8   26 ← [14]
   9  10  11  12   42 ← [24]
  13  14  15  16   58 ← [34]
  28  32  36  40  136 ← [44]
  ↑  ↑  ↑  ↑   ↑   
 [40][41][42][43] [44]
 00   01  02  03   x = 0,1,2,3 y= 0   
 10   11  12  13   x = 0,1,2,3 y= 1
 20   21  22  23   x = 0,1,2,3 y= 2
 30   31  32  33   x = 0,1,2,3 y= 3
 x= 0123
 y=0  1    2   3
  

 
 
   

계속하려면 아무 키나 누르십시오 . . .
*/

public class Test093
{
	public static void main(String[] args)
	{
		int [][] arr = new int[5][5];

		int n=1; //--4 x 4에 순서대로 들어가는 숫자 ~ 
	
		
		for (int i=0;i<arr.length-1 ;i++ )
		{
			for (int j=0;j<arr[i].length-1 ;j++ )  // 4 x 4임 마지막 줄은 누적합
			{
				arr[i][j] = n;
				n++;

				arr[i][arr[i].length-1] += arr[i][j];
				arr[arr.length-1][j] += arr[i][j];
				arr[arr.length-1][arr[i].length-1] += arr[i][j];
				/*
				arr[i][4] += arr[i][j];
				arr[4][j] += arr[i][j];
				arr[4][4] += arr[i][j];
				*/

			}
		}
		//배열 출력
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
public class Test093
{
	public static void main(String[] args)
	{
		int [][] arr = new int[5][5];

		int n=1;//들어갈 숫자. sum1
		int x; //행
		int y; //열
		int sum1=0;// 행 누적합. 04,14,24,34,44
		int sum2=0;// 열 누적합. 40,41,42,43,44
		//System.out.println(arr.length); //5
		
		for (x = 0;x<arr.length-1 ;x++)
		{   
			sum1 =0;

			for (y=0;y<arr[x].length-1 ;y++) // 가로로 3까지 더하는데 왜 
			{  
				//n= 1,2,3,4
				arr[x][y] = n;   // x = 0           0 1 2 3 
				sum1+=n;         //                 [1 2 3 4]
				n++; 
				arr[x][4] = sum1;
				arr[4][4] += arr[x][y];// x =1            0 1 2 3 
				                 //                 [5 6 7 8]
								 //
				
				
				//sum1 -=arr[x][5];
				 
				//arr[0][y] = sum2;
				//n++;
				//sum2 += n;
			    //arr[4][y] =sum2;       //이거를 못해서 밑에 반복문 또 추가한겨
			}
			//System.out.println(sum1);
			//System.out.println(sum2);
			//System.out.println(x);
			//System.out.println(sum1);
			
		}
		for (y=0;y<=3 ;y++ )//0~~~~~~~~~~1~~~~~~~~~2~~~~~~~~~~3
		{
			sum2 =0;
			for (x=0;x<=3 ;x++ )//0123
			{
				sum2+=arr[x][y]; //[00][10][20][30]
				arr[4][y] = sum2;
			}


			//System.out.println(sum2);
		}
		


		




		//배열 출력
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
   1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  28  32  36  40 136
계속하려면 아무 키나 누르십시오 . . .

*/