/*=====================================
���� ���������� �������� ����
======================================*/

// ���� ������ �ʱ�ȭ �׽�Ʈ
// Test070.java�� ��

public class Test071
{
	//Ŭ������ ����
	int a;					//�ν��Ͻ��� �����ؼ� �޸𸮿� �ö� a.
							//�ڹٰ� �ڵ����� 0���� �ʱ�ȭ�Ѱ���
							//�޸𸮿� �ø��鼭 �ڵ����� ����.
	// ���� ���� a ����

	boolean b;
	char c;
	double d;

	public static void main(String[] args)
	{
		//�޼ҵ��� ����
		//System.out.println("a : " + a);

		// �� ������ ���� �߻�
		// non-static variable a cannot be referenced from a static context
		
		//Test071 Ŭ������ ������� �ν��Ͻ� ����.
		Test071 ob = new Test071(); 
		//�ڹٴ� �޸𸮿� �������� ������ ������� �ʴ´�.
		//ob�ȿ� Test071���赵 �ּ�.
		//ob.a : ob�ּ� �ȿ��� a�� ã�ڴ�.

		System.out.println("ob.a : " + ob.a);

		/*
		ob.a : 0
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
		System.out.println("ob.b : " + ob.b);
		System.out.println("ob.c : " + ob.c);
		System.out.println("ob.d : " + ob.d);

/*

ob.b : false
ob.c :
ob.d : 0.0

*/		

	}

	/*
	�ٸ� �޼ҵ�1()
	{
	}
	*/

	/*
	�ٸ� �޼ҵ�2()
	{
	}
	*/
}