/*==============================
   ■■■연산자(Operator)■■■
=================================*/

//조건 연산자 == 삼항 연산자

//사용자로부터 임의의 연도를 입력받아
//입력받은 연도가... 윤년인지 평년인지 판별하여
//그 결과를 출력하는 프로그램을 구현한다.
//단, 입력은 BufferedReader의 readLine()을 활용하고
//조건 연산자를 활용하여 연산을 수행할 수 있도록 한다.

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



public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year; // 입력한 연도
		String strResult; // 판별 결과

		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());


		strResult = year%4 == 0 && year%100 != 0 || year%400==0 ? "윤년": "평년";
		System.out.printf("%d년 → %s\n", year,strResult);



/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 연도 입력 : ");

		int nUserYear; //사용자가 입력한 값
		
		boolean yoonYear1, yoonYear2; //윤년조건
		String strResult; //최종 결과

		nUserYear = Integer.parseInt(br.readLine());


		yoonYear1 = ((nUserYear % 4) == 0) && ((nUserYear % 100) != 0);
		yoonYear2 = (nUserYear % 400) == 0;
		

		strResult = yoonYear1 ? "윤년" : (yoonYear2 ? "윤년" : "평년");

		System.out.println(nUserYear + "년" + " → " + strResult);
*/
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
*/