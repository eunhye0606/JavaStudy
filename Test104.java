/*=====================================
    ���� Ŭ������ �ν��Ͻ� ����
======================================*/

// Ŭ������ �ν��Ͻ� Ȱ��

// 1 ~ 3 ������ ������ �߻����Ѽ�
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

// �� ���� ������ �� 1: ����, 2: ����, 3: ��

//���� ��)
// 1: ����, 2: ����, 3: �� �� �Է�(1 ~ 3) : 4
// 1: ����, 2: ����, 3: �� �� �Է�(1 ~ 3) : -2
// 1: ����, 2: ����, 3: �� �� �Է�(1 ~ 3) : 2

// -���� : ����
// -��ǻ�� :��

// >> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ� ~!!
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;


class RpsGame
{
	//RpsGame�� ������ ����(�Ӽ�)
	int nUser; //-- ������ �Է��� ��.
	int com; // -- ��ǻ�Ͱ� ���� ��.
	
	//RpsGame�� ������ �޼ҵ�(���)
	
	//1. �Է¹ޱ�(1~3)�� �ϳ�.
	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print(" 1: ����, 2: ����, 3: �� �� �Է�(1 ~ 3) : ");
			nUser = sc.nextInt(); // �Է°��� ������ ����.
		}
		while (nUser<1 || nUser >3); //���� ���̸� �ٽ� �ض�.
	}

	//2. ���������(1~3)�� �ϳ�.
	private void nansu()
	{
		Random rd = new Random(); // ���� �ν��Ͻ� ����.
		//int com;
		com = rd.nextInt(3) + 1; // next(3) �� 0 ~ 2�����ϱ�. +1�ؼ� 1 ~ 3����
		//System.out.println(com);
		//return com;
		System.out.println("���� ��ǻ�� ���� : " +com);


	}
	//3. ����ڰ� (1 ~ 3) �� ��ǻ�ͳ���(1~3)���ϱ�
	private int compare()
	{
		//int com = nansu(); //���� �޼ҵ� ȣ��.
		int result=-1; // ������ �̱�� 1 ���� 0 ���� ����
		if (nUser >com) // user == 3(��), com == 2(�ָ�)
						// user == 3, com == 1(����)
		{
			if (nUser ==3 && com ==1) // ���϶�.
			{
				result = 0;
			}
			else 
				result = 1;
		}
		else if (nUser < com)
		{
			if (nUser == 1 && com == 3) //���� ����!
			{
				result = 1;
			}
			else
				result = 0;
		}
		else if (nUser == com)
		{
			result = 100;
		}

		return result;
	}

	
	//4. ��� ����ϱ�
	public void print()
	{
		nansu();
		// ������ ���´��� ������ߵ�.
		// ���� ���� �� ��� �迭 
		
					  // 0      1     2
                              //1-1
		
		String [] a = {"����","����","��"}; //--���������� �迭.
		//int nUser2 = nUser -1;
		//int com2 = com-1;
		System.out.println(" - ���� : " +a[nUser-1]);
		System.out.println(" - ��ǻ�� : "+a[com-1]);
		//System.out.println("��ǻ�Ͱ� ����:"+com);
		

		int x = compare(); // �񱳸޼ҵ� ȣ��
		if (x ==1)
		{
			System.out.println("������ �¸�~!!");
		}
		else if (x ==0)
		{
			System.out.println("��ǻ�Ͱ� �¸�~!!");
		}
		else if (x ==100)
		{
			System.out.println("�����ϴ� ~!!");
		}
	}

}


public class Test104
{
	public static void main(String[] args) throws IOException
	{
		RpsGame rps = new RpsGame();

		rps.input();
		//rps.nansu();
		rps.print();
	
	}
}