 /*===============================================
				���� ����޷¡���
================================================*/ 

// ������ ���� ����� ���α׷��� �����Ѵ�.

// ���� ��)
// ���������� �Է��ϼ��� : 2020
// �������� �Է��ϼ��� : 6

/*
       [2020�� 6��]

   �� �� ȭ �� �� �� ��
   ====================
             1  2  3  4
   5  6  7  8  9  10 11
   12 13 14 15 16 17 18
   19 20 21 ....

   ����Ϸ��� �ƹ� Ű�� ...
*/
import java.util.Scanner;
import java.io.IOException;


public class Test107
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);

		int y; //-- ����ڰ� �Է��� ���� ��� ����.
		int m; //-- ����ڰ� �Է��� �� ��� ����.
		int lastW; // -- ���޿� ������ ����
		char startW='g'; //--���ۿ��� ����.
		           
		

		//��������� �Է� �ޱ�
		System.out.print("���������� �Է��ϼ��� : ");
		y = sc.nextInt();
		System.out.print("�������� �Է��ϼ��� : ");
		m = sc.nextInt();


		//������ �迭�� ����.
		char [] wArr = {'��','��','ȭ','��','��','��','��'};
		                //0    1     2    3    4    5    6

		//1�� 1�� 1�� ������ 
		//1�� 1�� 2�� ȭ���� 
		//1�� 1��31���� 31%7 = ������.
		//1�� 2�� 1���� ����� ( ������ + 1��)

		//1���� ���۳�¥ ���� �Ѵ��� ��¥�ϼ����� �迭�� ���
		//��������� ���� ���ϱ�.
		//�׸��� ������ ���� �˾ƿ�.
		// �Է��� 2022�� 6���� ������
		// 2022�� 5��31���� ����, 6���� �ϼ�
		// ���� ���Ϻ��� 6�� �ϼ���ŭ �迭�� ���.
		// �׷��ʿ䰡 �ֳ�? �� m - 1�ϸ� �����ε�
		// �� �ִ�. 

		//���⵵���� ���� ���ϰ� (���� ��� ���)
		int [] months = {31,0,31,30,31,30,31,31,30,31,30,31};
		//               1��	~~~~~~~~~~~~~~~~~~~~~~  12��
		if (y % 4 ==0 && y % 100 !=0 || y % 400 == 0)
		{
			//System.out.println("����");
			//�����̸� 2���� 29��
			months[1] = 29;
		}
		else 
			//System.out.println("���");
			//����̸� 2���� 28��.
			months[1] = 28;

		int nalsu =0; // ���⵵ + �������� ���� ������.
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;


		//���� ������������ ���� ���ؼ�
		for (int i =0;i<m-1 ;i++ ) 
			// �Է��� 4���� �޾����� 3�������� ���ؾߵ�.
			// 3���� months[2]
		{
			nalsu += months[i];
			
		}
		//�׽�Ʈ!
		//System.out.println("���⵵ + ���������� ���� : " + nalsu);
		//���� ���ϰ�
		lastW =nalsu % 7;
		//System.out.println("�������� ���� : " + lastW+1);
		//System.out.println("�Է´� ���� ���� : " + wArr[lastW +1]);


		//�� ���� + 1���� �ش���� �����ؼ�
		startW = wArr[lastW + 1];
		//System.out.println("�Է´� ���� ���� : " + startW);
		//System.out.println("�������� ���� : " + nalsu%7);
		// 2022.5.31�� ���� �� ȭ���� ����
		// nalsu % 7 == 1 �� ������

	   

		// �Ѵ� �׸� �迭 5 * 7
		/*
		[][][][][][][] �� i�� 0�϶�, j�� startW
		[][][][][][][] �� i�� 1�϶�, j�� 0~6����.
		[][][][][][][]
		[][][][][][][]
		[][][][][][][]

		*/

		int sit = 1; //�ڸ��� 1������ 7����
		int ln = 1; //���� �ִ� 6����.
		// _ _ _ _ _ _ _
		//  ���� ���� lastW +1 => ���� ������ ���͸� 3
		int b = 0; //����
		
		//ù���� sit == lastW + 1
		int n =1;
		// n���� ���
		// n++;
		
		//2022�� 1�� ���ۿ���
		//System.out.println(lastW + 1); //6��.

		System.out.printf("\n       [%4d�� %2d��]"     ,y,m);
		System.out.println();
		
		for (int k = 0;k < wArr.length ;k++ )
		{
			System.out.printf("%3c" , wArr[k]);
		}
		System.out.println();
		System.out.println("==============================");
		for (ln=1;ln<=6 ;ln++ )
		{

			if (ln ==1) //ù��.
			{
				
				
				for (sit =1;sit<=7 ;sit++ )
				{
					if (sit < lastW + 1)
					{
						System.out.printf("    ");
						// �� ���� ��ĭ���� ����
						// ���ظ��� �ٵ� ���� �ȿ� �ѱ۳־
						// �� Ȯ���ض� ����ó�� ������������

					}
					else 
					{
						System.out.printf("%4d",n);
						n++;
					}
					
				}
			}
			else // 2�ֺ��� 6�ֱ���.
			{
			    for (sit=1;sit<=7 ;sit++ )
			    {
					if (n<=months[m-1])
					{
						System.out.printf("%4d",n);
						n++;

					}
					



			    }
				
			}
			
			System.out.println();
		}
		/* �迭�ƴ�~ �迭�� ����ȵ� 0���� ä��!
		int [][] monArr = new int[6][7];
		int n=1; // 1���� months[m-1]���� ä���.
		int i;
		int j;
		for (i = 0;i<monArr.length ;i++ )
		{
			if (i ==0)
			{
				for (j = lastW +1 ;j<monArr[i].length;j++ )
				{
					monArr[0][j] = n;
					n++;
					if (n >months[m-1])
					{
						monArr[i][j] = 0;
					}

				}
			}
			else 
			    for (j = 0;j<monArr[i].length ;j++ )
			    {
				  monArr[i][j] = n;
				  n++;
				  if (n >months[m-1])
					{
						monArr[i][j] = 0;
					}
				
			    }
			

			//if (n <1 || n>months[m-1])
			//{
				//monArr[i][j] = ' ';
			//}
		}
		*/
		
			
		
		




		//���.
		/*

		System.out.printf("       [%4d�� %4d��]"     ,y,m);
		System.out.println();


		for (int k = 0;k < wArr.length ;k++ )
		{
			System.out.printf("%3c" , wArr[k]);
		}
		System.out.println();
		System.out.println("==============================");

		for (int k =0;k<monArr.length ;k++ )
		{
			
			for (int h =0;h<monArr[k].length ;h++ )
			{
				
				System.out.printf("%4d",monArr[k][h]);

			}
			System.out.println();
			

		}
		System.out.println("==============================");
		
		
		*/

		
	}
}

/*
���������� �Է��ϼ��� : 2022
�������� �Է��ϼ��� : 1

       [2022��  1��]
  ��  ��  ȭ  ��  ��  ��  ��
==============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/