/*======================================
   ■■■ 자바 기본 프로그래밍 ■■■
=========================================*/

// 변수와 자료형
// 키워드 및 식별자
//printf()



public class Test007
{
	public static void main(String[] args)
	{ 
		// 주요 변수 선언 및 초기화
		int a = 10, b = 5;
		int c, d;

		
		// 연산 및 처리
		c = a + b;
		d = a - b;


		// 결과 처리
		//System.out.println(c);
		//System.out.println(d);

		//-->15
		//	  5

		//System.out.println("10 + 5 = " + c);
		//System.out.println(a + " + " + b + " = " + c);
		//--> 10 + 5 = 15
		/*
		자바에서는 서로 다른 자료형의 데이터들끼리도
		+ 연산이 가능하며,
		다른 어떤 자료형과 문자열 데이터의 + 연산 결과는
		문자열 결합 연산자 기능.
		*/

		//print() / println() / printf() / format()

		//printf() 랑 format()
		// JDK 1.5부터 지원되는 메소드
		//즉 Like 팔콘ㅋㅋ
		// 두 개 사용법 같음.
		//format()은 String쪽에서 쫌 자주 씀.
		//System.out.printf("○ + ○ + ○", 10, 20, 30);
		//서식 출력용 메소드
		//출력하기 위에 틀짜놓고 하는거

		System.out.printf("%d + %d + %d", 10, 20, 30);
		//%d == 10진수 정수형

		System.out.printf("%d + %d + %d%n", 10, 20, 30);
		//ln이 없어요 그래서 개행 안돼 
		//문자열 뒤에 \n == %n 붙으면 됨!

		//System.out.printf("%d 와 %d\n" ,10 , 3.14);
		//-->런타임에러발생
		//컴파일에러 -> 문법오류 봄
		
		System.out.printf("%d 와 %f\n" ,10 , 3.14);
		//실수는 %f
		//-->10 와 3.140000
		System.out.printf("%.2f\n",3.1321443);
		// 소수점 이하 두 번째 자리까지 표현
		//-->3.13

		System.out.printf("%.2f\n",3.1162313);
		//-->3.12
		//반올림함.
	}
}
