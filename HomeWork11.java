 /*===============================================
				■■■ 만년달력■■■
================================================*/ 

// 다음과 같은 기능의 프로그램을 구현한다.

// 실행 예)
// 『연도』를 입력하세요 : 2020
// 『월』를 입력하세요 : 6

/*
       [2020년 6월]

   일 월 화 수 목 금 토
   ====================
             1  2  3  4
   5  6  7  8  9  10 11
   12 13 14 15 16 17 18
   19 20 21 ....

   계속하려면 아무 키나 ...
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class HomeWork11
{
	public static void main(String[] args) throws IOException
	{

		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 배열 선언 및 초기화
		// -- 요일 담는 배열
		char [] weekDay = {'일','월','화','수','목','금','토'}; 

		// -- 각 달이 담고 있는 마지막 날짜(매 월의 최대 날짜)
		int [] day = {31,28,31,30,31,30,31,31,30,31,30,31};

		// 주요 변수 선언
		int y,m; // -- 사용자에게 받은 연도, 월
		int w; // -- 사용자에게 받은 월의 시작 요일.

		//사용자에게 입력받기 : 연도
		do
		{
			System.out.print(" 『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1); // -- 입력받은 연도가 1년보다 작으면 다시 물어봐

		//사용자에게 입력받기 : 월
		do
		{
			System.out.print(" 『월』를 입력하세요 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12); // -- 입력받은 월이 
		                    // -- 1월 ~ 12월이 아니면.. 다시 물어봐

		
		// 윤년 계산해서 2월이 28일인지 29일인지 정하기
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			day[1] = 29;
		}
		
		int nalsu = 0; // 입력달 -1까지 전체일수


		// -- 1. 입력년도 -1까지 전체일수
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// -- 2. 1번 + 입력 월 -1까지 전체일수
		for (int i = 0;i < m-1 ;i++ )
		{
			nalsu += day[i];
		}

		// 사용자가 입력한 달의 시작 요일 

		//여기서부터다시.!!!!!!!!!!!!!!!!!!!!

		int userStartWeekDay = nalsu % 7 -1;
		//1 → 월 ..


		//출력(달력 그리기)
		System.out.println(); 
		System.out.printf("\t[ %d년 %d월 ]\n",y,m);
		System.out.println();

		// -- 요일 출력
		for (int i = 0 ;i<weekDay.length ;i++ )
		{
			System.out.printf("%3c",weekDay[i]);
		}
		System.out.println();

		// -- 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		//    입력 달 : 2022년 1월. 토요일 시작. 
		// -- userStartWeekDay == 6
		for (int i =0;i<userStartWeekDay ;i++ )
		{
			System.out.print("넘   ");
		}
		System.out.printf("%4d",1);
		

		// -- 확인사항
		// -- 날짜가 다 채워지면 개행 안하기 해야함
		// --2022 4월확인
		

		
	}
}