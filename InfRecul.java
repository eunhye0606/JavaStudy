/*=====================================
���� �޼ҵ��� ��� ȣ�� ����
======================================*/

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(10);
		//System.out.println("�ȴ�"); �� Hi~
									//   �ȴ�
									// showHi �ϰ� �ٽÿͼ� ���.
		
		
	}
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");

		if (cnt == 1)	//�̰� ������ -21����� ��. Like �ݺ��� ���ʶ߸��°�ó��.
		{
			return;
		}

		showHi(--cnt);
	}
}



/*	public static void showHi(int cnt)
	{
		
		
		
		showHi(cnt--);	//postfix�� ���� ȣ�⿡�� ���� .�׷��� showHi(10)��ä��
						// ���⼭ ���ѹݺ���.
						//�׷��� showHi(cnt--);

						// showHi(1)�� ȣ��Ǹ�
						// showHi(0).
						// if���� ����ȵ�.
		
		if (cnt == 1)	//�갡 ������. �������� ��� 1�� main���� ȣ��Ǵϱ� �������.
			return;	
	}
	
	// Hi 10����� ���?
	// ��� showHi(10) ȣ����. ����Ʈ�Ƚ�������.
}
*/