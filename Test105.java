/*===============================================
���� �޼ҵ� �ߺ�����(Method Overloading) ����
================================================*/

/*
�� �޼ҵ� �����ε��� ����
   �޼ҵ� �����ε�(Overloading)�̶�
   �޼ҵ尡 ó���ϴ� ����� ����
   �޼ҵ� ��ȣ �ӿ� ���� �μ�(���� == �Ű����� == �Ķ����)�� ������ �ٸ��ų�
   �ڷ���(Data Type)�� �ٸ� ���
   �޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ���
   ���������� ����ϰ� �Ǵµ�
   �̸� �޼ҵ� �����ε�(Method Overloading)�̶�� �Ѵ�.
*/


public class Test105
{
	public static void main(String[] agrs)// static
	{

		/*
		Test105 ob = new Test105(); //-- �� ��ü������  105������ darwLine�� �޼ҵ���.
		ob.drawLine();
		*/
		drawLine(); //--static�������.
		//-->>====================

		drawLine('-');
					// �޼ҵ���� ���Ƶ� �Ű������� �޶� 
					// ���� �θ����� �ĺ�����!
		//-->>--------------------
		drawLine('<');
		//-->><<<<<<<<<<<<<<<<<<<<
		drawLine('+',30);
		//-->>++++++++++++++++++++++++++++++
		drawLine('/',50);
		//-->>//////////////////////////////////////////////////


		/*
		System.out.println(10);
		System.out.println("ABCD");
		System.out.println('K');
		System.out.println(3.141592);
		System.out.println(true);
		�Ű����� �ڷ����� �� �ٸ�.

		System.out.printf("%d\n",10);
		System.out.printf("%d + %d = %d\n",10,20,30);
		�Ű����� ������ �� �ٸ�.
		
		
		*/
			}
	//���� �׸��� �޼ҵ� ����
	public static void drawLine()
	{
		System.out.println("====================");
	}

	//���� ���¸� �ٲپ� �׸��� �޼ҵ� ����
	//public static void drawLine()// �̷��� � �޼ҵ�θ����� ��
								 // default�� �޼ҵ��̸��� ���� �� ����.
	public static void drawLine(char c)							 
	{
		for (int i =0;i<20 ;i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}

	// ���� ���¿� ���̸� �ٲپ� �׸��� �޼ҵ� ����
	public static void drawLine(char c,int n)
	{
		for (int i =0 ;i<n ;i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}

}