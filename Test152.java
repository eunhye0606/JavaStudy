/*================================
���� ����(Exception) ó�� ����
=================================*/

//Test153.java ���ϰ� ��~!!!

class Demo
{
	private int value; //-- �������� 0���� �ڵ� �ʱ�ȭ.

	public void setValue(int value)
	{
		if (value <= 0)
		{
			return;				//-- ���� �� �޼ҵ� ����.
								//return �뵵 2���� �˱�.
		}
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}





public class Test152
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue(); //-- ������ �̹� 0
		System.out.println(result);
	}
}
/*
0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/