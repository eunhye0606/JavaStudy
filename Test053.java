/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

//�ݺ���(while ��) �ǽ�

//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�.

// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿ܿ� � ���ε� ������ �������� �ʴ� ��.
//		     ��, 1 �� �Ҽ� �ƴ�.

//���� ��)
//������ ���� �Է� : 10
//10 �� �Ҽ� �ƴ�
//����Ϸ���.........

//������ ���� �Է� : 11
// 11 �� �Ҽ�
//����Ϸ��� ....

//hint!
//������ ���� �Է� : 967
//1~ �Է��� �������� ��������
//������ �� 1���� �Ǻ�
//������ �� �Ҽ��ƴ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


		int num; //�����
		int n = 1; // �ʱⰪ.
		int mul = 1; //������
		
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());


		while (n < num-1)
		{
			n++;
			if (num % n == 0) //n�� 2���� ��������.
			{
				System.out.println("�Ҽ��ƴ�.");
				return;
			}
			else 
				mul *= 1;
				//System.out.println("#@");
		}
		if (num < 0)
		{
			System.out.println("������");
		}
		else if (num == 0)
		{
			System.out.println("����");
		}
		else if (num == 1)
		{
			System.out.println("1��.");
		}
		else if (mul != 0)
		{
			System.out.println("�Ҽ���");
		}
		else 
			System.out.println("���� ^^");
	}
}


/*		if (mul == 0)
		{
			System.out.println("�Ҽ��ƴ�");
		}
		else 
			System.out.println("�Ҽ���");
*/
				
				//mul == 0 �� �Ҽ��ƴ�.
			
		//System.out.println("�Ҽ��ƴ� �ֳĸ� 1�̴ϱ�");
	






// �� return�ϱ�
/*
		System.out.print("������ ���� �Է� : ");
		

		int n = 2;
		int num;
		num = Integer.parseInt(br.readLine());

		while (n < num)
		{
			if (num % n == 0 )
			{
				System.out.println("�Ҽ��ƴ�");
				return;			//ũ��������,...
			}
			else if (num % n != 0)
			{
				n++;
			}
			else
				System.out.println("���ƾƾƾƾ�");

		}
		if (num < 0)
		{
			System.out.println("������");
		}
		else if (num == 0)
		{
			System.out.println("����");
		}
		else if (num == 1)
		{
			System.out.println("1��.");
		}
		else if (num % 1 ==0 || num % num ==0)
		{
			System.out.println("�Ҽ���");
		}
		else 
			System.out.println("���� ^^");
	}
}
		
*/

//�� ��� 1. �μ����� �ø���
/*

		int num; //����� �Է� ����
		int n =1; // ������ �� ��� �����Ұ���.

		int sum = 0; //������ . 
		
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		//�Ҽ��� �Ҽ��ƴ� ����
		// �������� �ֳ� ����.

		

		while (n <= num ) //1~(num)
		{
			if(num % n != 0)
			{
				sum += 0;
				//System.out.println(" ���� ??????? : " + sum);
				
			}
			else if (num % n == 0) //9�� 3���� ����.
			{
				sum +=1;
				//System.out.println(" ���� ??????? : " + sum);		//1�� �μ� ���� : 1�� sum �� 1
																//3, 5, 7 ... ���� �ҼҴ� sum 2`
			}
			else 
				System.out.println("�ش� ����.");
		 n++;
		}
		


		if (sum == 2) //�μ��� ����(�Ҽ��� ���� :�μ��� ������ 2: �ڱ��ڽŰ� 1) �� �μ��� ������ 2�ΰ� == sum �� 2�ΰ�
		{
			System.out.println("�Ҽ���.");
		}
		else if (num <0)
		{
			System.out.println("������.");
		}
		else if (num == 0)
		{
			System.out.println("����");
		}
		else if (sum != 2) //num�� ���� �� �ִ� num���� ���� �μ� >=2�� ������ 0�� �ƴϸ�. �Ҽ� �ƴ�. �ֳ�? �ؿ� ����
		{
			System.out.println("�Ҽ��ƴ�.");
		}
		//System.out.println("");
				
	}
}
*/
/*
// num �� 7
																	// 7 % 2 �� 1	9 % 2 �� 1 
																	// 7 % 3 �� 1   9 % 3 �� 0
																	// 7 % 4 �� 3   9 % 4 �� 1
																	// 7 % 5 �� 2   9 % 5 �� 4
																	// 7 % 6 �� 1   9 % 6 �� 3
																	// 7 % 7 �� 0   9 % 7 �� 2
																			      //9 % 8 �� 1
																	              //9 % 9 �� 0
*/