/*=====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================*/
// String Ŭ����

public class Test139
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>>seoul korea

		System.out.println("======================");

		//�� ���ڿ� ����
		System.out.println(s.substring(6,9));
		//--==>>kor

		System.out.println("======================");
		//�� ��String.substring(s,e)��
		//    String ���ڿ��� �������
		//    s ��°���� e-1��°���� ����
		//    (��, �ε����� 0���� ����)


		System.out.println("======================");
		System.out.println(s.substring(7));
		//==>>orea

		// �� ��String.substring(s)��
		//     String ���ڿ��� �������
		//     s��°���� ������ ����
		//     (��, ���ڿ��� ���� ���̸�ŭ. ..)

		

		System.out.println("======================");
		//�� ���ڿ��� ������(��) ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		//--==>>true
		//		false
		//-- ��ҹ��� ����

		System.out.println("======================");
		System.out.println(s.equalsIgnoreCase("Seoul Korea"));
		//--==>>true
		//-- ��ҹ��� ���� ����


		//�� ã���� �ϴ� ��� ���ڿ�(s)��
		//   ��kor�� ���ڿ��� �����ұ�?
		//   �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?

		System.out.println("======================");
		//"seoul korea"
		// 0123456
		System.out.println(s.indexOf("kor"));
		//--==>>6
		//�ε�����ȣ ��ȯ
		System.out.println(s.indexOf("ea"));
		//--==>>9

		System.out.println(s.indexOf("e"));
		//--==>>1 �ι�°�ΰ� e ã��

		System.out.println(s.indexOf("��"));
		//--==>>-1
		// -- ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		//    �� ���ڿ��� �ε����� ��ȯ������
		//    �������� ���� ��� ������ ��ȯ�ϰ� �ȴ�.
		//    -1�ϰŶ�� ������ ���� ������ ������ ǥ���մϴ�!





	}
}