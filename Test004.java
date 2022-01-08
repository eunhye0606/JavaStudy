/*======================================
   ■■■ 자바 기본 프로그래밍 ■■■
=========================================*/

// 변수와 자료형


public class Test004
{
	public static void main(String[] args)
	{
		//변수 선언
		int a;
		
		//변수 초기화(==변수 a 에 10 대입)
		a = 10;

		//변수 선언 및 초기화 (선언과 대입을 한번에)
		int b = 20;

		// 변수 선언
		int c;

		//연산 및 처리

		c = a + b;


		//테스트
		//System.out.println(a);
		// --> 10

		//System.out.println(b);
		//--> 20
		
		//System.out.println(c);
		//--> 에러 발생(컴파일 에러, javac.exe가 찾음.) cf.런타임에러 
		// 에러 발생 시점으로 구분. 
		//런타임에러: 개발자의 의도와 다른 형태로 사용자가 사용할 때 날 경우있음.
		//알파(개발자), 베타(!개발자), 클로즈(특정 사용자), 오픈(아무나) 테스트

		System.out.println(c);
		//--> 30

		// ※ 덧셈 연산자(+)
		//	  피 연산자 중 어느 하나라도 문자열 형태이면
		//    산술연산자로써의 기능 ㄴㄴ
		//    문자열 결합 연산자로 기능

		/*System.out.print(a);
		System.out.print(b);
		System.out.print(c);*/

		System.out.println(a + " " + b + " " + c);
		// --> 10 20 30

		System.out.println("a의 값:" + a);
		System.out.println("b의 값:" + b);
		System.out.println("c의 값:" + c);
		//--> a의 값: 10 ...

		// + 연산자를 사용하는 과정에서
		// 피연산자 중 문자열이 포함되어 있어서
		// 문자열 결합 연산자로 활용
		// 처리 결과는 문자열 형태로 반환


		//추가 확인 및 관찰
		System.out.println(1 + 2);	//산술연산
		//-->3
		System.out.println("1" + 2);	//문자열결합연산
		//-->12
		System.out.println(1 + "2");	//문자열결합연산
		//-->12
		System.out.println("1" + "2");	//문자열결합연산
		//-->12
		System.out.println("1 + 2");	//문자열
		//-->1 + 2
		System.out.print("a + b 는" +  a+b);
		//--> a + b는 1020

	}
}