/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

//continue �ǽ�

//continue �� Ȱ���Ͽ�
// ������ ���� ��µ� �� �ֵ��� ���α׷��� �����Ѵ�.
// ���� ��)

/*
1 : 1
3 : 4
5 : 9
7 : 16
  :
  :
  :
99: 2500
����Ϸ��� �ƹ� Ű�� ��������....
*/

public class Test068
{
	public static void main(String[] args)
	{
		int n = 0, s= 0;

		while (n<100)
		{
			n++;	
			
			if (n%2 == 0)
			{
				continue;		//�޺κ��� �����ϰ�..
			}
			

			s += n; //�޺κ�
			System.out.printf("%d : %d\n\n ",n,s); //�޺κ� �� �κ��� �����ϸ� ������ �ȱ��ϰ� �ݺ�. 
		}
	}
}
/*
		int n =1;
		int sum = 0;

		for (n=1;n<100 ;n++ )
		{
			if (n % 2 != 0)	//��Ƽ�� �߸���. ���⿣ ���� ��� Ȧ���϶��� ������.
			{	
				sum += n;
				System.out.printf("%d : %d", n, sum);
				System.out.println("\n");
				//continue; �� �Ѵ� ����
			}
			continue; //�� �Ѵ� ����
		}
	}
}
		//1 ~ 100���� �� Ȧ���� ������.
/*
		int n=1; //Ȧ��
		int sum=0; //Ȧ�� ��.

		for (n=1;n<=100 ;n+=2)
		{	
			sum += n;
			System.out.printf("%d : %d", n, sum);
			System.out.println("\n");

		}
		
	}
}
*/

/*

*/
