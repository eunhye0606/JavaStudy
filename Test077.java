/*=====================================
���� Ŭ������ �ν��Ͻ� ����
======================================*/

// ������(Constructor)

class NumberTest2
{
	int num;
	
	// ����� ���� �����ڰ� ���ǵǾ� �����Ƿ� default ������ �ڵ����� 
	// �������� �ʴ´�.
	/*
	NumberTest2()
	{
	}
	*/

	// ������ �� ����� ���� ������
	
	NumberTest2(int n)
	{
		num = n;
		System.out.println("������ ȣ�� �� �Ű����� ���� : " + n);
	}
	

	int getNum()
	{
		return num;
	}
}




public class Test077
{
	public static void main(String[] args)
	{
		// NumberTest2 �ν��Ͻ� ����.
		//NumberTest2 ob1= new NumberTest2();
		// �� ������ ���� �߻�
		// NumberTest2 Ŭ��������
		// ����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱� ������
		// ��default �����ڡ��� �ڵ����� ���Ե��� ������
		// ����ڰ� ������ �����ڴ� �Ű������� ���� �����̱� ������
		// ���� ���� �Ű����� ���� ������ ȣ�� �� ������ �߻��ϰ� �ȴ�.
		/*
		Test077.java:40: error: constructor NumberTest2 in class NumberTest2 cannot be applied to given types;
                NumberTest2 ob1= new NumberTest2();
                                 ^
		required: int
		found: no arguments
		reason: actual and formal argument lists differ in length
		1 error
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/


		NumberTest2 ob1= new NumberTest2(10);
		/*
		������ ȣ�� �� �Ű����� ���� : 10
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
		System.out.println("�޼ҵ� ��ȯ �� : " + ob1.getNum());
		// �޼ҵ� ��ȯ �� : 10

		NumberTest2 ob2 = new NumberTest2(3564);
		System.out.println("�޼ҵ� ��ȯ �� : " + ob2.getNum());
		/*
		������ ȣ�� �� �Ű����� ���� : 3564
		�޼ҵ� ��ȯ �� : 3564
		*/

		// ���� ���赵 �ٸ� ��ü��
		// ��Ȳ�� �ٸ���.

	}
}

/*
������ ȣ�� �� �Ű����� ���� : 10
�޼ҵ� ��ȯ �� : 10
������ ȣ�� �� �Ű����� ���� : 3564
�޼ҵ� ��ȯ �� : 3564
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/