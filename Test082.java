/*=====================================
		    ���� �迭 ����
======================================*/

// �迭�� �⺻�� Ȱ��

// ������ �������� ����ִ� �迭�� ���� �����͵� ��
// ¦���� ��Ҹ� ��� ����ϰ�, 3�� ����� ��Ҹ� ��� ����ϴ�
// ���α׷��� �����Ѵ�.

// �迭�� �����ϴ� ������ ���� = 4 7 9 1 3 2 5 6 8

// ���� ��)
// �迭 ��� ��ü ���
// 4 7 9 1 3 2 5 6 8

// ¦�� ������ ���
//4 8 2 6 
//3�� ��� ������ ���
// 9 3 6
//����Ϸ��� �ƹ� Ű�� ��������..

/*
public class Test082
{
	public static void main(String[] args)
	{


		//�迭 ����
		int [] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};

		// �� ���� ���ϴ� �޼ҵ�.
		System.out.println(arr.length);
		//�� �迭 arr �� ����(���� ����) Ȯ��.
		//   : arr.length
		// 9
		// �ε��� = arr.length - 1��


		//��ü���
		System.out.println("�迭 ��� ��ü ���");
		for (int i =0;i<arr.length ;i++ )
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();

	}
}
*/

public class Test082
{
	public static void main(String[] args)
	{


		//�迭 ����
		int arr [] = {4, 7, 9, 1, 3, 2, 5, 6, 8};
		
		//��ü���
		System.out.println("�迭 ��� ��ü ���");
		for (int i =0;i<9 ;i++ )
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();

		
		//¦����
		System.out.println("¦�� ������ ���");
		for (int j=0;j<9 ;j++ )
		{
			if (arr[j]%2 ==0)
			{
				
				System.out.print(arr[j]+" ");
			}
		}
		System.out.println();
		

		//Ȧ����
		System.out.println("3�� ��� ������ ���");
		for(int h=0;h<9;h++) 
		{
			if (arr[h]%3 ==0)
			{
				
				System.out.print(arr[h]+" ");
			}
		}
		System.out.println();
	}
}


/*
���� ���
�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8
¦�� ������ ���
4 2 6 8
3�� ��� ������ ���
9 3 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

