/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

//�ݺ���(while ��) �ǽ�

//1���� 100������ ���� �߿��� 
//¦������ ���� ����Ͽ� ������� ����ϴ� ���α׷��� �����϶�.
// ��, ���ǹ��� ������� �ʵ��� �ϸ�,
// while �ݺ����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// 1���� 100������ ���� �� ¦���� �� : xxxx
// ��� .........


//�� ���� �ν� �� �м�
// 2+ 4+ 6+ 8 + ... + 100
//	- �ʱⰪ : 2
//	- ������ : 2
//  - �Ѱ谪 : 100

public class Test047
{
	public static void main(String[] args)
	{
		int n = 2; // �ʱⰪ
		int sum = 0; //������

		// ���� �� ó�� ( �ݺ� ���� )
		while(n<=100)
		{
			sum += n; //--sum ���� n ��ŭ ����!!!
			n += 2; // -- n ���� 2��ŭ ����!!!

		}
		System.out.println("1���� 100������ ���� �� ¦���� �� : " + sum);
	}
}
/*
1���� 100������ ���� �� ¦���� �� : 2550
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
//==========================================================================
/*		int n, sum;
		boolean evenN;

		n = 2;
		sum = 0;

		while (n++ <= 100)
		{
			n++;
			sum += n;
			//sum = 2,4,6,8,,,,,
			
		}

		System.out.println("1���� 100������ ���� �� ¦���� �� : " + sum);
	}
}
*/