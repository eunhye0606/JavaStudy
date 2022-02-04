/*================================
���� ����(Exception) ó�� ����
=================================*/

// ���� �ٽ� ������
// �� ������ �������� �̰��� �ٽ� Ȯ���ؾ� �� ��.
// ������ �迡 �� ���� ó���ϰ� �� ȥ�� �˸� �ȵ�
// 1�� ���ػ翡�� �˸���. �� �������� �˸���
// ���� ������ �ϰ� ����޴� ������� �ٽ� �˸���
// �̰ŵ� �����Ӱ� ��Ʈ���ؾ���.


public class Test154
{
	public static void main(String[] args)
	{
		Test154 ob = new Test154();

		try
		{
			int a = ob.getValue(-2);//���� �߻�
			System.out.println("a : " + a);
		}
		catch (Exception e)	//�� ���� ��Ƴ���
		{
			System.out.println("�� printStackTrace....ºº");
			e.printStackTrace();
		}
	}



	public int getData(int data) throws Exception //���� ������
	{
		if (data < 0)
		{
			throw new Exception("data �� 0 ���� �۽��ϴ�.");
			// �� ���� �߻�   (try ~ catch || throws)
		}
		return data + 10;
	}


								  //�� ��Ƴ� ���ܸ� �ٽ� ������ ���� �����ϵ��� ó��
	public int getValue(int value) throws Exception
	{
		int a = 0;
		
		try
		{
			a = getData(-2);
			// �� ���� �߻�
		}
		catch (Exception e) //�� ���� ��Ƴ���(throws �ʿ����.)
		{
			//�� ��Ƴ� ���ܿ� ���� ó��
			System.out.println("�� printStackTrace..........º");
			e.printStackTrace();


			//check~!!!
			//�� ��Ƴ� ���ܸ� �ٽ� ������
			throw e;
			//-- �鿡�� ��Ƴ� ���ܸ� �ٽ� ������.
			//   �� �ȿ��� ��ź �����ſ� ����.
		}



		return a;

	}
}