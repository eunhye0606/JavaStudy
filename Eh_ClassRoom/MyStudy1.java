public class MyStudy1
{
	public static void main(String[] args)
	{
		int a,x;
		double b;
		
		a = 5;
		x = 3;
		b = 3.7;
	
		//���� �Ǽ�����
		System.out.println("���� + �Ǽ� : " + (a + b));
		System.out.println("���� - �Ǽ� : " + (a - b));
		System.out.println("���� * �Ǽ� : " + (a * b));
		System.out.println("���� / �Ǽ� : " + (a / b));
		System.out.println("���� % �Ǽ� : " + (a % b));

		//������(��,������)�θ� ��ȯ
		System.out.println("���� + ���� : " + (a + x));
		System.out.println("���� - ���� : " + (a - x));
		System.out.println("���� * ���� : " + (a * x));
		System.out.println("���� / ���� : " + (a / x));  //�� ��ȯ
		System.out.println("���� % ���� : " + (a % x));  //������ ��ȯ
	}
}