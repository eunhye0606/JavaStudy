/*=====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================*/
// Wrapper Ŭ����

public class Test137
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// �ν��Ͻ� �������� ��ġ�� ���� �� static final
		//--==>>2147483647
		//	    -2147483648


		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		//--==>>9223372036854775807
		//	    -9223372036854775808


		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		//--==>>1.7976931348623157E308
		//		4.9E-324
		// �� e ǥ���

		System.out.println();// ����

		//�Ǽ� ����� ������ ����
		System.out.println("1 : " + 3.0/0);
		//--==>>1 : Infinity
		System.out.println("2 : " + -3.0/0);
		//--==>>2 : -Infinity
		//==========================================================
		System.out.println(" ==================== ");
		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));
		//--==>>3 : true
		//		4 : false
		//�ڹٴ� ���Ѵ� == ���Ѵ� ��� ó���ϰ�
		//       ���Ѵ� != -���Ѵ�


		//==========================================================
		//��Double.isInfinite()��
		//if~() �������� �ƴ����� �Ǵ��ϴ� true,false ��ȯ 
		//to~() ��ȯ�ϴ� �޼ҵ�
		//��ȣ�� ������ �ʰ� ���Ѵ븸 �������ִ� �޼ҵ�
		//Double���� �ִ°�?
		// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�ã��
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		//--==>>5 : true
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		//--==>>6 : true
		//==========================================================
		System.out.println("7 : " + (3.0/0 + -3.0/0));
		System.out.println("8 : " + (0.0/0));
		//--==>>7 : NaN (�� Not a Number) ���ڰ� �ƴմϴ�.
		//--==>>8 : NaN (�� ��, ��� ���� 0���� �������ؼ� Infinity�� �ƴϴ�.)
		//==========================================================
		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10 : " + (0.0/0 != 0.0/0));
		//--==>>9 : false
		//		10 : true

		// �� Nan(Not a Number) ���� ������ ���� 
		//    ��==�������ڸ� ���� �� ������ �����ϰ� �Ǹ�
		//    ����� ������ ��false���� ��ȯ�Ѵ�.
		//    �� �Ұ���!


		//�ڹٴ� Infinity�� �ϳ��� ���ڷ� �����Ѵ�.
		//�׷��� 3,4���� true,false�� ��ȯ
		//==========================================================
		
		//��Double.isNaN()��
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " + Double.isNaN(1.1/2.2));
		//--==>>11 : true
		//		12 : false		

	}
}