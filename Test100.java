/*=====================================
    ���� Ŭ������ �ν��Ͻ� ����
======================================*/ //�̰� �ٽ� Ȯ��

// ���� ���а� ���� ���� ������(����������, ����������...)
import java.util.Scanner;
class CircleTest2
{
	int num;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		num = sc.nextInt();
	}

	double calArea()
	{
		return num * num * 3.14;
	}

	void write(double area)
	{
		System.out.println("������ : " + num);
		System.out.println("���� : " + area);
	}

}
/*
public class Test100
{
	public static void main(String[] args)
	{
	

	// ���� ����(Information Hiing)
	// ��� ����,�ν��ͽ� ���� ,���� ����
	// ��private���̶�� ���������������� ������
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�.
	// �� 
	// CircleTest2 �� ��� ���� ����, �ν��Ͻ� ����, ��������
	//int num;	//�� �ν��Ͻ� ���� ��, �޸� �Ҵ� ����.
	
	
	private int num;

	// int �� �������� �� �ڵ�0���� �ʱ�ȭ ����.

	// getter / septter ����
	int getNum()
		return num;
	
	//void setNum;

	void setNum(int num)
		this sum.sum;
	
	*/	
	




public class Test100

{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();
		/*
		//CircleTest2�� �ν��Ͻ� ����
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num = 10;
		ob1.setNum;

		//System.out.println("���� ������ : " + ob1.num);
		// cc�տ� private�� ���Ѱɾ ����.
		System.out.println("���� ������ : " + ob1.getnum);
	}	*/
		ob1. input();

		double result = ob1.calArea();
		ob1.write(result);
	}


}