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
// (2) �� ��° vs �� ��°
// (3) �� ��° vs �� ��°
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