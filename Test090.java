/*=====================================
		    ���� �迭 ����
======================================*/

// �迭�� �迭(2���� �迭)

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
   1   2   3   4   5   �� arr[0][4]    0������ ���
   5   1   2   3   4   �� arr[1][4]    1������ ���
   4   5   1   2   3   �� arr[2][4]    2������ ���
   3   4   5   1   2   �� arr[3][4]    3������ ���
   2   3   4   5   1   �� arr[4][4]    4������ ���

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*                  0����
   1   2   3   4   5|  
       1   2   3   4|  5 
           1   2   3|  4  5 
               1   2|  3  4  5 
                   1|  2  3  4  5 

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
		[00][01][02][03][04]    
		[10][11][12][13][14]
		[20][21][22][23][24]
		[30][31][32][33][34]
		[40][41][42][43][44]
		1�� �����ϴ°� i = j

		
*/

public class Test090
{
	public static void main(String[] args)
	{
		//�迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];

		
		//System.out.println(arr.length);
		// -->> 5
		for (int i = 0 ;i<arr.length;i++ )   //--5��.
		{
			for (int j=i,n=1; n<=5 ;n++ )    // �������� 00 11 22 33 44 [i][j] 
			{    //����� ���� ������������������ �ƴ�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				//�ٵ� j�� 0�� �Ǵµ� �� for �������� j=i�� arr[1][5] == arr[0][0] �ƴѰ�?
				//                                            _______________________
				//                                             �ƴ�.

				//System.out.print( i + " - " + j+ "	");
				arr[i][j] = n; //1 2 3 4 5   12345 12345 12345 �ݺ�.  //������. ���ְ� j �ø��� �������� ȣ�� �ø���
				//arr[1][0]arr[1][1]arr[1][2]arr[1][3]arr[1][4]   | arr[1][5]==arr[1][0] |
				//     1         2        3       4         5     |  1                   |
				//                                                -------------------------
				j++;
				if (j==5)  //
				{ //j�� 0�� �Ǹ� ��������������
					// arr[1][5] ==arr[1][0]
					j=0;            //i= 0, j = 0 1 2 3 4
				}                   //i =1, j =   1 2 3 4 |5 ��[1][5] j==5
									//i =2, j =     1 2 3 |4 5 ��[2][5]    [2][6]  j=5�� �Ǹ� j=0, 
			}                       //i =3, j =       1 2 |3 4 5
		                            //i =4, j =         1 |2 3 4 5
									// i<5�� 4����, j�� ��� Ŀ��. j++�̶�  
		}


		//��ü ��� ���
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
		
		for (int i=0;i<arr.length ;i++ ) //0�� ~ 5��
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
		//�迭 ���
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
		
		//�迭�� �迭 ���� 
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
			//System.out.println(arr[i][4]); �� 0
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
		//�迭 ���
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

		//�迭 ���
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