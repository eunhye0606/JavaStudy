/*=====================================
    ���� Ŭ������ �ν��Ͻ� ����
======================================*/

// Ŭ���� ����
// �迭 Ȱ��
// �������������ڿ� ��������


// ����ڷκ��� ��, ��, ���� �Է¹޾�
// �ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
// ��, �޷� Ŭ����(Calendar)�� ������� �ʴ´�.
// ����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�. (��WeekDay Ŭ���� ����)
// �׸���, �迭�� ���䵵 ������Ѽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������� WeekDay Ŭ���� ���踦 ����
// Test101 Ŭ������ main() �޼ҵ尡 ���������� ���α׷� ���� �� �� �ֵ��� �Ѵ�.

// �� 1�� 1�� 1�� �� "������"

// ���� ��)
// �� �� �� �Է� (���� ����) : 2022 1 19
// 2022�� 1�� 19�� �� ������
// ����Ϸ��� �ƹ� Ű��....

// 2000�� 5�� 4�� �� �����
// ����Ϸ��� �ƹ� Ű��....



import java.util.Scanner;
import java.io.IOException;


class WeekDay 
{
	//����ڰ� �Է��� ��¥��� ����
	private int nUserY; //--��
	private int nUserM; //--��
	private int nUserD; //--��

	int days; //-- ����ڰ� �Է��� ��¥�� 1�� 1�� 1�� �������� ��ĥ �귶����.
			  //--����..

	
	//1�� 1�� 1�� �� 0�̶� �����ϸ�
	//1�� 2�� 1�� �� 1.

	//2022�� 8�� 19�� �� (2022 - 1) ������ �� 366 
	                              //����� �� 365
					   //8��      1���� 8�� ���� �� day
					   //+ 19-1��..?
	


	

	//����ڿ��� �Է� �޴� �޼ҵ�
	public void input()
	{
		boolean yoon = true; // �����̸� t, ����̸� f.

		Scanner sc = new Scanner (System.in);
		System.out.print("�� �� �� �Է� (���� ����) : ");
		nUserY = sc.nextInt();
		nUserM = sc.nextInt();
		nUserD = sc.nextInt();

		int sum =0;
		int sum2 =0;
		int sum3 = 0;

		



		// �����Ǻ���
		// 4�� ��� �̸鼭 100�� ����� �ƴϴ�.
		// 400�� ����̴�.
		if (nUserY % 4 == 0 && nUserY % 100 !=0)
		{
			yoon = true;
			//System.out.println(nUserY + "����");
		}
		
		else if (nUserY % 400 ==0)
		{
			yoon = true;
			//System.out.println(nUserY + "����");
		}
		else if (nUserY % 4 != 0)
		{
			yoon = false;
			//System.out.println(nUserY + "���");
		}
		else
			System.out.println(nUserY + "�� �� ����.");

		//1,3,5,7,8,10,12�� �� 31��
		//�����̸� 2�� �� 29��
		//����̸� 2�� �� 28��.

		// 1����� nUserY���� �ݺ��ؼ� ������. ���� �������ϱ�

		
		for (int i = 1;i<=nUserY ; i++)
		{
			if (yoon) //�����̸�
			{
				sum += 366;
			}
			else 
				sum += 365;
		}
		System.out.println(nUserY + "������� �ϼ��� " +sum+"�Դϴ�");


		//int sum2 = 0;
		for (int j = 1 ; j<=nUserM;j++ )
		{
			if (j==2) // 2���̸�
			{
				if (yoon) //2���̰� �����̸�
				
					sum2 += 29;
				
				else
					sum2 += 28; //2���̰� ����̸�
			}
			else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j==10 || j==12)
		
				sum2+=31;
			
			else
				sum2+=30;
			
				
			
		}

		int n = 1;
		System.out.println(nUserM + "�� ������ �ϼ��� " + sum2+"�Դϴ�.");

		//int sum3 = 0;

		for (int k =1;k <=nUserD ;k++ )
		{
			sum3 += n;
		}
		System.out.println(nUserD + "�� ������ �ϼ��� " + sum3+"�Դϴ�.");

		days = sum + sum2 + sum3;
		
		System.out.println( "1�� 1�� 1�Ϻ��� ����ڴ� " + days + "�ϼ��� �������ϴ�");

			
	}

	// ���� �����ϱ�
	public void week()
	{
		int n=1; // n=1��  2    3    4    5    6    7
		char [] w = {'��','ȭ','��','��','��','��','��'};
	//	int [] numW = {1, 2, 3, 4, 5, 6, 7};
		int number=0 ; //�ε����ѹ�

	//	char userW; // ��������
		

		//���ڹ迭�� ���ڹ迭�� ���ٸ� .. ? 
	//	for (int i = 0;i<w.length ;i++ )
	//	{
		//	if (w[i] == num[W])
		//	{
			//	userW = w[i];
			//}
	//	}
		days = 8;
		System.out.println("days :" + days);
		System.out.println("days/7 :"+days/7);
		for (int i = 1;i <=days ;i++ )
		{
			number = days % 7 * i;
			System.out.println("number :"+ number);
			
		}
		
		

	
		System.out.println(days + "���� ������ " + w[number]);
		
	}


	

	
	//1�� 1�� 1�� �� arr[0], ����� �Է� ��arr[arr.length]
	//4 ��� �̰ų� 100�� ��� �ƴ�.
	// 400�� ����̸� ���� �� 366��.

	//����ϴ� �޼ҵ�

}



public class Test101
{
	public static void main(String[] args) throws IOException
	{
		WeekDay ob = new WeekDay();

		ob.input();
		ob.week();
		
		
		
	}
}