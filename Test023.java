/*==============================================
���Ῥ����(Operator)����

// ��� ������
//BufferedReader
//printf()

//����ڷκ��� ������ ������ �� �� �Է¹޾� (���ڸ��ƴϿ�����)
//��Ģ���� �� ������ ������ �����Ͽ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, �Է¹޴� ������ BufferedReader �� Ȱ���� �� �ֵ��� �ϰ�
//����ϴ� ������ printf()�޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
//����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10 
// �� ��° ���� �Է� : 2

// ====[���]====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
// ==============
//����Ϸ��� �ƹ� Ű�� ��������....
=============================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;


public class Test023
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//                  ------------------
		//                  �̷� ��ġ�� ������ 
		//                   new!
		Scanner sc = new Scanner(System.in);

		int n1,n2;		//�Է¹޴� ���� 2�� ���� ���� ����
		int a, b, c, d, e;		//��Ģ���� �� ���� ���� ����
		
		System.out.print("ù ��° ���� �Է� : ");		//��������� �Է� �ޱ�1
		n1 = Integer.parseInt(br.readLine());			//br.readLine(); �� ���ڿ���ȯ
														//Integer.parseInt();�� int������ ��ȯ �� ����.

		System.out.print("�� ��° ���� �Է� : ");		//��������� �Է� �ޱ�2
		n2 = Integer.parseInt(br.readLine());

		
		//���ʴ�� ��Ģ���� ��� ��, ������ ����.
		a = n1 + n2;
		b = n1 - n2;
		c = n1 * n2;
		d = n1 / n2;
		e = n1 % n2;

		//��� ���
		System.out.println();
		System.out.println("===[���]===");
		System.out.printf("%d + %d = %d", n1,n2,a);
		System.out.printf("\n%d - %d = %d", n1,n2,b);
		System.out.printf("\n%d * %d = %d" ,n1,n2,c);
		System.out.printf("\n%d / %d = %d", n1,n2,d);
		System.out.printf("\n%d %% %d = %d" , n1,n2,e);
		System.out.println("\n=============");

/*		Scanner sc = new Scanner(System.in);

		int n1,n2;
		int a,b,c,d,e;

		System.out.print("ù ��° ������ �� ��° ������ �Է��Ͻÿ� [���� ����] : ");

		n1 = sc.nextInt();
		n2 = sc.nextInt();

		a = n1 + n2;
		b = n1 - n2;
		c = n1 * n2;
		d = n1 / n2;
		e = n1 % n2;

		//��� ���
		System.out.println();
		System.out.println("===[���]===");
		System.out.printf("%d + %d = %d", n1,n2,a);
		System.out.printf("\n%d - %d = %d", n1,n2,b);
		System.out.printf("\n%d * %d = %d" ,n1,n2,c);
		System.out.printf("\n%d / %d = %d", n1,n2,d);
		System.out.printf("\n%d %% %d = %d" , n1,n2,e);
		System.out.println("\n=============");
*/




	}
}
/*  BufferedReader ���
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

===[���]===
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
=============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/




/* Scanner ���
ù ��° ������ �� ��° ������ �Է��Ͻÿ� [���� ����] : 10 2

===[���]===
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
=============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/