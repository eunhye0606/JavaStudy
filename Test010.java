/*==============================================
■■■자바의 개요 및 특징 ■■■

//변수와 자료형
//변수와 자료형 실습 및 테스트 : char
===============================================*/


public class Test010
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		char ch1, ch2, ch3; //char 2바이트 문자형


		int a; // 췍췍~~!!!!!!!!!!
		int a1;

		//연산 및 처리(대입 연산)
		ch1 = 'A';
		// ''는 문자
		//"" 문자열

		ch2 = '\n';
		//개행 문자 , 따로가 아님.

		ch3 = '대';
		a = ch1;  
		//췍~~~~~~~~!!!!!!!!!!!!
		//아스키문자, 자동형변환

		a1 = (int)ch1; 
		//자동형변환 위배는 아니지만 알려줄라고 명시적형변환 가능.


		

		// 결과 출력
		System.out.println("ch1 : "+ ch1);
		System.out.println("ch2 : "+ ch2);
		System.out.println("ch3 : "+ ch3);
		System.out.println("a : " + a);
		System.out.println("a1 : " + a1);



	}

}

//실행 결과
/*
ch1 : A
ch2 :

ch3 : 대
a : 65
a1 : 65
계속하려면 아무 키나 누르십시오 . . .

*/
