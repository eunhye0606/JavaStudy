/*=====================================
		    ���� �迭 ����
======================================*/

// �迭�� �迭(2���� �迭)

// ���� ��)
/*
   1   2   3   4   5  i=0
   2   3   4   5   6  i=1
   3   4   5   6   7  i=2
   4   5   6   7   8  i=3
   5   6   7   8   9  i=4

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
public class Test089
{
	public static void main(String[] args)

	{
		//�迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];

		int n;

		for (int i =0;i<arr.length ;i++ )		//������   ��
		{
			n = 1+i; //check~!!!!!!
			for (int j=0;j<arr[i].length ;j++ ) //������ �繫��
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

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


/*
public class Test089
{
	public static void main(String[] args)

	{
		//�迭�� �迭 ���� �� �޸� �Ҵ�
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

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/