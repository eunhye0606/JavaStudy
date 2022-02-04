/*================================
���� ����(Exception) ó�� ����
=================================*/

//Test152.java ���ϰ� ��~!!!

//�� throw					ch)throws(�츮�� ���� ����ߴ���)
//   : ���ܸ� �߻���ų ��.	   :���ܸ� ������ ���� ��.
class Demo
{
	private int value; //-- �������� 0���� �ڵ� �ʱ�ȭ.

	public void setValue(int value) throws Exception //�갡 ��ź �ӱݰ� ������ �̰� ó��.
	{								//���⼭ ������ ��
		if (value <= 0)
		{
			//return;				//-- ���� �� �޼ҵ� ����.
								//return �뵵 2���� �˱�.

			throw new Exception("value�� 0���� �۰ų� ���� �� �����ϴ�.");
			// �̸��� �Ⱥپ��� �ν��Ͻ� ���� ȣ��.
			// ���ܵ� ��ü����.
			//checked exception�� setValue()�ȿ� �ִ� ��
		}
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}


public class Test153
{
	public static void main(String[] args) //throws Exception ��
	{
		Demo ob = new Demo();


		//��
		try //�� ���⼭ ����ó��!
		{
			ob.setValue(-3); //-->> ���� ���� �߳�? Ȯ���ϱ� print��!
			int result = ob.getValue(); //-- ������ �̹� 0
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
/*
java.lang.Exception: value�� 0���� �۰ų� ���� �� �����ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/