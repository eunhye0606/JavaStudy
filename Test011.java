/*==============================================
■■■자바의 개요 및 특징 ■■■

//변수와 자료형
//나눗셈 연산 실습
===============================================*/



public class Test011
{
	public static void main(String[] args)
	{
		// 정수와 정수의 나눗셈(몫 반환)
		double a = 1 / 2;
		//double a = 0; 몫 반환, 자동 형 변환
		System.out.println("double a : " + a);


		double b = 1/2 + 1/2;
		System.out.println("double b : " + b);


		//피 연산자로 실수가 포함되어 있는 나눗셈
		double c = 1 / 2.0;
		System.out.println("double c : " + c);
		//실수 기반의 연산 수행.

		double d = 3/2 + 1/2;
		System.out.println("double d : " + d);

		double e = 3/2 + 1/2.0;
		System.out.println("double e : " + e);



	}
}

//실행 결과
/*
double a : 0.0
double b : 0.0
double c : 0.5
double d : 1.0
double e : 1.5
계속하려면 아무 키나 누르십시오 . . .
*/