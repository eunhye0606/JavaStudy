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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class HomeWork11
{
	public static void main(String[] args) throws IOException
	{

		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �迭 ���� �� �ʱ�ȭ
		// -- ���� ��� �迭
		char [] weekDay = {'��','��','ȭ','��','��','��','��'}; 

		// -- �� ���� ��� �ִ� ������ ��¥(�� ���� �ִ� ��¥)
		int [] day = {31,28,31,30,31,30,31,31,30,31,30,31};

		// �ֿ� ���� ����
		int y,m; // -- ����ڿ��� ���� ����, ��
		int w; // -- ����ڿ��� ���� ���� ���� ����.

		//����ڿ��� �Է¹ޱ� : ����
		do
		{
			System.out.print(" ���������� �Է��ϼ��� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1); // -- �Է¹��� ������ 1�⺸�� ������ �ٽ� �����

		//����ڿ��� �Է¹ޱ� : ��
		do
		{
			System.out.print(" �������� �Է��ϼ��� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12); // -- �Է¹��� ���� 
		                    // -- 1�� ~ 12���� �ƴϸ�.. �ٽ� �����

		
		// ���� ����ؼ� 2���� 28������ 29������ ���ϱ�
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			day[1] = 29;
		}
		
		int nalsu = 0; // �Է´� -1���� ��ü�ϼ�


		// -- 1. �Է³⵵ -1���� ��ü�ϼ�
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// -- 2. 1�� + �Է� �� -1���� ��ü�ϼ�
		for (int i = 0;i < m-1 ;i++ )
		{
			nalsu += day[i];
		}

		// ����ڰ� �Է��� ���� ���� ���� 

		//���⼭���ʹٽ�.!!!!!!!!!!!!!!!!!!!!

		int userStartWeekDay = nalsu % 7 -1;
		//1 �� �� ..


		//���(�޷� �׸���)
		System.out.println(); 
		System.out.printf("\t[ %d�� %d�� ]\n",y,m);
		System.out.println();

		// -- ���� ���
		for (int i = 0 ;i<weekDay.length ;i++ )
		{
			System.out.printf("%3c",weekDay[i]);
		}
		System.out.println();

		// -- Ư�� ���Ϻ��� 1���� ����� �� �ֵ��� ���� �߻�(����)
		//    �Է� �� : 2022�� 1��. ����� ����. 
		// -- userStartWeekDay == 6
		for (int i =0;i<userStartWeekDay ;i++ )
		{
			System.out.print("��   ");
		}
		System.out.printf("%4d",1);
		

		// -- Ȯ�λ���
		// -- ��¥�� �� ä������ ���� ���ϱ� �ؾ���
		// --2022 4��Ȯ��
		

		
	}
}