/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

//break �ǽ�
// ������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ 1 ~100 ���� �ȿ�����
// �����ϵ��� �ۼ��Ѵ�.

// ���� ��)
// ������ ���� �Է� : -10

// ������ ���� �Է� : 0

// ������ ���� �Է� : 2022

// ������ ���� �Է� : 10
// >> 1 ~ 10 ������ �� : 55
// ����Ͻðڽ��ϱ�?(Y/N)? : y

// ������ ���� �Է� : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ͻðڽ��ϱ�?(Y/N) : N
// ����Ϸ��� �ƹ� Ű�� �������� ... �� ���α׷� ����.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test067
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, s =0, i;
		// -- n: ����� �Է°��� ���� ����
		// -- s: ������ ���� ����� ��Ƴ� ����
		// -- i: 1 ���� 1�� ������� �Է°����� ������ ����

		char ch;
		// -- ch: ���μ����� ��� �������� ������ ���θ� ��Ƶ� ����
		
		while (true)
		{
			
			do	//���� ���� �Է��� ������ �����ϱ�.
			{
				System.out.print("������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine()); //�Է� ��⿭�� �����ִ� ���͸� �갡 ������.NumberFormatException:
			}
			while (n<1 || n>100);

			s=0;	//--������ ���ϱ� ���� �ʱ�ȭ�ؾߵ�. ���ϸ� ��� ������. check~~~~!

			for (i=1;i<=n ;i++ ) //�Է°����� �������ϱ�.
				s += i;	

			System.out.printf("\n>>1 ~ %d ������ �� : %d\n",n,s);

			System.out.print("����Ͻðڽ��ϱ�?(Y/N) : ");
			ch = (char)System.in.read();	//--readLine()�� ���ڿ��̶� read();
											//  y + ����(\r+\n)

			//�׸��ҷ� �ǻ�ǥ��
			if (ch != 'Y' && ch !='y')			//ch =='N' || ch == 'n' ���ٴ� y�� �ƴϴ�.
			{								//������ �ߺ���!!!

					break;
			}
					//�ݺ��� ���߰� �������� �� �ִ�ó��.
				// ���Ͱ��� �ǻ� ǥ���� �ߴٸ�
				//���尡���ݺ���.
				//check~!! ���缭 ����������.

			System.in.skip(2); //��⿭ ���� ��ŵ�ϱ�!!!
				
		}//while ����
		
	
	}//main����

} //class ����

/*
.NumberFormatException:

Integer.parseInt("kkk") �� char���� ���ٲ�
*/

/*
������ ���� �Է� : 10

>>1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�?(Y/N) : y
������ ���� �Է� : 100

>>1 ~ 100 ������ �� : 5050
����Ͻðڽ��ϱ�?(Y/N) : n
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/





/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int nUser; //--����� �Է� ��.
		int n; //--��������
		int sum = 0; //--������.

		char ch;// ��ӿ� ���� ����� ����.
		
		do
		{
			System.out.print("������ ���� �Է� : ");
			nUser = Integer.parseInt(br.readLine());

		}
		while (nUser < 1 || nUser > 100);

		//System.out.println(nUser);
		do
		{
			for (n = 1;n<=nUser ;n++ )
		{
			sum += n;
		}
		System.out.printf("1 ~ %d ������ �� : %d\n",nUser,sum);

		}
		while(nUser >=1 && nUser <=100);
		//while (ch == 'Y' || ch == 'y');

		
	}

}

/*
������ ���� �Է� : 100
1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


������ ���� �Է� : -1
������ ���� �Է� : 10000
������ ���� �Է� : 0
������ ���� �Է� : 101010101
������ ���� �Է� : -31311
������ ���� �Է� : 10
1 ~ 10 ������ �� : 55
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/