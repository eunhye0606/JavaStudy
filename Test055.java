/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

// �ݺ���(while ��) �ǽ�

//�� ����
//   ����ڷκ��� ������ ������ �Է¹޾�
//   1���� �Է¹��� �� ����������
//   ��ü �հ�, ¦���� �հ� , Ȧ���� ���� 
//   ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.


// ���� �� )
// ������ ���� �Է� : 280
// 1 ~ 280 ���� ������ �� :
// 1 ~ 280 ���� ¦���� �� :
// 1 ~ 280 ���� Ȧ���� �� :
// ����Ϸ��� .........................
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test055
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ ���� �Է� : ");
		
		int nUser;
		nUser = Integer.parseInt(br.readLine());

		// ������ ��
		int n=1; //--������ �� �������� 
		int nSum=0; //--������ ������ ���� ����
		int evenSum =0; //--¦���� ������ ���� ����
		int oddSum = 0; //--Ȧ���� ������ ���� ����

		while (n<= nUser) //--> �� ������, ¦���� ,Ȧ���� �ѹ���!
		{
			nSum += n; // ���⼭ ���� ������ �ϰ�.
			
			if (n % 2 == 0) // �ٵ� n�� ¦�����?
			{
				evenSum += n; // ¦���������ض�.
			}
			else // ¦���� �ƴ϶�� ? ��, Ȧ�����?
				oddSum += n; // Ȧ�� �������ض�.

			n++; // �ڿ��Ⱑ ����Ʈ! �ֳ��ϸ� n�� �������� ���� ���¿���
			     // ¦��, Ȧ���� �б��ؼ� ���ؾ���
				 // ���ϸ� ¦Ȧ�� ������ 0��.



		}
/* �� ������, (¦����, Ȧ����) ���ε���
		while (n<=nUser)
		{
			nSum += n;
			n++;
		}
		n = 1; //-- ���� while������ n�� nUser���� ������ ����. 
			   // ���� �ٽ� �ʱ�ȭ ����.
		while (n<=nUser)
		{
			if (n % 2 == 0)
			{
				evenSum += n;
				n++;
				System.out.println("¦���� �׽�Ʈ");
			}
			else 
			{
				oddSum += n;
				n++;
			}

		}
	*/
	
	//Ȧ�� �� �˻� �׽�Ʈ.
	/*	int summ = 0;
		for (int i = 1;i<=10 ;i+=2 )
		{
			
			summ += i;
			
		}
		System.out.println(summ);
	*/
	
		System.out.printf("1 ~ %d ������ ������ �� : %d\n", nUser,nSum);
		System.out.printf("1 ~ %d ������ ¦���� �� : %d\n", nUser,evenSum);
		System.out.printf("1 ~ %d ������ Ȧ���� �� : %d\n", nUser,oddSum);


		// ¦���� ��
		// Ȧ���� ��
		
	}
}

/*
������ ���� �Է� : 10
1 ~ 10 ������ ������ �� : 55
1 ~ 10 ������ ¦���� �� : 30
1 ~ 10 ������ Ȧ���� �� : 25
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/