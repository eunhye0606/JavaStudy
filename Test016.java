/*==============================================
■■■자바의 개요 및 특징 ■■■

// 변수와 자료형
// 변수와 자료형 실습 및 테스트 : BufferedReader 클래스

// 사용자로부터 이름, 국어점수, 영어점수 , 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 
// 국어 점수 입력:
// 영어 점수 입력:
// 수학 점수 입력:

//====[결과]====
// 이름 : 
// 총점 :
// 계속하려면 아무 키나 누르세요......
=============================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test016
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//방법2. 
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr);


		//주요 변수 선언
		String name;
		int k,e,m,sum;
		//헝가리식
		//String strName;
		//int nkor, nEng, nMat;


		//연산 및 처리
		System.out.print("이름을 입력하세요 : "); //왜 줄바꿈 .?
		name = br.readLine();

		System.out.print("국어 점수 입력 : "); 
		k = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 입력 : ");
		e = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 입력 : ");
		m = Integer.parseInt(br.readLine());


		// 각 점수 변수에 담겨있는 데이터 
		//종합하여 총점 산출해서
		//sum 변수에 대입
		sum = k + e + m;

		//결과 출력
		System.out.printf("\n\n====[결과]====\n 이름 : %s\n 총점 : %d\n",name,sum);
		//방법2.노가다.
		//System.out.println("\n\n====[결과]====\n이름 : " + name + "\n총점 : " + sum);

	}
}

/*
이름을 입력하세요 : 홍은혜
국어 점수 입력 : 100
영어 점수 입력 : 20
수학 점수 입력 : 40


====[결과]====
 이름 : 홍은혜
 총점 : 160
계속하려면 아무 키나 누르십시오 . . .
*/