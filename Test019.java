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


public class Test019
{
	public static void main(String[] args)
	{
		//BufferedReader처럼 인스턴스 선언.
		//Scanner 클래스 기반의 인스턴스 생성

		Scanner sc = new Scanner(System.in);
		//Scanner 안에 통역기(Like new InputStreamReader)
		//new InputStreamReader 없어도 됨.
		//IOException 없어도 돼
		//이미 인증 받은 놈임.


		//기능↑ 성능↓
		String name;

		int kor, eng, mat;

		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		//BufferedReader readLine();
		//과 같은 일 수행
		//문자열 출력.

		//kor = Interger.parseInt(sc.next());
		//이 짓 ㄴㄴ
		
		//next(); --> 문자열로 
		//nextInt(); --> 정수로 등등 다 있음 sc에는
		//★별도의 형변환과정 거칠 필요 없다.

		
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();


		System.out.println(">>이름 : " + name);
		System.out.println(">>총점 : " + (kor + eng + mat));
	}
}

/*
이름을 입력하세요 : 홍은혜
국어 점수 입력 : 20
영어 점수 입력 : 40
수학 점수 입력 : 100
>>이름 : 홍은혜
>>총점 : 160
계속하려면 아무 키나 누르십시오 . . .
*/