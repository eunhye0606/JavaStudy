/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/
// if 문
//if ~ else 문 실습

//1. 프로그램을 작성할 때 주어진 조건에 따라
//   분기 방향을 정하기 위해 사용하는 제어문에는
//   if문, if~else문, 조건연산자, 복합if문(if문 중첩),
//   switch 문이 있다.

//2. if문은 if 다음의 조건이 참일 경우,
//   특정 문장을 수행하고자 할 때 사용되는 구문이다.

// ◎ 과제 → 카페 
//사용자로부터 임의의 연도를 입력받아
//입력받은 연도가... 윤년인지 평년인지 판별하여
//그 결과를 출력하는 프로그램을 구현한다.
//단, 입력은 BufferedReader의 readLine()을 활용하고
//if 조건문을 활용하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2012
// 2021년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2022
// 2022년 → 평년
// 계속하려면 아무 키나 누르세요...

// ※ 2월이 28일까지 있는 해 → 평년
//		    29일까지 있는 해 → 윤년
// ※ 윤년의 판별 조건
//    연도가 4의 배수이면서 100의 배수가 아니거나
//    400의 배수이면 윤년이다.
//    그렇지 않으면 평년이다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int nUserYear; //사용자 입력 년도 담는 변수
		
		System.out.print("임의의 연도 입력 : ");  //사용자에게 묻기
		nUserYear = Integer.parseInt(br.readLine()); //사용자가 입력한 값 int로 변환 후 변수에 담기

		if (nUserYear % 4 == 0 && nUserYear % 100 != 0) //4의 배수이면서 100의 배수가 아니다.
		{
			System.out.printf("%d년 → 윤년",nUserYear);
			
		}
		else if (nUserYear % 400 == 0)  //400의 배수이다.
		{
			System.out.printf("%d년 → 윤년",nUserYear);
		}
		else if (nUserYear % 4 != 0) //4의 배수가 아니다. 
		
		{
			System.out.printf("%d년 → 평년",nUserYear);

		}
		else 
//여기 없어도 실행되는데 왜 그럴까요? 
//→ 변수에 저장해서 결과를 나중에 출력하는거면 
//자바가 그러면 저기 없는거면 어캄 ㅠㅠ 해서 컴파일 에러1
			System.out.print("알 수 없음.");
	
		System.out.println();

	
	}
}
/*
임의의 연도 입력 : 2000
2000년 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2012
2012년 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2022
2022년 → 평년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 002022
2022년 → 평년
계속하려면 아무 키나 누르십시오 . . .
→ 아~ 앞에 0이 붙는 숫자 다 버리고 2022로 판별하는구낭 ~ 
*/