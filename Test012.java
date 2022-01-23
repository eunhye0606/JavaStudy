/*==============================================
■■■자바의 개요 및 특징 ■■■

//퀴즈
//사전에 부여된 반지름 정보를 통해
//원의 넓이와 둘레를 구하는 프로그램을 구현한다.
// -> 반지름 : 10

//원의 넓이: 반지름 * 반지름 * 3.141592
//원의 둘레: 반지름 * 2 * 3.141592

//실행 예)
//넓이 : xxxxx
//둘레 : xxxxx
//계속 ~~~~~~~~~~~~~누르세요........


===============================================*/
public class Test012
{
	public static void main(String[] agrs)
	{

/*
		//주요 변수 선언
		int r = 10;  //반지름
		//double pi = 3.141592;  //파이값
														 //※ final --> 변수의 상수화하는 키워드.
														 //변수는 수시로 변할 수 있어서
														 //상수는 안변해, 이름 없는 특징.
														 //그래서 상수화 ~ 임.
														 //final 변수는 대문자로 쓰는 암묵적 룰임!
														 //다 대문자면 RAINBOWCOLOR이면 뭐가 어디까지인지 몰라서
														 //언더바스코어 표기법씀
														 //RAINBOW_COLOR 

		final double PI = 3.141592;
		//pi = 3.5;  --> final 붙어서 안돼.
	

		//연산 및 처리

		//double area, length;
		double s = r * r * PI;  //넓이 
		double l = r * 2 * PI;  //둘레

		//결과 출력
		System.out.println("넓이 : " + s);
		System.out.println("둘레 : " + l);

*/


		int r;
		final double PI;
		double area, length;
		

		r = 10;
		PI = 3.141592;
		area = r * r * PI;
		length = r * 2 * PI;


		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);

		System.out.printf("넓이 : %f.9\n", area); // --> 포맷팅 권법, %랑 f 사이에 소숫점 자리 ~ 까지 표기.
		System.out.format("넓이 : %.2f%n" , length);


	}
}


/*

실행 결과
넓이 : 314.1592
둘레 : 62.83184
계속하려면 아무 키나 누르십시오 . . .

*/
