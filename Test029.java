/*==============================================
■■■연산자(Operator)■■■
//삼항 연산자 == 조건 연산자

/*
 피연산자 연산자 피연산자 연산자 피연산자
 -------         --------        --------
   1항              2항             3항

  피연산자 ? 피연산자 : 피연산자
  -------    --------   --------
    1항        2항         3항


 1항의 연산 결과 → true  → 2항 수행
 				 → false → 3항 수행

*/
//=============================================*/

//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 짝수인지 홀수인지 판별하는 프로그램 구현
//단, 조건연산자(삼항연산자)를 활용하여 작성할 수 있도록 하여라.

// 실행 예)
// 임의의 정수 입력 : 255
// 
// == [ 판별 결과 ] ==
// 255 → 홀수
// ===================
//계속하려면 아무 키나 누르세요....
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test029
{
	public static void main(String[] args) throws IOException
	{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int n;	//사용자가 입력하는 임의의 정수
	String strResult;	//홀수 짝수 결과 담는 변수

	System.out.print("임의의 정수 입력 : ");
	n = Integer.parseInt(br.readLine());

	//홀수인지 짝수인지에 대한 판별 연산
	// ________ ? ________ : ________;
	//   수식1      수식2      수식3
	//
	//   수식1 : 참(true) 또는 거짓(false)을 반환
	//   관계, 논리 연산자.
	//   수식2 :  수식1의 처리 결과가 참(true)일 경우 수행
	//   수식3 :  수식1의 처리 결과가 거짓(false)일 경우 수행

	//   입력받은 정수(n)가 홀수인지 짝수인지 확인
	//   → n을 2로 나누어서 나머지가 0이면			→  짝수
	//                                0이 아니면	→  홀수

	strResult = (n % 2 == 0) ? "짝수" : "홀수";
	// strResult = (4 % 2 == 0) ? "짝수" : "홀수";
	// strResult = (0 == 0) ? "짝수" : "홀수";
	// strResult = true ? "짝수" : "홀수";
	// strResult = "짝수";


	System.out.println();
	System.out.println(" == [판별 결과] ==");
	System.out.printf(" %d → %s\n", n,strResult);
	System.out.println(" ================= ");
	}
}

/*
임의의 정수 입력 : 93

 == [판별 결과] ==
93 → 홀수
 =================
계속하려면 아무 키나 누르십시오 . . .
*/