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

public class Test021
{
	public static void main(String[] args)
	{

		//�ֿ� ���� ����
		Scanner sc = new Scanner(System.in);      //sc.next()�Ҷ�� ����. ����Ʈ����.
		
		String name;
		int k, e, m, sum;


		// System.out.println("\"); -->�����Ͽ���
		// �ֳĸ� �ڹٴ� \�̰� ���� �� ~ \s ? \d? �̷��� ����.
		// �׷��� \�̰� ���ڷ� ���� ������ \\�ΰ�~


		//���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(��,������) : ");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");		//�̰ſ��� ���� sc�� ��� �߰�����
																	// sc�����
		//               ---------- 
		//		         �̿���,90,80,70
		//sc = new Scanner("�̿���,90,80,70").useDelimiter("\\s*,\\s*);
		//                                    ==��� ������   \s*,\s*
		//                                                 ------------
		//                                              ��繮�ڿ�, ��繮�ڿ�
		// �׷��ٸ� �����ڴ� �ѹ��� �ϸ� ��� �޸��� �����ϳ�? 
		//--> �̰��ѹ� �غ���!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1



		//�׸��� �޸� �����̴ϱ�
		//, �յڿ� �����̽������� intŸ���� �ƴ϶� ��Ÿ�ӿ���
		//


		name = sc.next();
		k = sc.nextInt();
		e = sc.nextInt();
		m = sc.nextInt();

		sum = k + e + m;


		//��� ���
		System.out.println("\n>> �̸� : " + name);
		System.out.println(">> ���� : " + sum);

	}
}

/*
�̸�,����,����,���� �Է�(��,������) : ����,100,90,20

>> �̸� : ����
>> ���� : 210
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/