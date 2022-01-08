/*==============================================
■■■자바의 개요 및 특징 ■■■

// 자바의 기본 입출력 : java.util.Scanner

//※ java.util.Scanner
//	 단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//   디폴트(default)로 사용되는 단락문자는 공백이다.
//   작성된 다음 토큰은 『next()』 메소드를 사용
//   다른 형태(자료형)의 값으로 변환할 수 있다.
=============================================*/


import java.util.Scanner;
//java.util.Scanner sc = new java.util.Scanner(System.in);
//이라고 매번 쓰는거도 가능은 함.

public class Test020
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);

		String name;
		int k, e, m;
		int sum;


		// 연산 및 처리
		// - 사용자에게 안내 메세지 출력
		System.out.print("이름 국어 영어 수학 입력 (공백 구분) : ");
		
		// - 사용자가 입력한 데이터를 각 변수에 한 번에 담아내기
		name = sc.next();
		k = sc.nextInt();
		e = sc.nextInt();
		m = sc.nextInt();


		// - 총점 산출

		sum = k + e + m;

		// 결과 출력

		System.out.println();
		System.out.println(">> 이름 : " + name);
		System.out.println(">> 총점 : " + sum);
		/*
		(1). 스페이스 무한해도 공백 하나로 인지
		(2). 엔터도 공백으로 인지
		(3). name,k,e,m인데 하나 부족하면 당연히 안넘어가
		(4). 많으면 m 뒤로 무시함.
		*/

	}
}

/*
이름 국어 영어 수학 입력 (공백 구분) : eh 80 90 40

>> 이름 : eh
>> 총점 : 210
계속하려면 아무 키나 누르십시오 . . .
*/