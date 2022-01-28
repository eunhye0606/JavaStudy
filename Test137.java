/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/
// Wrapper 클래스

public class Test137
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// 인스턴스 생성과정 거치지 않음 → static final
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
		// ※ e 표기법

		System.out.println();// 개행

		//실수 기반의 나눗셈 연산
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
		//자바는 무한대 == 무한대 라고 처리하고
		//       무한대 != -무한대


		//==========================================================
		//『Double.isInfinite()』
		//if~() 뭐뭐인지 아닌지를 판단하는 true,false 반환 
		//to~() 변환하는 메소드
		//부호를 가리지 않고 무한대만 판정해주는 메소드
		//Double에만 있는가?
		// ★★★★★★★★★★★★★★★★★★★★★★★★★★★찾기
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		//--==>>5 : true
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		//--==>>6 : true
		//==========================================================
		System.out.println("7 : " + (3.0/0 + -3.0/0));
		System.out.println("8 : " + (0.0/0));
		//--==>>7 : NaN (→ Not a Number) 숫자가 아닙니다.
		//--==>>8 : NaN (→ 즉, 모든 수를 0으로 나눈다해서 Infinity가 아니다.)
		//==========================================================
		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10 : " + (0.0/0 != 0.0/0));
		//--==>>9 : false
		//		10 : true

		// ※ Nan(Not a Number) 값과 임의의 수를 
		//    『==』연산자를 통해 비교 연산을 수행하게 되면
		//    결과는 언제나 『false』를 반환한다.
		//    비교 불가능!


		//자바는 Infinity도 하나의 숫자로 생각한다.
		//그래서 3,4번에 true,false를 반환
		//==========================================================
		
		//『Double.isNaN()』
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " + Double.isNaN(1.1/2.2));
		//--==>>11 : true
		//		12 : false		

	}
}