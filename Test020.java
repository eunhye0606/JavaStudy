/*==============================================
�����ڹ��� ���� �� Ư¡ ����

// �ڹ��� �⺻ ����� : java.util.Scanner

//�� java.util.Scanner
//	 �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//   ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//   �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
//   �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.
=============================================*/


import java.util.Scanner;
//java.util.Scanner sc = new java.util.Scanner(System.in);
//�̶�� �Ź� ���°ŵ� ������ ��.

public class Test020
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);

		String name;
		int k, e, m;
		int sum;


		// ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�̸� ���� ���� ���� �Է� (���� ����) : ");
		
		// - ����ڰ� �Է��� �����͸� �� ������ �� ���� ��Ƴ���
		name = sc.next();
		k = sc.nextInt();
		e = sc.nextInt();
		m = sc.nextInt();


		// - ���� ����

		sum = k + e + m;

		// ��� ���

		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + sum);
		/*
		(1). �����̽� �����ص� ���� �ϳ��� ����
		(2). ���͵� �������� ����
		(3). name,k,e,m�ε� �ϳ� �����ϸ� �翬�� �ȳѾ
		(4). ������ m �ڷ� ������.
		*/

	}
}

/*
�̸� ���� ���� ���� �Է� (���� ����) : eh 80 90 40

>> �̸� : eh
>> ���� : 210
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/