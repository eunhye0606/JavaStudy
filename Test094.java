/*=====================================
		    ���� �迭 ����
======================================*/

// �迭�� �迭(2���� �迭)


//�� ����
//   �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//   ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//   �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
A  B  C  D  E
F  G  H  I  J
K  L  M  N  O
P  Q  R  S  T
U  V  W  X  Y

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

public class Test094
{
	public static void main(String[] args)
	{

		//�迭�� �迭�� ����
		char [][] arr = new char [5][5];
		int n = 65; //-- A���� ���ô�
		//�迭�� �� �ֱ�
		//��迭�ȿ��� char �ڷ����� ����
		//��A=65 ~ 
		//[00]~[04] �� [10]~[14] ��[24]~[44] �� [34]~[44] ��[40]~[44]
		
		for (int i =0;i<arr.length ;i++ )
		{
			for (int j =0;j<arr[i].length ;j++ )
			{
				arr[i][j] = (char)n;
				n++;
			}
		}


		//�迭 ��ü ��� ���
		for (int i = 0;i <arr.length ;i++ )
		{
			for (int j =0;j<arr[i].length ;j++ )
			{
				System.out.printf("%4c",arr[i][j]);
			}
			System.out.println();
			
		}
		System.out.println();
	}
}

/*
������

   A   B   C   D   E
   F   G   H   I   J
   K   L   M   N   O
   P   Q   R   S   T
   U   V   W   X   Y

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/