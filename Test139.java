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

		//�� ���ڿ� ���� ��
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

		// �� ��String.substring(s)���ڡڡ� Oracle substring�̶� �򰥸��� �ʰ� �� �����ض�
		//     String ���ڿ��� �������
		//     s��°���� ������ ����
		//     (��, ���ڿ��� ���� ���̸�ŭ. ..)

		

		System.out.println("======================");
		//�� ���ڿ��� ������(��) ��  ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		//--==>>true
		//		false
		//-- ��ҹ��� ���С�

		System.out.println("======================");
		System.out.println(s.equalsIgnoreCase("Seoul Korea")); 
		//--==>>true
		//-- ��ҹ��� ���� ���� ��


		//�� ã���� �ϴ� ��� ���ڿ�(s)�� ��
		//   ��kor�� ���ڿ��� �����ұ�?
		//   �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?

		System.out.println("======================");
		//"seoul korea"
		// 0123456
		System.out.println(s.indexOf("kor"));
		//--==>>6
		//�ε�����ȣ ��ȯ
		System.out.println("�빮�ڸ� indexOf�� �����ұ�? : "+s.indexOf("K"));
		//--==>>�빮�ڸ� indexOf�� �����ұ�? : -1 
		// ����!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println(s.indexOf("ea"));
		//--==>>9

		System.out.println(s.indexOf("e"));
		//--==>>1 �ι�°�ΰ� e ã��

		System.out.println(s.indexOf("��"));
		//--==>>-1
		// -- ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		//    �� ���ڿ��� �ε����� ��ȯ������
		//    �������� ���� ��� ������ ��ȯ�ϰ� �ȴ�.
		//    -1�ϰŶ�� ������ ���� ������ ���������� ǥ���մϴ�!

		


		//�� ��� ���ڿ�(s)�� ��rea���� ���������� ���� Ȯ��  ��
		//   (true/false)
		System.out.println(s.endsWith("rea"));
		//--==>>true
		System.out.println(s.endsWith("oul"));
		//--==>>false



		//�� ã���� �ϴ� ��� ���ڿ�(s)��
		//   ��e�����ڿ��� �����ұ�?
		//    �����Ѵٸ� �� ��ġ�� ��� �ɱ�?
		//    (��, �ڿ��� ���� �˻�)

		//"seoul korea"
		System.out.println(s.indexOf("e"));
		//--==>> 1 
		// �տ������� ã�ٰ� ã���� �ڸ� Ȯ������ �ʰ�
		// ���� ��ȯ�ϰ� ����.

		System.out.println(s.indexOf("o"));
		//--==>>2


		System.out.println(s.lastIndexOf("e")); // ��
		//--==>>9
		//1. �ڿ��� ���� ã�ٰ� ã����
		//2. �տ������� �ε����� ����
		//3. �ε��� ��ȣ ��ȯ
		System.out.println(s.lastIndexOf("o"));
		//--==>>7

		//�� ��� ���ڿ�(s) ��
		//   ��6����° �ε��� ��ġ�� ���ڴ�? ��


		//"seoul korea"
		System.out.println(s.charAt(6));
		//--==>>k
		//System.out.println(s.charAt(22));
		//--==>>Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 22
		// ��Ÿ�� ����
		// subString() �Ҷ� array�ε��� ������ ���� ����.



		//===========================================

		//�� ��� ���ڿ�(s) �� �� ���ڿ� ��seoul corea�� ��
		//   � ���ڿ��� �� ū��? �� ���ڿ��� ���� ũ�� ��  ��

		//�� �� ���ڿ��� ���ٸ�   �� 0
		//�� �� ���ڿ��� �ٸ��ٸ� �� ���̸� Ȯ��(������ �迭)
		
		System.out.println(s.compareTo("seoul korea"));
		//--==>>0
		
		System.out.println(s.compareTo("seoul corea"));
		//--==>>8
		//-- c - k�� defghijk �� 8
		System.out.println("�빮�ڶ��� ������ �迭 ���� k�� K"+s.compareTo("seoul Korea"));
		//--==>>�빮�ڶ��� ������ �迭 ���� k�� K32



		//===========================================
		//�� ��� ���ڿ�(s) ��
		//   �ش� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ����  ��
		
		s = "����ϴ� �츮 ����";
		s = s.replaceAll("����","������");
		System.out.println("ó�� ��� : " + s);
		//--==>>ó�� ��� : ����ϴ� �츮 ������

		//===========================================
		//�� ���� ����  ��
		s = "          ��         ��              ";
		System.out.println("|||" + s + "|||");
		//--==>>|||          ��         ��              |||


		System.out.println("|||" + s.trim() + "|||");//��
		//--==>>|||��         ��|||
		//1.�տ����� (�ϳ���)�����ϸ鼭 ���� ������ ����
		//2.�ڿ����� (�ϳ���)�����ϸ鼭 ���� ������ ����

		//���� �����ڸ� ���� ����


		//trim() �����ڸ����� �����Ѵ�. ���ʰ��� �� ����.
		//������ó�� ������ ������ ������ ����.
		//�ٸ��޼ҵ�� ������ �����ڳ�
		//Oracle���� ��. �׳� trim���� ltrim, rtrim

		System.out.println("|||" + s.replaceAll(" ","") + "|||");
		//--==>>|||���|||
		//�����ִ� ���ڸ� ������� ���ڷ� �ٲ��.


		//"30"
		int temp = Integer.parseInt("30"); //--����ó�� ���� ���ڿ��� �ѱ��
		//System.out.println("temp: " + temp);
		//--==>>temp: 30

		System.out.printf("%d : \n", temp); //--Ȯ��
		//�������̵��ؼ� Integer�� ��������
		s = Integer.toString(30);
		System.out.printf("%s : \n", s);   //--Ȯ��
		//System.out.println("s : " + s);


		int n = 2345678;
		System.out.printf("%d", n);
		System.out.println();
		System.out.format("%d", n);
		System.out.println();

		//--==>>2345678
		//		2345678




		////===========================================
		//�̷������� ���ڿ��� ��ȯ�ض� �׷��� �ܵ����� ������ !@@@@@@@@@@@!!!!!!!!
		//printf(),format()�� �̷� ������ ����ض�..��
		//-------- --------
		//         String���� ���־�.
		
		//������ ����.
		System.out.println();
		s = String.format("%d",n); //�׷��� �ܵ����� ����
		System.out.println(s);
		System.out.println();
		//--==>>2345678

		

		s = String.format("%,d",n);
		System.out.println(s);
		//--==>>2,345,678

		System.out.printf("%,d\n",n);
		//--==>>2,345,678


		//String str = " �⺻,����,���";
		//String [] strArr = str.split(",");
		// ��	�� ���� ����

		String [] strArr = "�⺻,����,���".split(",");//��
		
		for(String str :strArr)
			System.out.print(str + " ");

		System.out.println();
		//--==>>�⺻ ���� ���



		
		
		



	}
}