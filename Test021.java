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

public class Test021
{
	public static void main(String[] args)
	{

		//주요 변수 선언
		Scanner sc = new Scanner(System.in);      //sc.next()할라고 선언. 디폴트값임.
		
		String name;
		int k, e, m, sum;


		// System.out.println("\"); //-->컴파일에러
		// 왜냐면 자바는 \이거 보고 아 ~ \s ? \d? 이러고 있음.
		// 그래서 \이거 문자로 쓰고 싶으면 \\두개~


		//연산 및 처리
		System.out.print("이름,국어,영어,수학 입력(『,』구분) : ");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");		//이거에서 위에 sc에 기능 추가해줌
																	// sc덮어쓰기
		//               ---------- 
		//		         이연주,90,80,70
		//sc = new Scanner("이연주,90,80,70").useDelimiter("\\s*,\\s*);
		//                                    ==사용 구분자   \s*,\s*
		//                                                 ------------
		//                                              모든문자열, 모든문자열
		// 그렇다면 구분자는 한번만 하면 계속 콤마로 구분하나? 
		//--> 이거한번 해보자!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1



		//그리고 콤마 구분이니까
		//, 앞뒤에 스페이스있으면 int타입이 아니라 런타임에러
		//


		name = sc.next();
		k = sc.nextInt();
		e = sc.nextInt();
		m = sc.nextInt();

		sum = k + e + m;


		//결과 출력
		System.out.println("\n>> 이름 : " + name);
		System.out.println(">> 총점 : " + sum);

	}
}

/*
이름,국어,영어,수학 입력(『,』구분) : 은혜,100,90,20

>> 이름 : 은혜
>> 총점 : 210
계속하려면 아무 키나 누르십시오 . . .
*/