/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

// return �ǽ�

// �� return Ű���尡 ���ϴ� �� ���� �ǹ�
//    �� ������ ��ȯ.�� return�� �����ϰ� �ִ� �޼ҵ忡�� 
//       ������ ���� �ΰ� �´�..
//		  return + ������ �� �̷� ����


//    �� ���޼ҵ� ����.�� return�� �����ϰ� �ִ� �޼ҵ� ����.
//        ������ main()�� ���� �� �� ���α׷� ����.
//        return; ����.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test069
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s;

		System.out.print("������ ���� �Է� (10�̻�) : ");
		n= Integer.parseInt(br.readLine());

		if (n<10)
		{
			System.out.println("10 �̻��� ������ �Է��ؾ� �մϴ�.");
			return;
			// -- �޼ҵ� ���� �� ���� ��� main() �޼ҵ� == ���α׷� ����.
		}

		s = 0;

		for (int i=1;i<=n ;i++ )
		{
			s += i;
		}
		System.out.println("��� : " + s);

	}
}