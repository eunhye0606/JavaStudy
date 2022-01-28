/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/
// Wrapper 클래스

import java.math.BigDecimal;

public class Test135
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("1234543452.23424325252");
		System.out.println("a  :           " +a);


		//movePointLeft()
		//소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println("b 처리 결과 : " + b);
		//a  :           1234543452.23424325252
		//b 처리 결과  : 1234543.45223424325252

		

		//static final 상수. 
		//BigDecimal.ROUND_DOWN
		//나눗셈 연산 (대체 속성 확인, 반올림 하지 않는다. → 절삭)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		System.out.println("c 처리결과 : " + c);
		//a  :           1234543452.23424325252
		//b 처리 결과 :  1234543.45223424325252
		//c 처리결과 :   1000.00000000000


		//a.toBigInteger(); 다시.
		System.out.println("a를 변환 시킴 : " + a.toBigInteger());
		//a  :           1234543452.23424325252
		//a를 변환 시킴 :1234543452.23424325252
계속하려면 아무 키나 누르십시오 . . .



	}
}