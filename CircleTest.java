/*=====================================
���� Ŭ������ �ν��Ͻ� ����
======================================*/

//�� Test073.java ���ϰ� ��Ʈ ~!!


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CircleTest
{
/*
	// -- ��� ���� �� �ֿ� �Ӽ�(������)
	int r; //������
	final double PI = 3.141592; // ������ (������ ���ȭ)

	// ��� �޼ҵ� �� �ֿ� ���(�޼ҵ�)
	// ������ �Է� ��� �� �޼ҵ� ����

	
	void input() throws IOException
	{
		//BufferedReader ����� �ν��Ͻ� ����.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}

	// ���� ��� ��� �� �޼ҵ� ����

	double calArea()
	{
		double area = r * r * PI;
		return area;
	}

	// �ѷ� ��� ��� �� �޼ҵ� ����
	double length()
	{
		double length = r * 2 * PI;
		return length;
	}
	// ��� ��� �� �޼ҵ� ����
	void print(double a, double b)
	{
		System.out.println(">> �������� " + r + "�� ����");
		System.out.println(">> ���̴� : " + a);
		System.out.println(">> �ѷ��� : " + b);	
	}
	
}
*/


	
	//�Ӽ� == ������.
	int r;
	//--������		//�갡 ���� ����ż� input���� �ʱ�ȭ�� r ���� �ٸ� ������ 
							// �Ű������� �ȹް� ���� �ҷ��� ���°�!! ����������1!!!
	final double PI = 3.141592;

	//��� == �޼ҵ�

	void input() throws IOException		//������ �Է� �ޱ�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}
	
	double circleArea()	//���� ���� ���ϱ�
	{
		double circleArea;
		circleArea = r * r * PI;
		return circleArea;
	}
	
	double circleLength()	//���� �ѷ� ���ϱ�
	{
		double circleLength;
		circleLength = r * 2 * PI;
		return circleLength;		// -- return�� �����ϱ� ������ �տ� �ڷ��� �����. 
									//    �Ű����� �޴°� ������.
									//    ���⼭�� �Ű������� ���������� r�� �Ǿ��־
									//    �տ� �����ϱ� ���� �� �޴´ٰ� �����Ѱ�
									// return �� ��ȯ�̴ϱ� �տ� ����Ÿ�� ��ȯ�Ұ��̴�. ���ϱ�.
	}

	void circlePrint(double s,double l)	//����ϱ�
	{
		System.out.println("�������� " + r + "�� ���� ");
		System.out.printf("���� : %.2f\n",s);
		System.out.printf("�ѷ� : %.2f\n",l);
	}
	
}