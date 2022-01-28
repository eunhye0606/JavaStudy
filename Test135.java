/*=====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================*/
// Wrapper Ŭ����

import java.math.BigDecimal;

public class Test135
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("1234543452.23424325252");
		System.out.println("a  :           " +a);


		//movePointLeft()
		//�Ҽ����� �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println("b ó�� ��� : " + b);
		//a  :           1234543452.23424325252
		//b ó�� ���  : 1234543.45223424325252

		

		//static final ���. 
		//BigDecimal.ROUND_DOWN
		//������ ���� (��ü �Ӽ� Ȯ��, �ݿø� ���� �ʴ´�. �� ����)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		System.out.println("c ó����� : " + c);
		//a  :           1234543452.23424325252
		//b ó�� ��� :  1234543.45223424325252
		//c ó����� :   1000.00000000000


		//a.toBigInteger(); �ٽ�.
		System.out.println("a�� ��ȯ ��Ŵ : " + a.toBigInteger());
		//a  :           1234543452.23424325252
		//a�� ��ȯ ��Ŵ :1234543452.23424325252
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



	}
}