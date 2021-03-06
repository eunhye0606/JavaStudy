/*======================================
   ■■■ 자바 기본 프로그래밍 ■■■
=========================================*/

// 변수와 자료형
// 형 변환
// 접미사 활용


public class Test008
{
	public static void main(String[] args)
	{
		int a;
		a = 10;
		System.out.println("a 의 결과:" +a);
		
		int b = 20;
		System.out.println("b 의 결과:" + b);
		// a 의 결과:10
		// b 의 결과:20

		short c; //얜 문제 없음.
		//c = a;   //얘가 에러 만든다. 자동 형 변환 규칙 위반.
		//System.out.println("c 의 결과:" + c);
		// 컴파일 에러 발생

		//기본적으로 자료형이 작은거에 큰거 못담음.
		// 자동 형 변환 규칙 위반

		//명시적 형 변환 (강제 형 변환) 가능한지 확인. a안에 데이터가 c에 가능한가?
		
		c = (short)a;
		// a가 가지고 있는 데이터를
		//short 형으로 형 변환을 수행한 후
		//변수 c에 대입한다.
	
		//00000000 00000000 00000000 00001010 → int형 a 변수 10
		//	  ↓
		//	형 변환
		//    ↓
		//00000000 00001010 → short 형으로 변환된 결과

		System.out.println(c);
		//--> 10

		

		// 변수 선언 및 초기화
		long d = 10000000000;	//백억임.
		// -- 『=』 대입 연산자를 기준으로 우측의 상수 표현이
		//	int 형 메모리에 해당 상수를 할당할 수 없음.
		// -- 접미사 L(ㅣ가능) 붙혀야한다.
		// So, 약 21억 이상 되는 상수는 접미사 L 붙혀라.


		//고로 형변환은 ()
		//상수 할당할때는 접미사 ~! --> 얜 메모리에 상수를 못넣음.

		System.out.println("d 의 결과 값은 ? 두근두근 바로 --> " + d);
		//-->d 의 결과 값은 ? 두근두근 바로 --> 10000000000

		long d2 = 10;
		System.out.println(d2);
		//-->10

		long num = 10L;
		//가능하긴해. 근데 굳이?

		int e = 030;
		System.out.println("e의 결과:" + e);
		//-->e의 결과:24
		//접두어 『0』 → 8진수
		// 030 → 64, 8, 1 자리
		// 3*8 = 24

	}
}