/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/
// Wrapper 클래스


import java.math.BigInteger;

public class Test134
{
	public static void main(String[] args)
	{
		//int a1 = 23424242424242424l; 
		//System.out.println(a1);
		//long b1 = 23424242424242424l;
		//long b1 = 23424242424242424l;
		//long b1 = 234242424242424241231231312313L;
		//long 보다 커서 접미사 붙혀도 안담겨요 컴파일에러
		//System.out.println(b1);	
		
		// 클래스 존재 목적 : long 에서 마저도 표현 못하는 수가 있다.
		//                    매개변수로 상수를 못해
		//                    위 이유 때문에.
		// ※ 정수형태로 만드는 클래스는 문자열형태로 수를 넘겨준다.
		BigInteger a = new BigInteger("234242424242424241231231312313");
		BigInteger b = new BigInteger("234242424242424241231231312313");

		//BigInteger c = a+b;
		//System.out.println(c);
		

		
		// 더하기
		// a를 기준으로 매개변수를 더해라.
		BigInteger c = a.add(b); 
	    System.out.println("덧셈 결과 : " +c);
		//--==>>덧셈 결과 : 468484848484848482462462624626


		//빼기
		BigInteger d = a.subtract(b);
		System.out.println("빼기 결과 : " +d);
		//--==>>빼기 결과 : 0



		//곱하기
		BigInteger e =a.multiply(b);
		System.out.println("곱셈 결과 : " + e);
		//--==>>곱셈 결과 : 54869513314967859863498246938334565243293878659992145409969


		//나누기
		BigInteger f = a.divide(b);
		System.out.println("나눗셈 결과 : " + f);
		//--==>>나눗셈 결과 : 1




		System.out.println("구분=====================");
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : " + g.pow(3));
		//--==>>2의 3승 : 8
	
	}
}

/*
실행 결과
덧셈 결과 : 468484848484848482462462624626
빼기 결과 : 0
곱셈 결과 : 54869513314967859863498246938334565243293878659992145409969
나눗셈 결과 : 1
구분=====================
2의 3승 : 8
계속하려면 아무 키나 누르십시오 . . .
*/