/*=====================================
		    ���� �迭 ����
======================================*/

// �迭�� �⺻�� Ȱ��

//�� ����
//   ����ڷκ��� ������ �л� ���� �Է¹ް�
//   �׸�ŭ�� ����(���� ����)�� �Է¹޾�
//   ��ü �л� ������ ��, ���, ������ ���Ͽ�
//   ����� ����ϴ� ���α׷��� �����Ѵ�.
//   ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.


// ���� ��)
// �л� �� �Է� : 5
// 1�� �л��� ���� �Է�: 90
// 2�� �л��� ���� �Է� :82
// 3�� �л��� ���� �Է�: 64
// 4�� �л��� ���� �Է� :98
// 5�� �л��� ���� �Է� :98

// >> �� : 370
// >> ��� : 74.0
// >> ���� :												��� - ǥ��(==�� ������)
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Test086
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ��������� �Է� �ޱ�

		System.out.print("�л� �� �Է� : ");
		int nUser = Integer.parseInt(br.readLine());

		
		//�迭���� �� ��������� �Է¹��� �� ��ŭ�� size
		int arr [] = new int [nUser];



		int n = 0;
		int sum =0; // -- �ջ� ������

		//arr[i] ���� ~  .. . �迭�� �� �ְ�
		//arr[0] == 1���л��� ���� .... . arr[arr.length-1] == arr.length��°�� �л��� ����
		for (int i = 0;i<arr.length ;i++ )
		{
			System.out.printf("%d�� �л��� ���� �Է� : ",(i+1));
			n = Integer.parseInt(br.readLine());
			arr[i] = n;
			sum += n;
			
		}
		
		//System.out.println(sum);
		//System.out.println("�迭�� ���ֱ� Ż��");


		//�迭 ���
	/*
		for (int i = 0;i < arr.length ;i++ )
		{
			System.out.printf("%4d",arr[i]);
		}
		System.out.println();
	*/


		//��,���,���� ����
		//int sum; //--�ջ�

		double avg; //-- ���

		avg = (sum*1.0)/ nUser;

		double d;   // -- ����

		//System.out.println(avg);


		
		//������
		
		System.out.println("\n >> �� : " + sum); //--��
		System.out.printf(" >> ��� : %.1f\n",avg); //--���
		//���� ���ϱ�

		System.out.println(" >> ���� : ");

		for (int i =0;i<arr.length ;i++ )
		{
			d = avg - arr[i];
			System.out.printf("%d : %.1f\n", arr[i],d);
		}
		System.out.println();

	}
}

/*
������
�л� �� �Է� : 5
1�� �л��� ���� �Է� : 90
2�� �л��� ���� �Է� : 82
3�� �л��� ���� �Է� : 64
4�� �л��� ���� �Է� : 98
5�� �л��� ���� �Է� : 98

 >> �� : 432
 >> ��� : 86.4
 >> ���� :
90 : -3.6
82 : 4.4
64 : 22.4
98 : -11.6
98 : -11.6

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/