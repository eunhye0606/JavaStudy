/*==============================================
■■■자바의 개요 및 특징 ■■■

//퀴즈
// 직사각형의 넓이와 둘레를 구하는 프로그램을 작성한다.
//가로 : 10, 세로 : 20
===============================================*/

public class Test013
{
	public static void main(String[] args)
	{
		int h = 10;  //세로
		int v = 20;  //가로

		//int h = 10, v = 20;
		//선언 및 초기화 한번에 두개

		int area, length; //넓이, 둘레 변수 선언
		length = (h + v) * 2; //둘레
		area = h * v;  //넓이


		//출력
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);

		System.out.printf("넓이는 : %d\n" , area);
		System.out.format("둘레는 : %d%n" , length);


	}
}
/*
실행결과
넓이 : 200
둘레 : 60
넓이는 : 200
둘레는 : 60
계속하려면 아무 키나 누르십시오 . . .
*/