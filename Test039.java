/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/
// if ��
//if ~ else �� �ǽ�

// ����ڷκ��� ������ ���� ������ �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 7
// �� ��° ���� �Է� : 70
// �� ��° ���� �Է� : 42

// >> ���� ��� : 7 42 70
// ����Ϸ��� �ƹ� Ű�� �������� .....

// (1) ù ��° vs �� ��°
//		�� ù ��° ���� > �� ��° �������� Ŭ ��� �ڸ� �ٲ�.
// (2) ù ��° vs �� ��°
//		�� ù ��° ���� > �� ��° �������� Ŭ ��� �ڸ� �ٲ�
// (3) �� ��° vs �� ��°
//		�� �� ��° ���� > �� ��° �������� Ŭ ��� �ڸ� �ٲ�.

// 7 vs 70 --> 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test039
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1,n2,n3; //����� �Է� ���� ���ʴ��

		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		n3 = Integer.parseInt(br.readLine());
		//==============================�ڡڡڡڡڡڡڡڡ�===============================

		// ù if ���� �� ��, �ٸ� �� �������� ����? �� if ~ else if ������ ����
		//				     �ڿ��� Ȯ���ؾ� ����   �� �������� if ����
		if (n1>n2)	// (1) ù ��° vs �� ��°
		{
			n1 = n1 ^ n2;
			n2 = n2 ^ n1;
			n1 = n1 ^ n2;
			//n1 > n2 ũ�ٸ� �ڸ��� �ٲ��..
		}
		if (n1>n3)  // (2) ù ��° vs �� ��°
		{
			n1 = n1 ^ n3;
			n3 = n3 ^ n1;
			n1 = n1 ^ n3;//n1 > n3 ũ�ٸ� �ڸ��� �ٲ��...
		}
		if (n2>n3) // (3) �� ��° vs �� ��°
		{
			n2 = n2 ^ n3;
			n3 = n3 ^ n2;
			n2 = n2 ^ n3;//n2 > n3 ũ�ٸ� �ڸ��� �ٲ�� ....
		}
		



		
		
		


		//���� ��� ���
		System.out.printf("\n>> ���� ��� : %d %d %d" , n1, n2, n3);



/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1,n2,n3; //����� �Է� ���� ���ʴ��

		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		n3 = Integer.parseInt(br.readLine());

		int bN,mN,sN; //ū�� �߰� ������
		
		bN = 0; 
		mN = 0; 
		sN = 0; 

		if (n1 >= n2)
		{
			bN = n1;
			mN = n2;
			sN = n3;
			if (mN >= sN)
			{
				sN = n3;
			}
			else 
			{
				mN = n1;
				sN = n2;
			}
		}
		else if (n2 >= n3)
		{
			bN = n2;
			mN = n3;
			sN = n1;
			if (mN >= sN)
			{
				sN = n1;
			}
			else
			{
				mN = n1;
				sN = n3;
			}
		}
		else if (n3 >= n1)
		{
			bN = n3;
			mN = n1;
			sN = n2;
			if (mN >= sN)
			{
				sN = n2;
			}
			else
			{
				mN = n2;
				sN = n1;
			}
		}
		
		else
			System.out.println("�� �� ����.");
	
	System.out.printf("%d %d %d\n",sN,mN,bN);
*/

/*		if (n1 >= n2 && n1 >= n3)
		{
			bN = n1;
			
			if (n2 >= n3)
			{
				mN = n2;
				sN = n3;
				
			}
			else 
			
				mN = n3;
				sN = n2;
			
		}
		else if (n2 >= n3 && n2 >= n1)
		{
			bN = n2;

			if (n3 >= n1)
			{
				mN = n3;
				sN = n1;
			}
			else
				mN = n1;
				sN = n3;

		}
		else if (n3 >= n1 && n3 >= n2)
		{
			bN = n3;

			if (n1 >= n2)
			{
				mN = n1;
				sN = n2;
			}
			else 
				mN = n2;
				sN = n1;

		}
		else 
			System.out.println("�� �� ����.");

		System.out.printf("%d %d %d\n",sN,mN,bN);

*/


/*		boolean b1, b2, b3;

		b1 = n1 >= n2;
		b2 = n2 >= n3;
		b3 = n3 >= n1;

		if (b1) //n2 n1
		{
			if (b3) //n2 n1 n3
			{
				System.out.printf("\n >> ���� ��� : %d %d %d" , n2,n1,n3);
			}
			else
			{
				System.out.printf("\n >> ���� ��� : %d %d %d" , n2,n3,n1);
			}
		}
		else if (b2) //n3 n2
		{
			if (b1) // n3 n2 n1
			{
				System.out.printf("\n >> ���� ��� : %d %d %d" , n3,n2,n1);
			}
			else 
				System.out.printf("\n >> ���� ��� : %d %d %d" , n3,n1,n2);
		}
		else if (b3) //n1 n3
		{
			if (b2) //n1 n3 n2
			{
				System.out.printf("\n >> ���� ��� : %d %d %d" , n1,n3,n2);
			}
			else 
				System.out.printf("\n >> ���� ��� : %d %d %d" , n1,n2,n2);
		}
		else 
			System.out.println("�� �� ����.");
*/

	/*	if (n1 > n2 && n1 > n3)
		{
			if (n2 > n3)
			{
				System.out.printf("\n >> ���� ��� : %d %d %d",n3,n2,n1);
			}
			else if (n2 < n3)
			{
				System.out.printf("\n >> ���� ��� : %d %d %d",n2, n3,n1);
			}
		}
*/
	}
}
/*
ù ��° ���� �Է� : 7
�� ��° ���� �Է� : 70
�� ��° ���� �Է� : 42
7 42 70
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/