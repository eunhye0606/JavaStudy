/*=======================
���� Ŭ���� ��� ����
=========================*/
// ��ø Ŭ����

// ���� Ŭ���� (�ǹ����� ���� �� �־��)

/*
�� Annonymous Ŭ����(�͸��� Ŭ���� : ���� Ŭ����)
  
   - awt �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
   - ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
   - Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
     ���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó���Ѵ�.


�� ���� �� ����
   
   new ����Ŭ������ ������()
   {
	   �������������� �ڷ��� �޼ҵ�()
	   {

		   ...;

		}
	
	}; //-- �����ݷ� check~!!
*/

/*
��� ��ü�� ������ object�̴�.
*/

//import java.lang.*;

class Test3 //extends Object
{
	/*
	Object Ŭ������ �����...
	...
	public String toString()
	{
		...;
	}
	*/
	/*
	object �޼ҵ�()
	{
		Object result;
		FruitSeller seller = new FruitSeller();
		result = seller; �� �̰� ��ĳ����
		return(Object)seller;
	}
	*/
	public Object getString() //return �ڷ����� Object ��� ��ü�� Object�� �ڽ��̴�.
	{						  // ��ĳ����.
		/*
		return new object();
		       ------------- Object ���̸� return�ڷ����� �´°�
			   �� �̷��� ���� Object�� ��ȯ�ϴ°Ű�.
		*/
		/*
		return new object()
		{
			Ư���޼ҵ��籸�� 
		};
		*/
		return new Object() //-- new ����Ŭ������ ������()
		{
			@Override
			public String toString() //-- �������������� �ڷ��� �޼ҵ�()
			{
				return "�͸��� Ŭ����...";
			}
		}; //-- �����ݷ�( �� �ۼ� �� ���� �߻� )
	}
}
public class Test127 //extends Object
{
	/*
	Object�� �����ִ� �����...
	*/
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();

		System.out.println(ob1.toString()); // ob1���� getString()�ۿ�����.
		//--==>>Test3@15db9742

		System.out.println(ob1.getString());
		//--==>>�͸��� Ŭ����...

		/*
		���� ���������δ� toString�� ��������
		toString()�� �������̵��ؼ� ����.
		*/
	
	}
}