/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/
// if ��
//if ~ else �� �ǽ�

//1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//   �б� ������ ���ϱ� ���� ����ϴ� �������
//   if��, if~else��, ���ǿ�����, ����if��(if�� ��ø),
//   switch ���� �ִ�.

//2. if���� if ������ ������ ���� ���,
//   Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

//����ڷκ��� �̸�, �������� ,�������� , ���������� �Է¹޾�
//������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//����� ��� ������ �������� ó���Ѵ�.

// 90�� ~ 100�� : A		80�� ~ 89�� : B
// 70�� ~ 79��  : C		69�� ~ 69�� : D
// 60�� �̸�    : F

//��, BufferedReader �� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� �ϸ�,
//printf() �޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

// ���� �� )
// �̸� �Է� : ȫ���� 
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� ȫ�����Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String strName; //�̸�
		int k,e,m,sum;  //���� ����,����
		double averge;  // ���
		char level;     //���
	
		System.out.print("�̸� �Է� : ");
		strName = br.readLine();

		System.out.print("���� ���� : ");
		k = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		e = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		m = Integer.parseInt(br.readLine());

	 


		sum = k + e + m;
		averge = (double)sum/3;
		//averge = sum/3.0; //�ڡڡڡڡ�	
		
		if (averge >= 90)
			level = 'A'; 
		else if (averge >=80)
			level = 'B';
		else if (averge >= 70)
			level = 'C';
		else if (averge >= 60)
			level = 'D';	
		else
			level = 'F';

		//int a; //�ʱ�ȭ�� ���Ѵٸ�?
		//System.out.println(a); //�ʱ�ȭ���ϰ� else if�� ������ �����߻��̶� ����.
		//level < 60 �ص� �����Ͽ�����.
		//�Ǵٸ� ������ ������ ���� �𸥴ٰ� �ڹٴ� �����ϱ� ������
		
		//�ڡڡڡڡڡڡڡڡڡ�else��� �ʱ�ȭ��.�ڡڡڡڡڡڡڡڡڡ�
		//char level = 'F' 
		//if ( averge >= 90)
		//		level = 'A'
		//else if (averge >=80)
		//		level = 'B'
		//else if (averge >= 70)
		//		level = 'C'
		//else if (averge >=60)
		//		level = 'D'


		System.out.printf("\n>>����� �̸��� %s�Դϴ�.\n",strName);
		System.out.printf(">>���� ������ %d,\n",k);
		System.out.printf(">>���� ������ %d,\n",e);
		System.out.printf(">>���� ������ %d,\n",m);
		System.out.printf(">>������ %d�̰�, ����� %.1f�Դϴ�.\n",sum,averge);
		System.out.printf(">>����� %c �Դϴ�\n",level);


	}
}

/*
�̸� �Է� : heh
���� ���� : 90
���� ���� : 80
���� ���� : 70
����� �̸��� heh�Դϴ�.
���� ������ 90,
���� ������ 80,
���� ������ 70,
������ 240�̰�, ����� 80.000000�Դϴ�.
����� B �Դϴٰ���Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
	
