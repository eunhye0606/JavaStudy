/*=====================================
		    ���� �迭 ����
======================================*/

// �迭�� ����� �ʱ�ȭ
// �迭�� �⺻�� Ȱ��

// ��char�� �ڷ����� �迭�� �����
// �� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
// ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���Ѵ�.

// ���� �� )
// A B C D E F G H I ... W X Y Z
// ����Ϸ��� �ƹ� Ű�� ��������...


public class Test083
{
	public static void main(String[] args)
	{
		// ���� ���ĺ� �빮�� �迭 ����
		// ��� �� 
		char[] arr1;
		arr1 = new char[26];
		arr1[0] = 'A';
		arr1[1] = 'B';
		arr1[2] = 'C';
		arr1[3] = 'D';
		arr1[4] = 'E';
		arr1[5] = 'F';
		arr1[6] = 'G';
		arr1[7] = 'H';
		arr1[8] = 'I';
		arr1[9] = 'J';
		arr1[10] = 'K';
		arr1[11] = 'L';
		arr1[12] = 'M';
		arr1[13] = 'N';
		arr1[14] = 'O';
		arr1[15] = 'P';
		arr1[16] = 'Q';
		arr1[17] = 'R';
		arr1[18] = 'S';
		arr1[19] = 'T';
		arr1[20] = 'U';
		arr1[21] = 'V';
		arr1[22] = 'W';
		arr1[23] = 'X';
		arr1[24] = 'Y';
		arr1[25] = 'Z';

		// ��� ��
		char[] arr2 = {'A' , 'B', 'C' , 'D', 'F' , 'G', 'H' , 'I', 'J' , 'K', 'L' , 'M', 'N' , 'O', 'P' , 'Q', 'R' , 'S', 'T' , 'U', 'V' , 'W', 'X', 'Y' , 'Z'};


		
		// ��� �� �ݺ��� �ȿ� ���� 1�� �ƴ�. ������ ����.check~!!
		char [] arr3 = new char[26];
		for (int i = 0, ch = 65;i < arr3.length ;i++,ch++ )
		{
			arr3[i] = (char)ch;
		}


		for (int i=0; i<arr3.length ;i++ )
		{
			System.out.printf("%2c",arr3[i]);
		}
		System.out.println();
		
		/*
		 A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/


		/*
		int[] arr3;
		arr3 = new int[26];

		for (int y=0;y<arr3.length ;y++ )
		{ 
			for (int x= 65;x<=90;x++)
			{
				System.out.print(arr3[y] = x + " ");
			}

		}
		*/

	}
}


		// �迭 ��� ��ü ���
	

/*
public class Test083
{
	public static void main(String[] args)
	{
		// �迭�� ä��� ����.
		char [] arr = { 'A' , 'B', 'C' , 'D', 'F' , 'G', 'H' , 'I', 'J' , 'K', 'L' , 'M', 'N' , 'O', 'P' , 'Q', 'R' , 'S', 'T' , 'U', 'V' , 'W', 'X', 'Y' , 'Z'};

		


		// �迭 ��� ����
		for (int i=0; i<arr.length ;i++ )
		{
			System.out.printf("%2c",arr[i]);
		}
		System.out.println();
		
	}
}
*/

/*
������

 A B C D F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/