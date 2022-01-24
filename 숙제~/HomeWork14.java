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

public class HomeWork14
{
	public static void main(String[] args) throws IOException
	{
		int inwon; // -- �л� ���� ���� ����
		int [][] score; // -- ���� ���� ����
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

		score = new int [inwon][2];
		name = new String [inwon];
	
		for (int i = 0;i<inwon ;i++ )
		{
			System.out.printf("�̸� ���� �Է�(%d, ���� ����) : ",i+1);
			name[i] = sc.next();
			for (int j =0;j<1 ;j++ )
			{
				score[i][j] = sc.nextInt();
				score[i][j+1] = i;
			}
			

		}
		System.out.println();


		for (int i = 0;i<name.length ;i++ )
		{
			System.out.printf("�̸� : %s\n", name[i]);

		}
		
/*
���� 80
���� 100
�ں� 90
�߻� 10

[80] 0]
 [100] [1]
 90 2
 10 3]

[100] [1]
[90] [2]
[80] [0]
[10] [3]
*/
/*
name = ���� ���� �ں� �߻�
score = 80 100 90 10
k =0 ;  1    2   3   4   // -- �й�

score �ٲ��
score[0] = 100 
k[0] = 2
name[k[0]-1]
*/
		
		
		for (int i = 0;i<score.length-1 ;i++ )
		{
			if (score[i][0] < score[i+1][0])
				{
					//�ڸ��ٲٱ�
					score[i][0] = score[i][0]^score[i+1][0];
					score[i+1][0] = score[i+1][0]^score[i][0];
					score[i][0] = score[i][0]^score[i+1][0];
					
					score[i][1] = score[i][1]^score[i+1][1];
					score[i+1][1] = score[i+1][1]^score[i][1];
					score[i][1] = score[i][1]^score[i+1][1];

					System.out.println("��������!");

				}
		}
		System.out.println("������������ ���ĵ� ������!");
		for (int i =0 ;i<inwon ;i++ )
		{
			System.out.printf("���� : %4d" , score[i][0]); //-- ����
			System.out.printf("�̸� : %s\n" , name[(score[i][1])]);
		}
			/*
			for (int j = 0;j <=1 ;j++ )
			{
				System.out.printf("%4d",score[i][0]);
				System.out.print("������ �Ƕ� :" + name[(score[i][1]]);
			}
			System.out.println();
			*/
	}
}

		
		
