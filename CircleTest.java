/*=====================================
■■■ 클래스와 인스턴스 ■■■
======================================*/

//※ Test073.java 파일과 세트 ~!!


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CircleTest
{
/*
	// -- 멤버 변수 → 주요 속성(데이터)
	int r; //반지름
	final double PI = 3.141592; // 원주율 (변수의 상수화)

	// 멤버 메소드 → 주요 기능(메소드)
	// 반지름 입력 기능 → 메소드 정의

	
	void input() throws IOException
	{
		//BufferedReader 기반의 인스턴스 생성.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	// 넓이 계산 기능 → 메소드 정의

	double calArea()
	{
		double area = r * r * PI;
		return area;
	}

	// 둘레 계산 기능 → 메소드 정의
	double length()
	{
		double length = r * 2 * PI;
		return length;
	}
	// 결과 출력 → 메소드 정의
	void print(double a, double b)
	{
		System.out.println(">> 반지름이 " + r + "인 원의");
		System.out.println(">> 넓이는 : " + a);
		System.out.println(">> 둘레는 : " + b);	
	}
	
}
*/


	
	//속성 == 데이터.
	int r;
	//--반지름		//얘가 여기 선언돼서 input에서 초기화된 r 값을 다른 곳에서 
							// 매개변수로 안받고도 맘껏 불러다 쓰는것!! 전역변수라서1!!!
	final double PI = 3.141592;

	//기능 == 메소드

	void input() throws IOException		//반지름 입력 받기
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}
	
	double circleArea()	//원의 넓이 구하기
	{
		double circleArea;
		circleArea = r * r * PI;
		return circleArea;
	}
	
	double circleLength()	//원의 둘레 구하기
	{
		double circleLength;
		circleLength = r * 2 * PI;
		return circleLength;		// -- return이 있으니까 무조건 앞에 자료형 줘야지. 
									//    매개변수 받는건 선택임.
									//    여기서는 매개변수가 전역변수로 r로 되어있어서
									//    손에 닿으니까 따로 뭐 받는다고 말안한거
									// return 값 반환이니까 앞에 무슨타입 반환할것이다. 말하기.
	}

	void circlePrint(double s,double l)	//출력하기
	{
		System.out.println("반지름이 " + r + "인 원의 ");
		System.out.printf("넓이 : %.2f\n",s);
		System.out.printf("둘레 : %.2f\n",l);
	}
	
}