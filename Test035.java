/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/
//Ȧ��, ¦��, ��
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		//String result;
		String result = "���� �Ұ�";

		if(n == 0)
		{
			result = "��";
		}
		else if (n % 2 == 0)
		{
			result = "¦��";
		}
		else if (n % 2 != 0)
		{
			result = "Ȧ��";
		}
		/*else 
			result = "���� �Ұ�";*/
		
		System.out.println(n + " �� " + result); 
		// �ڹٴ� ��¦Ȧ �ƴ� ��, ��¼���?
		// �����Ͽ����߻�.
		// �ڹٴ� if�������� result�� ä��±���
		// else�� ������ ��¦Ȧ�� �����µ�
		// �������� ����¼��°���?
		//�׷��� ����!!!!!!!!!!1

		//�׷��� else
		//       �ʱ�ȭ


/*		if (n%2==0)
		{
			System.out.print(n + "	�� ¦�� ");
		}
		else if (n%2!=0)
		{
			System.out.print(n + " �� Ȧ�� ");
		}
		else
			System.out.println(n + " �� ��");
/*
������ ���� �Է� : 0
0       �� ¦�� ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
0�� ������ ������ 0�̶�
¦���� �Ǻ���.!
*/

//�� �׷��� 0���� ���� ó���ؾ���
//   ¦���� 0������ n%2 ==0���ǿ� �� ����!

	}
}
// �� ���ǹ��� ������ ������
//    �׻� ������ ���� ������ �����ؾ� �Ѵ�.


// �� if ~ else ������ ��ø ������
//	  �ݵ�� else�� ������ �ϴ� ���� �ƴϴ�.
//	  �ٸ�, ����ؾ� �� ������ ó���ϴ� ��������
//	  ������ �߻����� �ʴ� �������� �ۼ��ؾ� �Ѵ�.


// �� ���ǹ� ���� �������� �̿��� ����(else)��
//    ������ ���Ե� �������� ó���ϴ� ���� �ٶ������� ���� ��찡 �ִ�.
//    �Ұ����� ���� ��¿ �� ������
//    �������̸� ������ ���Ե��� �ʴ� ������
//    �̿��� ����(else)���� ó���� �� �ֵ��� ����.
// ex)�ֹι�ȣ, 010 ��




