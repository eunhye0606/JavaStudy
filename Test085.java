/*=====================================
		    ���� �迭 ����
======================================*/

// �迭�� �⺻�� Ȱ��

//�� ����
//   ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
//   �Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//   ��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է��� �������� ���� : 12
// ������ �Է� (���� ����) : 74 65 13 91 5 67 33 41 2 50 11 38
// >> ���� ū �� �� 91
// ����Ϸ��� �ƹ� Ű�� ��������...

/*
1.�Է� �ޱ� Scanner�� ���� ����
2. for,if ���Ἥ �ڸ� �ٲٱ�... ū���� �츮�� �츮��~!
*/
import java.util.Scanner;
import java.io.IOException;


public class Test085
{
	public static void main(String[] args) throws IOException
	{
		// Scanner �ν��Ͻ� ����.
		Scanner sc = new Scanner(System.in);

		//����ڿ��� ����.
		System.out.print("�Է��� �������� ���� : ");
		int nUser = sc.nextInt();

		//nUser��ŭ ���ڸ� ���� �迭 ����
		int [] arr = new int[nUser];
		// 0 0 0 0 ...
		// arr[0] arr[1] ....arr[nUser]
		System.out.println(arr.length);

		//nUSer ������ŭ �����͸� �Է¹޵��� ����.
		//System.out.print("������ �Է� (���� ����) : ");
		//System.out.println();


		//�迭�� ���ڳֱ�
		int n=0;
		//do
		//{
			System.out.print("������ �Է� (���� ����) : ");// 1 2 3 4
			
			for (int i =0;i<arr.length ;i++ ) //i<arr.length�� �����ϱ� do ~ while�� �����.
			{
				n = sc.nextInt();
				System.out.println(n);
				arr[i] = n;   //�̹� ���⿡ arr.length������ ����. n ���ٰ� 
				              // �� n�� arr[i]�� ����
			}
			

		//}
		//while (arr.length>nUser); //check point!!!
		


		//�迭 ��� ���� ��ü ��� ���
		for (int i=0;i<arr.length ; i++)
		{
			System.out.printf("%4d",arr[i]); 
		}
		System.out.println();


		//���� ū �� ���ϱ�!

		int max = arr[0];
		for (int i =1;i<arr.length ;i++ )
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
		}

		System.out.println("���� ū �� : " + max);

	}
}
/*
�Է��� �������� ���� : 3
������ �Է� (���� ����) : 4 55 1
   4  55   1
���� ū �� : 55
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/