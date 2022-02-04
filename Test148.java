/*=====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================*/

//Random Ŭ����

/*
�� java.util.Random Ŭ������
   
   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵
   ������ �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ���
   �߰����� ������ �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.

��� ���� : �����ε�, �������̵� ������
���� : �ζ� ��ȣ 

*/
// �ζ� ��ȣ ������(���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 
// 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 3   5 12 24 31 41
// 1   2  8 36 41 42
// 4   9 11 13 22 30
// 5  10 13 15 27 40
// 22 31 32 33 40 41
/*
�����ؼ� ����ϱ�
���� ������ 1~45
*/

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int [] num;
	
	// ������
	Lotto()
	{
		num = new int[6];
	}

	// getter
	punlic int [] getNum()
	{
		return num;
	}


	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{ 
		Random rd = new Random();
		int n;
		int cnt =0;

		jump: 

		while (cnt<6)		// 0    1    2    3    4    5
		{
			n = rd.nextInt(45)+1; // 1 ~ 45			//����1. 10, ����2. 10

			for (int i =0 ;i<cnt ;i++ )	//cnt�� 0�� ��, ���� ����  //���� ������ �ߺ��� �� �Ÿ���.
			                            //�ߺ��� �Ÿ����� ���� ���� ���� �ִ��� �ϳ��ϳ� Ȯ���ؾ���.
			{
				if (num[i]==n) //num[0]�� �� ����1.10 ��. n�� �� ����2. 10��.
				{
					continue jump; //�޺κ� num[cnt++] = n; �̰� �����ϰ� jump�� ��.
				}
			}
			num[cnt++] = n;		//num[0] num[1] num[2] num[3] num[4] num[5]
		}	//���� �ܰ迡�� cnt++���� ��.
	}//strat() end





	private void sorting()
	{
		Arrays.sort(num);//api��ť��Ʈ �� ã�ƺ��� ^��^
	}//sorting() end

}





public class Test148
{
	public static void main(String[] args)
	{
		// Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5����
		for (int i = 1;i<=5 ;i++ )
		{
			// �ζ� ���� ����
			lotto.start();

			//��� ���
			for (int n :lotto.getNum())
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
	}
}







































































/*
	//�ֿ� ���� ����
	int [] num = new int [6]; 


	//���� �߻��ϱ�
	public void game()
	{
		//Random Ŭ���� ��� �ν��Ͻ� ����.
		Random rd = new Random();
		for (int i = 1;i<num.length ;i++ )
		{
			num[i] = rd.nextInt(44)+1; //-- 0 ~ 44 �̶� 1 ~ 45�� ���� ,1 ~ 45 �� �ϳ� ���� �߻�.
			sorting(i,i+1);
		}
	}//nansu() end

	

	// �ڸ� �ٲٱ�
	private void change(int i, int j)
	{
		int temp;
		temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}//change() end


	//�����ϱ�(��������)
	private void sorting(int i, int j)
	{
		boolean flag = false;
		int pass =0;
		//���� ���� ����
		do
		{
			flag = false; //-- ���� �߻� X
			pass++;
			for (int k = 0;k<num.length-pass ;k++ )
			{
				if (num[k] > num[k+1])
				{
					change(k,k+1);
					flag = true;
				}
			}
		}
		while (flag = true);
	}//sorting() end



	//��� ���
	public void print()
	{
		for (int n:num)
			System.out.printf("%3d",n);
		System.out.println();
	}//print() end
}






public class Test148
{
	public static void main(String[] args)
	{
		//Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5 ����
		for (int i =1;i<=5 ;i++ )
		{
			//�ζ� ���� ����
			lotto.game();
			//��� ���
			lotto.print();
		}
		
	}
}
*/