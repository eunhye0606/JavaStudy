 /*===============================================
	  ���� ����(Sort) �˰��� ����
================================================*/ 

// �� ����
//    ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
//    ������ ���� �л����� ���������� ����� �ο��Ͽ�
//    ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.


// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1, ���� ����) : �̾Ƹ� 90
// �̸� ���� �Է�(2, ���� ����) : ������ 80
// �̸� ���� �Է�(3, ���� ����) : ������ 85
// �̸� ���� �Է�(4, ���� ����) : ������ 75
// �̸� ���� �Է�(5, ���� ����) : ��μ� 95

/*
--------------
1�� ��μ� 95
2�� �̾Ƹ� 90
3�� ������ 85
4�� ������ 80
5�� ������ 75
--------------
����Ϸ��� �ƹ� Ű�� ��������...
*/



import java.util.Scanner;
import java.io.IOException;

public class Test112
{
	public static void main(String[] args) throws IOException
	{
		int inwon; // -- �л� ���� ���� ����
		int [] score; // -- ���� ���� ����
		String [] name; // -- �̸� ���� �迭
		






		//Scanner ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�: ");
			inwon = sc.nextInt();
			//System.out.println(inwoon);
		}
		while (inwon<1);

		score = new int [inwon];
		name = new String [inwon];
	

		for (int i = 0;i<inwon ;i++ )
		{
			System.out.printf("�̸� ���� �Է�(%d, ���� ����) : ",i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();

		}
		System.out.println();

		for (int i = 0;i<name.length ;i++ )
		{
			System.out.printf("���� : %2d\t", score[i]);
			System.out.printf("�̸� : %s\n", name[i]);

		}
		System.out.println();

		//������ ���� ��������.
		//�缱������ 
		/*
		90 80 75 85 95
		== --
		90 80 75 85 95
		==    --
		90 80 75 85 95
		==       --
		95 80 75 85 90 
		==          --
		------------------1ȸ��
		95 80 75 85 90 
		   == --
		95 85 75 80 90 
		   ==    --
		95 90 75 80 85
		   ==       --
		-------------------2ȸ��
		.
		.
		.

		*/
		
		/*
		for (int i = 0;i<score.length-1 ;i++ )
		{
			for (int j = i+1;j<score.length ;j++ )
			{
				if (score[i] < score[j])
				{
					//�ڸ��ٲٱ�
					score[i] = score[i]^score[j];
					score[j] = score[j]^score[i];
					score[i] = score[i]^score[j];
					System.out.println("��������!");

				}
			}
		}
		*/

		

		//���������
		/*
		90 80 75 85 95    01     j vs j+1
		== --
		90 80 75 85 95    12
		   == --
		90 80 85 75 95    23
		      == --
		90 80 85 95 75    34     j <4   
		         == --
		----------------1ȸ��    
		90 80 85 95 75    01
		== --
		90 85 80 95 75    12
		   == --
		90 85 95 80 75    23      j<3
		      == --
		----------------2ȸ��
		                  01

						  12      j<2


						  01      j<1
		.
		.


		.
		*/
		/*
		for (int i = 1;i<score.length ;i++ )
		{
			for (int j = 0;j<score.length-i ;j++ ) // 
			{
				if (score[j] < score[j+1])
				{
					//�ڸ��ٲٱ�
					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];
					System.out.println("��������!");
				}

			}
		}
		*/



		//���ĵ� ������ ����� ���Կ�!
		System.out.print("������������ ���ĵ� ������!");
		for (int i = 0;i<score.length ;i++ )
		{
			System.out.printf("%4d",score[i]);
		}
		System.out.println();
	}
}