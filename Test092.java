/*=====================================
		    ���� �迭 ����
======================================*/

// �迭�� �迭(2���� �迭)

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
   E   J   O   T   Y
   D   I   N   S   X   
   C   H   M   R   W   
   B   G   L   Q   V   
   A   F   K   P   U     

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
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
		//�迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];

		char start = 'A';

		for (int i=0;i<5 ;i++ )  // i �� 0 1 2 3 4
		{
			for (int j=4;j>=0 ;j-- )   // j �� 4 3 2 1 0
			{
				arr[j][i] = start++;

			}
		}
		//�迭 ���
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
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
public class Test092
{
	public static void main(String[] args)
	{
		//�迭 ����.
		char [][] arr = new char [5][5];

		int n=65;
		// �濡 ���� ���ڵ� �ƽ�Ű�ڵ� 65 ~
		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j=4; j>=0 ;j--,n++) //43210
			{
				arr[j][i] = (char)n;   
				//n++;
				

			}
			//System.out.println(n);
		}

		//�迭 ���
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
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/