/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

// �ݺ���(for ��) �ǽ�
//���� for��(�ݺ����� ��ø)�� Ȱ���� ����� �ǽ�

//�� ����
//   ������ ���� ������ ��µ� �� �ֵ���
//   �ݺ����� ��ø ������ �ۼ��Ͽ� ���α׷��� �����Ѵ�.

/* ���� ��)  

    *
   ***
  *****
 *******
*********
*/

// 1. 9�ڸ��� 
// 2. ���ǰ��� :ln == 1 , *���� 1�� 
//              ln == 2 , *���� 3��
//              ln == 3 , *���� 5��

//��, ln =k, *���� 2k -1 
// 3. ������ ����
// ln == 1 �� ���� 4�� ln - b = ����
// ln == 2 �� ���� 3��
// ln == 3 �� ���� 2��
// ln == 4 �� 
// 

//��, ln = k , ���� -k +5
// �������� �Ϲ��� : A�� �����ϴ� ����(����, ����Ƽ�ƴ�) A*n +B, B�� ������ ���� ���

// ln = k ��° ��
// * = s
// ���� = b

// 2k -1 = s
// k = (s + 1) /2 

// -k + 5 = b
// k = -b + 5
// (b=1, b<=5, b++)


public class Test064
{
	public static void main(String[] args)
	{
		int k=0; //-- ���� �ݺ��� ��������
		int b; // ���� 
		int s; // �� 
		int l; // ���ڰ��� ���� ��������

//��� ��. 9�ڸ� �ڸ����� ����� �� �ֱ�. + �ڿ� ������ ���� ��.
// ����!!!!!!!!!!

		for (k=1; k<=5; k++)   //�Ʒ� ���ٿ� ���� ������ �ݺ�
		{
			b = 5-k; // �ι�° b = 3 �հ��� ����
			s = 2*k-1; // s = 3 = �� ����

			for (l=1; l<=9; l++)// ���ٿ� ���� ����  (b  s  b), ��ȩ����, ��ȩ�� ����. �� bbbsssbbb �� ����.
			{
				if (l<=b) 
				{
					System.out.print(" ");
				}
				else if (l<=b+s)
				{
					System.out.print("*");
				}
				
			}
			System.out.println();

		}

	}
}
/*
���� ���

    *
   ***
  *****
 *******
*********
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/



//��� ��. 9�ڸ� �ڸ����� ����� �� �ֱ�.
/*
public class Test064
{
	public static void main(String[] args)
	{
		int k=0; //-- ���� �ݺ��� ��������
		int b; // ���� �ݺ��� ��������
		int s; // �� �ݺ��� ��������
		int l; // ���ڰ��� ����

//1 for ���� 2 for ����-> 

		for (k=1; k<=5; k++)   //�Ʒ� ���ٿ� ���� ������ �ݺ�
		{
			b = 5-k; // �ι�° b = 3 �հ��� ����
			s = 2*k-1; // s = 3 = �� ����

			for (l=1; l<=9; l++)// ���ٿ� ���� ����  (b  s  b), ��ȩ����, ��ȩ�� ����. �� bbbsssbbb �� ����.
			{
				if (l <= b)  //������ ����
				{
					System.out.print(" ");
				}
				else 
					if (l <= b+s)
					{
					System.out.print("*");
					}
					else if (l <=b+s+b)
					{
						System.out.print(" ");
					}
				
			}
			System.out.println();

		}

	}
}
*/

/*
����� . ������

    *
   ***
  *****
 *******
*********
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

//���� 4,3,2,1,0 ����  
//�� 1,3,5,7,9 ����



/*
public class Test064
{
	public static void main(String[] args)
	{
		int ln; // ���� �ݺ��� ��������
		int b; // ���� �ݺ��� ��������
		       // ������� ����� ����.
		int s; // ����� ���� �����ϴ� �������� 1,3,5,7,9...

		for (ln =1 ;ln <= 5 ;ln++ )
		{
			for (b = 5 ;b>=0 ;b-- )		
										//���� 4��
										// ln =1 ,b= 4 , ln - b = -3	" "
										// ln =1 ,b= 3 , ln - b = -2    " " 
										// ln =1 ,b= 2 , ln - b = -1    " "
										// ln =1 ,b= 1 , ln - b = 0     " "
										// ln =1 ,b= 0 , ln - b = 1      *


										//����3��
										//  ln =2 ,b= 4 , ln - b = -2	" "
										//  ln =2 ,b= 3 , ln - b = -1	" "
										//  ln =2 ,b= 2 , ln - b = 0    " "
										//  ln =2 ,b= 1 , ln - b = 1     *

										 //ln = 1 ,s = 9 ln - s = -8        
										 //ln = 1, s = 7 ln - s = -6
										 //ln = 1, s = 5 ln - s = -4
										 //ln = 1, s = 3 ln - s = -2
										 //ln = 1, s = 1 ln - s = -0

						
										
			{
				if (ln - b <0)              //-3,-2,-1,0 �� 4�� ����.
				{
					System.out.print("�� ");
				}
				else 
				{
					for (s= 9 ;s >=1 ;s -=2 )
					{
						if (ln - s <=0)
						{
							System.out.println("*");// �� 1,3,5,7,9�� ���.
						}
					}
				}
			}
			System.out.println();
		}
	}
}
*/
												

/**public class Test064
{
	public static void main(String[] args)
	{


		int k; //-- ���� �ݺ��� ��������
		int b; // ���� �ݺ��� ��������
		int s; // �� �ݺ��� ��������

		for (������)
		{
			for (9�ڸ� ���ڿ� ���� ����.) //_ _ _ _ _ _ _ _ _(b s b)
			{
				if (�հ�������)
				{
					System.out.print(" ");
				}
				else 
					if (������)
					{
					System.out.print("*");
					}
					else if(�ڰ�������)
						System.out.print(" ");
				
			}
			System.out.println();

		}

	}
}
**/




/***
public class Test064
{
	public static void main(String[] args)
	{


		int k; //-- ���� �ݺ��� ��������
		int b; // ���� �ݺ��� ��������
		int s; // �� �ݺ��� ��������

		for (k=1;k<=5;k++)
		{
			for (b=4;b>=0;b--) //ù 1 b = 4,3,2,1,0  �� 4,3,2,1 �� ����  " " 0 �̸� *

							   //2��  b = 4,3,2,1,0
			{
				if (k-b<0) 
				{
					System.out.print(" ");
				}
				else // ln - b =0
					if (k - b>=0)
					{
					System.out.print("*");
					}
					else
						System.out.print(" ");
			}
			System.out.println();

		}

	}
}
***/

/****
public class Test064
{
	public static void main(String[] args)
	{


		int k; //-- ���� �ݺ��� ��������
		int b; // ���� �ݺ��� ��������
		int s; // �� �ݺ��� ��������

		for (ln=1;ln<=5 ;ln++ )
		{
			for (b=1;b>=0 ;b++ )
			{
				if (ln-b<0)
				{
					System.out.print(" ");
				}
				else 
					if (ln -b >=0)
					{
					System.out.print("*");
					}
					else
						System.out.print(" ");
				
			}
			System.out.println();

		}

	}
}
****/