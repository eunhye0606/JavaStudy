/*==============================================
�����ڹ��� ���� �� Ư¡ ����

// ������ �ڷ���
// ������ �ڷ��� �ǽ� �� �׽�Ʈ : BufferedReader Ŭ����

// ����ڷκ��� �̸�, ��������, �������� , ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : 
// ���� ���� �Է�:
// ���� ���� �Է�:
// ���� ���� �Է�:

//====[���]====
// �̸� : 
// ���� :
// ����Ϸ��� �ƹ� Ű�� ��������......
=============================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test016
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//���2. 
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr);


		//�ֿ� ���� ����
		String name;
		int k,e,m,sum;
		//�밡����
		//String strName;
		//int nkor, nEng, nMat;


		//���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : "); //�� �ٹٲ� .?
		name = br.readLine();

		System.out.print("���� ���� �Է� : "); 
		k = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		e = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		m = Integer.parseInt(br.readLine());


		// �� ���� ������ ����ִ� ������ 
		//�����Ͽ� ���� �����ؼ�
		//sum ������ ����
		sum = k + e + m;

		//��� ���
		System.out.printf("\n\n====[���]====\n �̸� : %s\n ���� : %d\n",name,sum);
		//���2.�밡��.
		//System.out.println("\n\n====[���]====\n�̸� : " + name + "\n���� : " + sum);

	}
}

/*
�̸��� �Է��ϼ��� : ȫ����
���� ���� �Է� : 100
���� ���� �Է� : 20
���� ���� �Է� : 40


====[���]====
 �̸� : ȫ����
 ���� : 160
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/